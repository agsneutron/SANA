package com.sanaTF.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanaTF.model.ApplicationContextProvider;
import com.sanaTF.model.Mensajes;
import com.sanaTF.model.Solicitudes;
import com.sanaTF.model.TipoDireccion;
import com.sanaTF.model.TipoIdentificacion;
import com.sanaTF.model.Usuarios;
import com.sanaTF.service.SolicitudesService;
import com.sanaTF.servlet.DownloadFileServlet;

import safisrv.ws.schemas.AltaSolicitudCreditoRequest;
import safisrv.ws.schemas.AltaSolicitudCreditoResponse;
import safisrv.ws.schemas.SAFIServicios;
import safisrv.ws.schemas.SAFIServiciosServiceLocator;
import safisrv.ws.schemas.SolAltaClienteRequest;
import safisrv.ws.schemas.SolAltaClienteResponse;

import safisrv.ws.schemas.AltaGrupoWSRequest;
import safisrv.ws.schemas.AltaGrupoWSResponse;
import safisrv.ws.schemas.AltaSolicitudGrupalWSRequest;
import safisrv.ws.schemas.AltaSolicitudGrupalWSResponse;



import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;

import com.itextpdf.text.Image;

import com.itextpdf.text.Paragraph;

import com.itextpdf.text.pdf.PdfWriter;

@Controller
public class SolicitudGrupalController {
	
	@Autowired
	private SolicitudesService solicitudesService;
	private DownloadFileServlet fileServlet;
	
	@RequestMapping({"/solicitud_grupal","/"})
	public String doLogin(HttpSession session,Map<String, Object> map,HttpServletRequest request){
		//Solicitudes solicitudesResult = new Solicitudes();
		boolean rolAdministrador = request.isUserInRole("Administrador");
		String regresa="login";
		String idSolicitud = request.getParameter("Folio");
        
		if (rolAdministrador){
			Solicitudes searchedSolicitudes = solicitudesService.getSolicitudes(Integer.parseInt(idSolicitud));
			map.put("solicitud", searchedSolicitudes);
			map.put("idgrupo", perteneceGrupo(Integer.parseInt(idSolicitud)));
			map.put("cobradores",listaCobradores());
			map.put("tipoIdentificacion",listaTiposIdentificacion());
			map.put("tipoDireccion",listaTiposDireccion());
			regresa = "solicitud_grupal";
		}
		return regresa;
	}
	
	@RequestMapping(value="/solicitud_grupal.do", method=RequestMethod.POST)
	public String doActions(HttpSession session,@ModelAttribute Solicitudes solicitud, BindingResult result, @RequestParam String action, Map<String, Object> map,HttpServletRequest request,HttpServletResponse response) throws Exception{
		String redirecciona ="solicitud_grupal";
		String Error="";
		boolean rolAdministrador = request.isUserInRole("Administrador");
		boolean rolCaptura = request.isUserInRole("Captura");	
		int idCliente=0;
		int idClienteSana=0;
		
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
			case "rechazar":
				guardaRechazar(solicitud.getIdSolicitud());	
				Solicitudes searchedSolicitud = solicitudesService.getSolicitudes(solicitud.getIdSolicitud());
				map.put("solicitud", searchedSolicitud);
				map.put("idgrupo", perteneceGrupo(searchedSolicitud.getIdSolicitud()));
				map.put("cobradores",listaCobradores());
				map.put("tipoIdentificacion",listaTiposIdentificacion());
				map.put("tipoDireccion",listaTiposDireccion());
				break;
			case "aceptar":
				Mensajes mensaje = new Mensajes();
				Solicitudes searchedSolicitudes = solicitudesService.getSolicitudes(solicitud.getIdSolicitud());
				Error=guardaAceptar(solicitud.getUser_id(),solicitud.getIdSolicitud(),solicitud);
				if (Error==""){
					
					idClienteSana = searchedSolicitudes.getCliente().getIdClienteSANA();
					if (idClienteSana==0) {
						request.setAttribute("scriptError","alertify.alert('entra');");
						mensaje=guardaAltaClienteSolicitud(solicitud);
						request.setAttribute("scriptError","alertify.alert('pasa alta cliente');");
						idCliente = mensaje.getIdSolicitud();
						if (idCliente != -1) {
							guardaidClienteSANA(idCliente, searchedSolicitudes);						
							request.setAttribute("scriptError","alertify.alert('se actializó corretamente el cliente');");
						    
						}else{
							request.setAttribute("scriptError","alertify.alert('" + mensaje.getMensaje() + "');");
						}
					}else{
						idCliente=idClienteSana;
						request.setAttribute("scriptError","alertify.alert('el cliente ya existe');");
					}
				}else{
					request.setAttribute("scriptError","alertify.alert('"+ Error +", Debe Capturar todos los datos requeridos');");
				}
				map.put("solicitud", searchedSolicitudes);
				map.put("idgrupo", perteneceGrupo(solicitud.getIdSolicitud()));
				map.put("cobradores",listaCobradores());
				map.put("tipoIdentificacion",listaTiposIdentificacion());
				map.put("tipoDireccion",listaTiposDireccion());
				break;			
		}				
		
