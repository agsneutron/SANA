

	package com.sanaTF.controller;

	import java.rmi.RemoteException;

	import java.util.Map;

	import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
	import javax.sql.DataSource;
import javax.xml.rpc.ServiceException;



	//import org.apache.tomcat.jni.User;
	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.stereotype.Controller;

	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;


	import com.sanaTF.model.ApplicationContextProvider;
	import com.sanaTF.service.GruposService;
	import com.sanaTF.model.Grupos;
	import com.sanaTF.model.Mensajes;
import com.sanaTF.model.Solicitudes;
import com.sanaTF.service.SolicitudesService;

import safisrv.ws.schemas.*;




	import java.sql.Connection;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;



@Controller
public class GruposContoller {
		
		@Autowired
		private GruposService gruposService;
		@Autowired
		private SolicitudesService solicitudesService;
				
		@RequestMapping({"/grupos"})
		public String doLogin(HttpSession session,Map<String, Object> map,HttpServletRequest request){
			boolean rolAdministrador = request.isUserInRole("Administrador");
			String regresa="login";
			String idGrupo = request.getParameter("Folio");
	        
			if (rolAdministrador){
				Grupos searchedGrupo= gruposService.getGrupo(Integer.parseInt(idGrupo));
				map.put("grupos", searchedGrupo);
				regresa = "grupos";
			}
			return regresa;
		}
		
		@RequestMapping(value="/grupos.do", method=RequestMethod.POST)
		public String doActions(HttpSession session,@ModelAttribute Grupos grupo, BindingResult result, @RequestParam String action, Map<String, Object> map,HttpServletRequest request,HttpServletResponse response) throws Exception{
			String redirecciona ="grupos";
			boolean rolAdministrador = request.isUserInRole("Administrador");
			boolean rolCaptura = request.isUserInRole("Captura");	
			int idGrupo=0;
			
			switch(action.toLowerCase()){	//only in Java7 you can put String in switch
				case "guardar":
					Mensajes mensaje = new Mensajes();
					Grupos searchedGrupos = gruposService.getGrupo(grupo.getIdGrupo());
					idGrupo = searchedGrupos.getIdGrupoSafi();
					if (idGrupo==0) {	
						if (todosTienenIdClienteSAFI(grupo.getIdGrupo())==1){
							request.setAttribute("scriptError","alertify.alert('" + guardaGrupoSafi(grupo) + "');");
						}else{
							request.setAttribute("scriptError","alertify.alert('Hay integrantes que aún no están en SAFI');");
						}    
					}else{
						request.setAttribute("scriptError","alertify.alert('El grupo ya existe');");
					}
					
					map.put("grupos", searchedGrupos);
					break;			
			}				
			
			return redirecciona;
		}
		