		return redirecciona;
	}
	
	
	public void descargaFoto(@ModelAttribute Solicitudes solicitud,HttpServletRequest request,HttpServletResponse response, String nombreFoto) throws Exception{
		//String nombreFoto = request.getParameter("nombreFoto");
				
				
				
				String filePath = "C:/Users/dds/Downloads/" + nombreFoto;
				File downloadFile = new File(filePath);
				FileInputStream inStream = new FileInputStream(downloadFile);
				// if you want to use a relative path to context root:
				
				
				// obtains ServletContext
				ServletContext context = request.getServletContext();
				
				// gets MIME type of the file
				String mimeType = context.getMimeType(filePath);
				if (mimeType == null) {
					// set to binary type if MIME mapping not found
					mimeType = "application/octet-stream";
				}
				System.out.println("MIME type: " + mimeType);
				
				// modifies response
				response.setContentType(mimeType);
				response.setContentLength((int) downloadFile.length());
				
				// forces download
				String headerKey = "Content-Disposition";
				String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
				response.setHeader(headerKey, headerValue);
				
				// obtains response's output stream
				OutputStream outStream = response.getOutputStream();
				
				byte[] buffer = new byte[4096];
				int bytesRead = -1;
				
				while ((bytesRead = inStream.read(buffer)) != -1) {
					outStream.write(buffer, 0, bytesRead);
				}
				
				inStream.close();
				outStream.close();
	}
	
	
	
	public void imprimeFoto(HttpServletRequest request,HttpServletResponse response) {

        try {
        	String ruta=request.getContextPath();
        	
        	response.sendRedirect(request.getContextPath()+"/solicitud");
              OutputStream file = response.getOutputStream();//new FileOutputStream(new File("C:/PDF_Java4s.pdf"));
	          Document document = new Document();
	          PdfWriter.getInstance(document, file);

			//Inserting Image in PDF
			     Image image = Image.getInstance ("C:/Users/dds/Downloads/chamarra.JPG");
			     image.scaleAbsolute(120f, 60f);//image width,height	
			
			 //Now Insert Every Thing Into PDF Document
		         document.open();//PDF document opened........			       

					document.add(image);

					document.add(Chunk.NEWLINE);   //Something like in HTML :-)

					document.add(new Paragraph("Dear Java4s.com"));
					document.add(new Paragraph("Document Generated On - "+new Date().toString()));	

					document.add(Chunk.NEWLINE);   //Something like in HTML :-)							    

					
					
					 
					
					//descargaPDF(request,response,file);
					
				document.close();
		         file.close();
		        

            System.out.println("Pdf created successfully..");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void descargaPDF(HttpServletRequest request,HttpServletResponse response, OutputStream archivo) throws Exception{
		//String nombreFoto = request.getParameter("nombreFoto");
				
				
				
								
				// gets MIME type of the file
				String mimeType = "application/pdf";
				if (mimeType == null) {
					// set to binary type if MIME mapping not found
					mimeType = "application/octet-stream";
				}
				System.out.println("MIME type: " + mimeType);
				
				// modifies response
				response.setContentType(mimeType);
				//response.setContentLength((int) archivo.length());
				
				// forces download
				String headerKey = "Content-Disposition";
				String headerValue = String.format("attachment; filename=\"%s\"", "archivoPDF");
				response.setHeader(headerKey, headerValue);
				
				// obtains response's output stream
				OutputStream outStream = archivo;
				
				byte[] buffer = new byte[4096];
				int bytesRead = -1;
				
				outStream.write(buffer);
				outStream.close();
	}
	
	
	public ArrayList listaCobradores(){
		ArrayList lista=new ArrayList();
		String query="Select A.* from User A,Usuarios_Roles B " 
					+ " where A.User_Id = B.user_id and rol_id=3 and Activo='S'";

		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				Usuarios R=new Usuarios(rs.getInt("User_Id"),rs.getString("Usuario"),rs.getString("Contrasena"),rs.getString("ReContrasena"),rs.getString("nombre"),rs.getString("direccion")
						,rs.getString("telefono"),rs.getString("email"),rs.getInt("meta"),null,null);
				lista.add(R);
				
			}
			rs.close();				
			c.close();
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return lista;
	}
	
	
	public ArrayList listaTiposIdentificacion(){
		ArrayList lista=new ArrayList();
		String query="SELECT * FROM dbsanatf.tipo_identificacion";

		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				TipoIdentificacion R=new TipoIdentificacion(rs.getInt("idTipoIdentificacion"),rs.getInt("idEmpresa"),rs.getString("nombre"),rs.getInt("numeroCaracteres"),rs.getString("esOficial"));
				lista.add(R);
				
			}
			rs.close();				
			c.close();
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return lista;
	}
	
	public ArrayList listaTiposDireccion(){
		ArrayList lista=new ArrayList();
		String query="SELECT * FROM dbsanatf.tipo_direccion";

		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				TipoDireccion R=new TipoDireccion(rs.getInt("idTipoDireccion"),rs.getString("nombre"),rs.getString("esOficial"));
				lista.add(R);
				
			}
			rs.close();				
			c.close();
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return lista;
	}
	
	public String guardaAceptar(int userId, int idSolicitud, Solicitudes solicitud){
		String Error = "";
		String query="update solicitudes set User_Id = " + userId
					+ ", estatus = 1"
					+ " where idSolicitud = " + idSolicitud;
		
		if (solicitud.getCliente().getTitulo()==null){
			Error = "Debe capturar el título";
		}else if(solicitud.getCliente().getDireccionOficial()==null){
			Error = "Debe indicar si la dirección es oficial";
		}
		else if(solicitud.getCliente().getNumeroIdentificacion()==null){
			Error = "Debe capturar el número de identificación";		
		}
		else if(solicitud.getCliente().getIdTipoIdentificacion()==0){
			Error = "Debe indicar el tipo de identificación";
		}
		else if(solicitud.getCliente().getIdentificacionOficial()==null){
			Error = "Debe indicar si la identificación es oficial";
		}
		else if(solicitud.getCliente().getIdTipoDireccion()==0){
			Error = "Debe indicar el tipo de dirección";
		}
		else if(solicitud.getCliente().getCurp()==null){
			Error = "Debe capturar la CURP";
		}
		else if(solicitud.getCliente().getRfc()==null ){
			Error = "Debe capturar el RFC";
		}
		else if(solicitud.getCliente().getTelefonolParticular()==null ){
			Error = "Debe capturar el teléfono particular";	
		}
		else if(solicitud.getCliente().getTelefonoCelular()==null ){
			Error = "Debe capturar el teléfono celular";
		}
		else if(solicitud.getCliente().getMail()==null ){
			Error = "Debe capturar el correo electónico";
		}
		
		if (Error ==""){
			String queryCliente="update clientes set titulo = '" + solicitud.getCliente().getTitulo() + "'" 
					+ ", direccionOficial = '" + solicitud.getCliente().getDireccionOficial() + "'" 
					+ ", numeroIdentificacion = '" + solicitud.getCliente().getNumeroIdentificacion() + "'" 
					+ ", idTipoIdentificacion =  " + solicitud.getCliente().getIdTipoIdentificacion()
					+ ", identificacionOficial = '" + solicitud.getCliente().getIdentificacionOficial() + "'"
					+ ", idTipoDireccion =  " + solicitud.getCliente().getIdTipoDireccion()
					+ ", Curp =  '" + solicitud.getCliente().getCurp()  + "'"
					+ ", Rfc =  '" + solicitud.getCliente().getRfc()  + "'"
					+ ", telefonolParticular =  '" + solicitud.getCliente().getTelefonolParticular()  + "'"
					+ ", telefonoCelular =  '" + solicitud.getCliente().getTelefonoCelular()  + "'"
					+ ", mail =  '" + solicitud.getCliente().getMail()  + "'"
					+ " where idCliente = " + solicitud.getIdCliente();
			
			DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
			Connection c;	    	
			try {
				c = ds.getConnection();
				Statement stmt = c.createStatement();
				stmt.execute(query);
				stmt.execute(queryCliente);
				c.close();
	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Error= "Ocurrió el siguiente error en el registro de Clientes : " + e.getMessage() ;
				System.out.println("Error al dar de alta al cliente: " + e.getMessage() + " titulo: " + solicitud.getCliente().getTitulo());
				e.printStackTrace();
			} 
		}
		return Error;		
	}
	
	
	
	public void guardaidClienteSANA(int idClienteSANA, Solicitudes solicitud){		
				
		String queryCliente="update clientes set idClienteSANA =" + idClienteSANA
				+ " where idCliente = " + solicitud.getIdCliente();
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();			
			stmt.execute(queryCliente);
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
				
	}
	
	public void guardaCreditoSafi(String idCreditoSafi, Solicitudes solicitud){		
		
		String querySolicitud="update solicitudes set noCreditoSafi = '" + idCreditoSafi
				+ "' where idSolicitud = " + solicitud.getIdSolicitud();
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();			
			stmt.execute(querySolicitud);
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
				
	}
	
	
	
	public Integer perteneceGrupo(int idSolicitud){		
		String query="Select if (idgrupo is null,0,idgrupo) idgrupo from solicitudes "
					+ " where idSolicitud = " + idSolicitud;

		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;
		int esgrupo=0;
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				if (rs.getInt("idgrupo")>0){
					esgrupo=1;
				}
			}
			rs.close();				
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
			
		return esgrupo;
	}
	
	public Integer obtenIdMunicipioSafi(int idCliente){	
		String query="select  municipios.MunicipioID from clientes,municipios"
				+ " where clientes.idMunicipio=municipios.id"
				+ " and clientes.entidadFederativaNacimiento = municipios.estado_id"
				+ " and clientes.idCliente=" + idCliente;
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;
		int municipioID=0;
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				municipioID=rs.getInt("MunicipioID");
			}
			rs.close();				
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
			
		return municipioID;
	}
	
	public Integer obtenIdColoniaSafi(int idCliente){	
		String query="select  colonias.ColoniaID from clientes,colonias"
				+ " where clientes.idColonia = colonias.id"
				+ " and clientes.entidadFederativaNacimiento = colonias.estado_id"
				+ " and clientes.idMunicipio = colonias.municipio_id"
				+ " and clientes.idCliente=" + idCliente;
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;
		int municipioID=0;
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				municipioID=rs.getInt("ColoniaID");
			}
			rs.close();				
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
			
		return municipioID;
	}
	
	public void guardaRechazar(int idSolicitud){		
		String query="update solicitudes set estatus = 0"
					+ " where idSolicitud = " + idSolicitud;

		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			stmt.execute(query);
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
				
	}
	
	public Mensajes guardaAltaClienteSolicitud(@ModelAttribute Solicitudes solicitud){
		
		Solicitudes S = solicitudesService.getSolicitudes(solicitud.getIdSolicitud());
		SAFIServiciosServiceLocator locator = new SAFIServiciosServiceLocator();
		SAFIServicios servicio;
		
		Calendar c = new GregorianCalendar();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String annio2 = Integer.toString(c.get(Calendar.YEAR)+1);
		String fecha = annio + "-" + mes + "-" + dia;
		String fechaVencimiento = annio2 + "-" + mes + "-" + dia;
		int idCliente=-1;
		
		Mensajes mensaje = new Mensajes();
		mensaje.setMensaje("");
		mensaje.setIdSolicitud(-1);
		
		
		
		try {
			servicio = locator.getSAFIServiciosSoap11();
			SolAltaClienteRequest req = new SolAltaClienteRequest();
			
			/*para cambiar notaci�n cient�fica a decimal*/
			BigDecimal d1 = new BigDecimal(String.valueOf(S.getNegocioGiro().getIdActividadBMX()));
			String claveBMX = d1.toPlainString();
			BigDecimal d2 = new BigDecimal(String.valueOf(S.getNegocioGiro().getIdActividadFR()));
			String claveFR = d2.toPlainString();
			int municipioID=obtenIdMunicipioSafi(S.getCliente().getIdCliente());
			int coloniaID = obtenIdColoniaSafi(S.getCliente().getIdCliente());
			
		/*1*/	req.setActividadBMX(claveBMX);//(String.valueOf(S.getNegocioGiro().getIdActividadBMX()));
		/*2*/	req.setActividadFR(claveFR); //(String.valueOf(S.getNegocioGiro().getIdActividadFR()));
		/*3*/	req.setApMaterno(S.getCliente().getApellidoMaterno());
		/*4*/	req.setApMaternoConyuge("XXXXXXX");
		/*5*/	req.setApPaterno(S.getCliente().getApellidoPaterno());
		/*6*/	req.setApPaternoConyuge("XXXXXXX");
		/*7*/	req.setCalle(S.getCliente().getCalle());
		/*8*/	req.setClaveUsuario(S.getUsuario().getUsuario());
		/*9*/	req.setCodigoPostal(S.getCliente().getCp());
		/*10*/	req.setColonia(String.valueOf(coloniaID));
		/*11*/	req.setCURP(S.getCliente().getCurp());
		/*12*/	req.setDispositivo("android");
		/*13*/	req.setEsOficial(S.getCliente().getIdentificacionOficial());
		/*14*/	req.setEstado(String.valueOf(S.getCliente().getEntidadFederativaDomicilio()));
		/*15*/	req.setEstadoCivil("S");
		/*16*/	req.setEstadoNacConyuge("15");
		/*17*/	req.setEstadoNacimiento(String.valueOf(S.getCliente().getEntidadFederativaNacimiento()));
		/*18*/	req.setFechaExpedicion(fecha);
		/*19*/	req.setFechaNacConyuge(fecha);
		/*20*/	req.setFechaVencimiento(fechaVencimiento);
		/*21*/	req.setFecNacimiento(S.getCliente().getFechaNacimiento());
		/*22*/	req.setFolio(S.getFolioSolicitud());
		/*23*/	req.setFolioIdentiConyuge(S.getCliente().getNumeroIdentificacion());
		/*24*/	req.setLocalidad("1");
		/*25*/	req.setMail(S.getCliente().getMail());
		/*26*/	req.setMunicipio(String.valueOf(municipioID));
		/*27*/	req.setNacionalidad(S.getCliente().getNacionalidad());
		/*28*/	req.setNacionalidadConyuge("N");
		/*29*/	req.setNumero("0");
		/*30*/	req.setNumeroDireccion(S.getCliente().getNumeroExterior());  //no s� que sea
		/*31*/	req.setNumIdentificacion(S.getCliente().getNumeroIdentificacion());
		/*32*/	req.setOficial(S.getCliente().getDireccionOficial());
		/*33*/	req.setPaisNacimiento(String.valueOf(S.getCliente().getPaisNacimiento()));
		/*34*/	req.setPaisNacimientoConyuge(String.valueOf(S.getCliente().getPaisNacimiento()));
		/*35*/	req.setPaisResidencia(String.valueOf(S.getCliente().getPaisNacimiento()));
			//req.setPrimerNombre(S.getCliente().getNombre());
		/*36*/	req.setPrimerNombre(S.getCliente().getNombre());
		/*37*/	req.setPrimerNombreConyuge("XXXXXX");
		/*38*/	req.setPromotorActual("1"); //req.setPromotorActual(String.valueOf(S.getUser_id()));
		/*39*/	req.setPromotorInicial("1"); //req.setPromotorInicial(String.valueOf(S.getUser_id()));
		/*40*/	req.setRFC(S.getCliente().getRfc());
		/*41*/	req.setRFCConyuge("XXXXXXXXXXXXX");
		/*42*/	req.setSectorGeneral("31");  // empresas, cat�logo de sectores
		/*43*/	req.setSegundoNombre("");
		/*44*/	req.setSegundoNombreConyuge("xxxxx");
		/*45*/	req.setSexo(S.getCliente().getSexo());
		/*46*/	req.setSucursal("1");
		/*47*/	req.setTelefono(S.getCliente().getTelefonoCelular());
		/*48*/	req.setTercerNombre(""); 
		/*49*/	req.setTercerNombreConyuge("XXXX");
		/*50*/	req.setTipoDireccion(String.valueOf(S.getCliente().getIdTipoDireccion()));    //cat�logo tipo de direcci�n
		/*51*/	req.setTipoIdentiConyuge("1");
		/*52*/	req.setTipoIdentificacion(String.valueOf(S.getCliente().getIdTipoIdentificacion()));
		/*53*/	req.setTitulo(S.getCliente().getTitulo());
			
			
			SolAltaClienteResponse res;
				try {
					res = servicio.solAltaCliente(req);
					String respuesta = res.getMensajeRespuesta();
					mensaje.setMensaje(respuesta);
					if (res.getCodigoRespuesta().compareTo("00") ==0){ // si genera el registro del cliente.
						idCliente = Integer.parseInt(res.getClienteID());
						mensaje.setIdSolicitud(idCliente);
					}
					System.out.println("Respuesta: " + respuesta + " idCliente= " + idCliente);
					
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();	
					System.out.println("Error al dar de alta al cliente: " + e.getMessage() + " titulo: " + S.getCliente().getTitulo());
					mensaje.setMensaje("Error al dar de alta al cliente: " + e.getMessage() + " titulo: " + S.getCliente().getTitulo());
					mensaje.setIdSolicitud(-1);
				}
				
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al crear request de alta de cliente: " + e.getMessage());
			mensaje.setMensaje("Error al crear request de alta de cliente: " + e.getMessage());
			mensaje.setIdSolicitud(-1);
		}

		
		return mensaje;
	}
	




	

}