		public String actualizaGrupoSafi(String idGrupoSafi, Grupos grupo){		
			
			String querySolicitud="update grupos set idGrupoSafi = " + idGrupoSafi
					+ " where idgrupo = " +grupo.getIdGrupo();
			String respuesta="";
			
			DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
			Connection c;	    	
			try {
				c = ds.getConnection();
				Statement stmt = c.createStatement();			
				stmt.execute(querySolicitud);
				c.close();
				respuesta="exito";

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				respuesta="noexito";
			} 		
			return respuesta;		
		}
		
		
		public Integer todosTienenIdClienteSAFI(int idGrupo){		
			String query="SELECT distinct idClienteSANA "
					+ " FROM dbsanatf.clientes where idClienteSANA= 0 and idgrupo  =" + idGrupo;     

			
			DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
			Connection c;
			int todosTienen=1;
			try {
				c = ds.getConnection();
				Statement stmt = c.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				
				while (rs.next()) {
					if (rs.getInt("idClienteSANA")==0){
						todosTienen=0;
					}
				}
				rs.close();				
				c.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
				
			return todosTienen;
		}
		
		public Integer obtenIdSolicitud(int idGrupo){		
			String query="SELECT solicitudes.idSolicitud"
					+ " FROM solicitudes,clientes where solicitudes.idCliente = clientes.idCliente"
					+ " and clientes.idtipointegrante = 1"
					+ " and solicitudes.idgrupo=" + idGrupo;     

			
			DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
			Connection c;
			int idSolicitud=0;
			try {
				c = ds.getConnection();
				Statement stmt = c.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				
				while (rs.next()) {
						idSolicitud=rs.getInt("idSolicitud");
				}
				rs.close();				
				c.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
				
			return idSolicitud;
		}
		
		public Integer obtenTotalIntegrantes(int idGrupo){		
			String query="SELECT count(*) total "
					+ " FROM clientes where idgrupo=" + idGrupo;     

			
			DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
			Connection c;
			int total=0;
			try {
				c = ds.getConnection();
				Statement stmt = c.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				
				while (rs.next()) {
						total=rs.getInt("total");
				}
				rs.close();				
				c.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
				
			return total;
		}
		
		public String guardaGrupoSafi(@ModelAttribute Grupos grupo){
			
			Grupos S = gruposService.getGrupo(grupo.getIdGrupo());
			SAFIServiciosServiceLocator locator = new SAFIServiciosServiceLocator();
			SAFIServicios servicio;
			String respuesta ="";
			try {
				servicio = locator.getSAFIServiciosSoap11();
				AltaGrupoWSRequest req = new AltaGrupoWSRequest();
				
				req.setClaveUsuario(S.getUsuario().getUsuario());
				req.setDispositivo("Android");
				req.setFolio(String.valueOf(S.getIdGrupo()));
				req.setNombreGrupo(S.getNombre());
			
				String iDGrupo="";
				
				
				AltaGrupoWSResponse res;
					try {
						res = servicio.altaGrupoWS(req);
						respuesta = res.getMensajeRespuesta();
						if (res.getCodigoRespuesta().compareTo("0")==0){
							iDGrupo=res.getGrupoID();
							if (actualizaGrupoSafi(iDGrupo,S)=="exito"){
									respuesta=guardaSolicitudGrupalSafi(S);
							}else{
								respuesta = "Error al actualizar el id del grupo de SAFI";
							}		
						}
						System.out.println("respuesta: " + respuesta);					
						
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Error al dar de alta el grupo: " + e.getMessage());
						respuesta = "Error al dar de alta el grupo: " + e.getMessage();
					}
					
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error al crear el request de alta de grupo: " + e.getMessage());
				respuesta = "Error al crear el request de alta de grupo: " + e.getMessage();
			}
			
			return respuesta;	
		}
		
		public Integrante[] arregloIntegrantes(int idGrupo){
			String query="SELECT 0 as prospectoID,clientes.idClienteSANA as clienteID,"
					+ "uso_recursos.IdDestino as destinoCredito,"
					+ "uso_recursos.nombre as proyecto, solicitudes.creditoMonto as montoSolici, "
					+ "clientes.idtipointegrante as tipoIntegrante"
					+ " FROM solicitudes,clientes,uso_recursos "
					+ " where solicitudes.idCliente = clientes.idCliente"
					+ " and solicitudes.creditoIdUsoRecursos = uso_recursos.idUsoRecursos"
					+ " and solicitudes.idgrupo=" + idGrupo;
			
			DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
			Connection c;
			Integrante integrante[]=new Integrante[obtenTotalIntegrantes(idGrupo)];
			try {
				c = ds.getConnection();
				Statement stmt = c.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				int i=0;
				while (rs.next()) {
					Integrante I = new Integrante(rs.getString("prospectoID"),rs.getString("clienteID"),rs.getString("destinoCredito"),rs.getString("proyecto"),rs.getString("montoSolici"),rs.getString("tipoIntegrante"));
					integrante[i]=I;
					i++;
				}
				rs.close();				
				c.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
				
			return integrante;
			
		}
		
		
		public String guardaSolicitudGrupalSafi(@ModelAttribute Grupos grupo){
			
			Grupos S = gruposService.getGrupo(grupo.getIdGrupo());
			Solicitudes Sol = solicitudesService.getSolicitudes(obtenIdSolicitud(S.getIdGrupo()));
			SAFIServiciosServiceLocator locator = new SAFIServiciosServiceLocator();
			SAFIServicios servicio;
			String respuesta ="";
			
			
			try {
				servicio = locator.getSAFIServiciosSoap11();
				AltaSolicitudGrupalWSRequest req = new AltaSolicitudGrupalWSRequest();
				
				req.setClaveUsuario(S.getUsuario().getUsuario());
				req.setDispositivo("Android");
				req.setFolio(String.valueOf(S.getIdGrupo()));
				req.setCuentaCLABE(" ");
				req.setGrupoID(Integer.toString(S.getIdGrupoSafi()));
				req.setIntegrantes(arregloIntegrantes(S.getIdGrupo()));
				req.setPeriodicidad(String.valueOf(Sol.getFrecuencia().getClave_frecuencia_pago()));
				req.setPlazo(String.valueOf(Sol.getCreditoPlazo()));
				req.setProductoCreditoID(String.valueOf(Sol.getCreditoIdTipoCredito()));
				req.setTipoDispersion("C");
				req.setTipoPagoCapital("C");
	
				
			
				String idSolicitudGrupal="";
				
				
				AltaSolicitudGrupalWSResponse res;
					try {
						res = servicio.altaSolicitudGrupalWS(req);
						respuesta = res.getMensajeRespuesta();
						if (res.getCodigoRespuesta().compareTo("0")==0){
							//aquí falta que el ws de safi regrese el id de la solicitud que generó
						}
						System.out.println("respuesta: " + respuesta);					
						
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Error al dar de alta el grupo: " + e.getMessage());
						respuesta = "Error al dar de alta el grupo: " + e.getMessage();
					}
					
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error al crear el request de alta de grupo: " + e.getMessage());
				respuesta = "Error al crear el request de alta de grupo: " + e.getMessage();
			}
			
			return respuesta;	
		}
	
}


