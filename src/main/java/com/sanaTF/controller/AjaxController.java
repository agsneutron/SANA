package com.sanaTF.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Random;
import com.sanaTF.model.DistanceMatrixAplicacion;
import com.sanaTF.model.PromotoresRuta;
import com.sanaTF.model.ListaCobradores;
import com.sanaTF.model.PromotoresLL;
import com.sanaTF.model.Lugares;
import com.sanaTF.model.Mensajes;
import com.sanaTF.model.Pagos;

import com.sanaTF.model.RutaOptima;
import com.sanaTF.service.ClientesService;
import com.sanaTF.model.CobroRealiza;
import com.sanaTF.controller.CobradoresConsolaController;

import java.io.IOException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;
import javax.xml.rpc.ServiceException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.sanaTF.model.ApplicationContextProvider;
import com.sanaTF.model.Clientes;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;

import safisrv.ws.schemas.ConsultaSaldoCreditoRequest;
import safisrv.ws.schemas.ConsultaSaldoCreditoResponse;
import safisrv.ws.schemas.PagoCreditoRequest;
import safisrv.ws.schemas.PagoCreditoResponse;
import safisrv.ws.schemas.SAFIServicios;
import safisrv.ws.schemas.SAFIServiciosServiceLocator;


@Controller
public class AjaxController {
	
	private GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyCh3BwQ9kuSt5lb2hoRd5Y7pLk0IhN8src");
	private String[] vectorLatLng = new String[]{};
	private int[] vectorOrden = new int[]{};
	private double[] vectorMetros = new double[]{};
	
	
	
	@RequestMapping(value = "/consultaGeneral", method = RequestMethod.GET)
    public @ResponseBody
    String getReporteGeneral(HttpServletRequest request,HttpServletResponse response,Map<String, Object> map) {
		String fechaInicio = request.getParameter("fechaInicio");
		String fechaFinal = request.getParameter("fechaFinal");
        Random rand = new Random();
        float r = rand.nextFloat() * 100;
        String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
        System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + new Date().toString());
        //response.setContentType("application/json");
        map.put("fechas", "fechas");
		return reporte(fechaInicio,fechaFinal);
		
        
    }
	
	@RequestMapping(value = "/consultaCobradores", method = RequestMethod.GET)
    public @ResponseBody
    void getReporteCobradores(HttpServletRequest request,HttpServletResponse response,Map<String, Object> map) {
		String fechaInicio = request.getParameter("fechaInicio");
		String fechaFinal = request.getParameter("fechaFinal");
		
		Map<String, Object> hmap = new HashMap<String, Object>();
		hmap.put("lista", reporteCobradores(fechaInicio,fechaFinal));	
		
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("application/json");
		
		try {
			mapper.writeValue(response.getOutputStream(), hmap);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        
    }
	
	
	@RequestMapping(value = "/rutaOptima", method = RequestMethod.GET)
    public @ResponseBody void getRutaOptima(HttpServletRequest request,HttpServletResponse response,Map<String, Object> map) {
		
		
		List<RutaOptima> rutas = new LinkedList<RutaOptima>();
		Map<String, Object> hmap = new HashMap<String, Object>();
		CobradoresConsolaController cobradores = new CobradoresConsolaController();
		
		int m=0,i=0;
		double Latitud=0;
		double Longitud=0;
		String nombreCliente = "";
		int lugarVisitado=0;
		
		String[] vectorRutas = new String[]{};
		String userId = request.getParameter("userId");
		String fechaInicio = request.getParameter("fechaInicio");
		String fechaFinal = request.getParameter("fechaFinal");
		ArrayList listaCobradores = lugaresCobradoresConsola(userId,fechaInicio,fechaFinal);
		
		String rutaSS="";
		if (listaCobradores.size()>1){
			rutaSS=ruta_optima(recorreLista(listaCobradores));
		
			rutaSS="";
			for(m=0;m<=vectorMetros.length-1;m++){
				rutaSS += String.valueOf(m+1) + " -> <a href='javascript:pintaRuta(" + String.valueOf(m) +"," + String.valueOf(m+1) + ");'>" + String.valueOf(vectorMetros[m]) + "mts.</a> -> "; 
			}
			rutaSS += "1";
			for(m=0;m<=vectorOrden.length-1;m++){
				i=0;
				for (String retval: vectorLatLng[vectorOrden[m]-1].split(",")){
					
					if (i==0){Latitud= Double.parseDouble(retval);}
					else{
						if (i==1){
							Longitud= Double.parseDouble(retval);
						}else{
							if (i==2){
								nombreCliente=retval;
							}else{
								lugarVisitado=Integer.parseInt(retval);
							}	
						}	
					}
			         System.out.println(retval);
			        i +=1; 
			    }
	
				RutaOptima R = new RutaOptima(Latitud,Longitud,nombreCliente,rutaSS,lugarVisitado); 
				rutas.add(R);	
			}
		}  //if (listaCobradores.size()>1){
		hmap.put("rutaOptima", rutas);	
		hmap.put("clientesAsignados", cobradores.clientesAsignados(userId));
		hmap.put("montos", cobradores.reporteCobradoresConsola(userId, fechaInicio, fechaFinal, map));
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("application/json");
		
		try {
			mapper.writeValue(response.getOutputStream(), hmap);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
    }
	
	
	
	@RequestMapping(value = "/promotoresRuta", method = RequestMethod.GET)
    public @ResponseBody void getRutaPromotores(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> hmap = new HashMap<String, Object>();
		ArrayList listPromotores = promotoresRuta();
		
		
		hmap.put("lista", listPromotores);	
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("application/json");
		
		try {
			mapper.writeValue(response.getOutputStream(), hmap);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
    }
	
	
	
	
	@RequestMapping(value = "/promotoresLL", method = RequestMethod.GET)
    public @ResponseBody void getRutaPromotoresLL(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> hmap = new HashMap<String, Object>();
		String userId = request.getParameter("userId");
		ArrayList listPromotores = promotoresLatLng(userId);
		
		hmap.put("promotor", nombrePromotor(userId));
		hmap.put("lista", listPromotores);
		
		
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("application/json");
		
		try {
			mapper.writeValue(response.getOutputStream(), hmap);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
    }
	
	@RequestMapping(value = "/pagos", method = RequestMethod.GET)
    public @ResponseBody void getPagos(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> hmap = new HashMap<String, Object>();
		
		
			
		String sClientes = request.getParameter("clientes");
		String clientesArray[] = sClientes.split(",");
		ArrayList listPagos = pagos(sClientes);	
		Iterator<Pagos> it = listPagos.iterator();
		Pagos pago=null;
		CobroRealiza cobro =null;
		while(it.hasNext()){
			  pago = it.next();			  
			  cobro = enviaPagos(pago.getUsuario(),String.valueOf(pago.getCreditoId()),pago.getDispositivo(),pago.getFolio(),String.valueOf(pago.getPagoMontoCobrado()),String.valueOf(pago.getMontoGL()));
			  if (cobro!=null){
				  System.out.println(cobro.getMensajeRespuesta());
			  }
			//meter el guardado del pago en safi
		}
		
		hmap.put("lista", listPagos);	
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("application/json");
		
		try {
			mapper.writeValue(response.getOutputStream(), hmap);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
    }
	
	
	
	
	
	
	
	
	public CobroRealiza enviaPagos(String claveUsuario,String creditoId,String Dispositivo,String Folio,String monto,String montoGL){
		SAFIServiciosServiceLocator locator = new SAFIServiciosServiceLocator();
		SAFIServicios servicio;
		try {
			servicio = locator.getSAFIServiciosSoap11();
			PagoCreditoRequest req = new PagoCreditoRequest();
			
			req.setClaveUsuario(claveUsuario);
			req.setCreditoID(creditoId);
			req.setDispositivo(Dispositivo);
			req.setFolio(Folio);
			req.setMonto(monto);
			req.setMontoGL(montoGL);
			
			
			
				PagoCreditoResponse res;
				try {
					res = servicio.pagoCredito(req);
					CobroRealiza cobro = new CobroRealiza(res.getCreditoID(),res.getNumTransaccion(),res.getSaldoExigible(),
							res.getSaldoTotalActual(),res.getCodigoRespuesta(),res.getMensajeRespuesta());
					
					return cobro;
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
				
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	public String reporte(String fechaInicio, String fechaFinal){			
		String json = "" ;
		String query="select visitados,totalVisitar-visitados as porVisitar,cobranzaTotal, " 
		+ "cobranzaTotal-cobrado as porCobrar,cobrado "
		+ "from "
		+ "(SELECT count(*) visitados FROM dbsanatf.lugares_cobro "
		+ "where lugarVisitado=1 and fechaVisita between '" + fechaInicio + "' and '" + fechaFinal + "') A, "
		+ "(SELECT count(*) totalVisitar FROM dbsanatf.programacion_cobros where fechaCobro between '" + fechaInicio + "' and '" + fechaFinal + "') B, "
		+ "(SELECT sum(pagoCuota) cobranzaTotal FROM dbsanatf.lugares_cobro "
		+ "where fechaVisita between '" + fechaInicio + "' and '" + fechaFinal + "') C, "
		+ "(SELECT sum(pagoCuota) cobrado FROM dbsanatf.lugares_cobro "
		+ "where lugarVisitado=1 and fechaVisita between '" + fechaInicio + "' and '" + fechaFinal + "') D";
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
    	Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				JsonObject object = new JsonObject();
				object.addProperty("visitados", rs.getDouble("visitados"));
				object.addProperty("porVisitar", rs.getDouble("porVisitar"));
				object.addProperty("cobranzaTotal", rs.getDouble("cobranzaTotal"));
				object.addProperty("porCobrar", rs.getDouble("porCobrar"));
				object.addProperty("cobrado", rs.getDouble("cobrado"));
				object.addProperty("rangoFechas", "de " + fechaInicio + " a " + fechaFinal);
				 
				json = object.toString();
				System.out.println(json);
			}
			rs.close();				
			c.close();
			
			if(json==""){
				JsonObject object = new JsonObject();
				object.addProperty("visitados", 0);
				object.addProperty("porVisitar", 0);
				object.addProperty("cobranzaTotal", 0);
				object.addProperty("porCobrar", 0);
				object.addProperty("cobrado", 0);
				object.addProperty("rangoFechas", "de " + fechaInicio + " a " + fechaFinal);
				 
				json = object.toString();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
		return json;
		
	}
	
	public ArrayList reporteCobradores(String fechaInicio, String fechaFinal){			
		String json = "" ;
		ArrayList lista=new ArrayList();
		String query="Select * From "
		+" (SELECT C.User_Id,C.nombre,Sum(pagoCuota) Meta,count(A.idCliente) Visitar"
		+" FROM dbsanatf.lugares_cobro A, dbsanatf.solicitudes B, dbsanatf.User C"
		+" where A.idCliente = B.idCliente";
		if (fechaInicio==null){
			query +=" and fechaVisita = CURDATE()";
		}else{
			query +=" and fechaVisita between '" + fechaInicio + "' and '" + fechaFinal + "'";
		}    
		query +=" and B.User_id=C.User_Id"
		+" group by C.User_Id,C.nombre) AA,"

        +" (SELECT B.user_id,Sum(pagoCuota) cobro,count(A.idCliente) Visitado"
        +" FROM dbsanatf.lugares_cobro A, dbsanatf.solicitudes B"
        +" where A.idCliente = B.idCliente"
        +" and lugarVisitado=1 ";
		if (fechaInicio==null){
			query +=" and fechaVisita = CURDATE()";
		}else{
			query +=" and fechaVisita between '" + fechaInicio + "' and '" + fechaFinal + "'";
		}    
		query +=" group by B.user_id) BB"
        +" where AA.user_id = BB.user_id";
		
		
		
		
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				ListaCobradores R=new ListaCobradores(rs.getString("nombre"),rs.getDouble("Meta"),rs.getDouble("Visitar"),
						rs.getDouble("cobro"),rs.getDouble("Visitado"),rs.getDouble("user_id"));
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

	public String lugaresRuta(String fechaInicio, String fechaFinal,String userId){			
		String json = "" ;
		
		
		String query="SELECT C.nombre as usuario, CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,"
				+ " B.negocioHorario as horario,A.pagoCuota,A.pagoCobroRealizado,A.pagoMontoCobrado,A.descripcion"
				+ " B.negocioLatitud,B.negocioLongitud"
				+ " FROM dbsanatf.lugares_cobro A, dbsanatf.solicitudes B, dbsanatf.user C,dbsanatf.clientes D"
				+ " where A.idCliente = B.idCliente and B.user_id = " + userId;
				if (fechaInicio==null){
					query +=" and fechaVisita = CURDATE()";
				}else{
					query +=" and fechaVisita between '" + fechaInicio + "' and '" + fechaFinal + "'";
				}    
				query += " and B.User_id=C.User_id"
				+ " and A.idCliente = D.idCliente";
		
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
    	Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				JsonObject object = new JsonObject();
				object.addProperty("usuario", rs.getString("usuario"));
				object.addProperty("cliente", rs.getDouble("cliente"));
				object.addProperty("horario", rs.getDouble("negocioHorario"));
				object.addProperty("cuota", rs.getDouble("pagoCuota"));
				object.addProperty("cobroRealizado", rs.getDouble("pagoCobroRealizado"));
				object.addProperty("montoCobrado", rs.getDouble("pagoMontoCobrado"));
				object.addProperty("razon", rs.getDouble("descripcion"));
				object.addProperty("latitud", rs.getDouble("negocioLatitud"));
				object.addProperty("longitud", rs.getDouble("negocioLatitud"));
				object.addProperty("User_id", rs.getDouble("user_id"));
				 
				json = object.toString();
				System.out.println(json);
			}
			rs.close();				
			c.close();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
		return json;
		
	}
	
	
	public String ruta_optima(double[][] d)
	{
	  /*ALGORITMO DE OPTIMIZACION DE RUTA EN JAVASCRIPT 
	  ///Jos� Enrique Gonz�lez Cornejo, 01/05/2009
	  ///http://www.docirs.cl/ruta_optima.htm
	  ///http://www.docirs.cl/simulacion_aleatoria_ruta_optima.asp
	  ///La funci�n devuelve una cadena con un recorrido �ptimo,
	  ///desde el punto de vista, del M�todo Por Tramos DocIRS 
	  ///con la siguiente sintaxis: a1-->d[a1][a2]-->....,an-->d[an][1]-->a1
	  ///Se asume que vienen par�metros globales: numero_nodos, la matriz d[i][j]    cargada con sus correspondientes valores
	*/
		

	 int numero_nodos = d.length;
	 int[] ruta = new int[numero_nodos+1]; /// se guardar� el orden de recorrido de la ruta
	 double[] metros = new double[numero_nodos]; /// se guardar� el orden de recorrido de la ruta en metros
	 
	 int[] donde=new int[numero_nodos]; /// Almacena el punto donde estamos situados
	 double[] minimo=new double[numero_nodos]; /// Almacena el valor m�nimo d[i][j] seleccionado
	 int[] v=new int[numero_nodos+1]; /// Rotulaci�n de los nodos. Por simplicacion del algoritmo v(j)=j
	 int kkk=0; //Contador
	 double MMM=0;   //Comienza numero gande, se Almacena M�nimo
	 String restriccion=","; //Cadena donde se van guardando los nodos ya seleccionados.
	 int m; //iterador local
	 int i; //iterador local
	 int j; //iterador local
	 String nodo_doble;  //variable auxiliar para limpiar la duplicacion de rotulos en los tramos
	 String ss; //cadena resultante que contiene la serie de la ruta �ptima ,a1,a2,a3,.....,an,a1
	 
	 int punto1=0;
	 int punto2=0;
	 String tt;
	 //'=============================
	 donde[0] = 0;
	 v[0]=1;
	 for(j=1;j<numero_nodos;j++){
		 v[j]=j+1;
	 }
	 v[numero_nodos]=1;
	//'=============================

	 do{
		MMM = Math.pow(10,20);
		i = donde[kkk];
		kkk = kkk + 1;
		restriccion = restriccion + donde[kkk - 1] + ",";

	    for(j=1;j<numero_nodos;j++){
	    	if(i!= j){
	    		if(d[i][j] < MMM){
	    			tt="," + j + ",";
	                if(InStr(restriccion, tt)==0){
	                	MMM = d[i][j];
	                    donde[kkk] = j;
	                }
	    		}
	    	}
	    }
	                 
	    if(MMM == Math.pow(10,20)){
	    	minimo[kkk] = 0;
	    }else{
	    	minimo[kkk] = MMM;
	    }               
	}while (kkk<numero_nodos-1);
	/////////////////////////////
	ss = "";
	for(m = 0;m<=numero_nodos - 2;m++){
		punto1 = v[donde[m]];
		punto2 = v[donde[m + 1]];
		ss = ss + punto1 + "-->[" + d[punto1-1][punto2-1] + "]-->" + punto2 + "-->";
		if (m==0) {ruta[m]=punto1;}
		ruta[m+1]=punto2;
		metros[m]=d[punto1-1][punto2-1];
	}
	
	ruta[m+1]=1;
	metros[m]=d[punto2-1][0];
	vectorOrden = ruta;
	vectorMetros=metros;

	for(m=1;m<=numero_nodos;m++){
		nodo_doble = "-->" + m + "-->" + m + "-->";
		ss = ss.replace(nodo_doble, "-->" + m + "-->");
	}

	ss = ss + "["+d[punto2-1][0]+"]-->1";

	return ss; 
	}

	
	//public int InStr(String n, String s1, String s2){
	public int InStr(String n, String s1){
		//int numargs=InStr.arguments.length;
		//if(numargs<3){
			return n.indexOf(s1)+1;
		//}else{
		//	return s1.indexOf(s2, n)+1;
		//}
	}
	
	
	
	
	public ArrayList lugaresCobradoresConsola(String userId,String fechaInicio, String fechaFinal){	
		ArrayList lista=new ArrayList();
		
		String query= " SELECT 0 idCliente,'SANA' cliente,'09:00' horaDesde,'21:00' horaHasta,latitud negocioLatitud,longitud negocioLongitud,nombre negocioNombre,1 lugarVisitado FROM dbsanatf.sanaubicacion"
				+ " UNION SELECT D.idCliente, CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,"
				+ " concat(B.horaDesde) as horaDesde,concat(B.horaHasta) horaHasta,"
				+ " B.negocioLatitud,B.negocioLongitud,"
				+ " B.negocioNombre, A.lugarVisitado"
				+ " FROM dbsanatf.lugares_cobro A, dbsanatf.solicitudes B, dbsanatf.User C,dbsanatf.clientes D,dbsanatf.bachtable E"
				+ " where A.idCliente = B.idCliente and B.user_id = " + userId
				+ " and fechaVisita between '" + fechaInicio + "' and '" + fechaFinal + "'"
				+ " and B.User_id=C.User_id"
				+ " and A.idCliente = D.idCliente"
				+ " and A.idCliente = E.ClienteId";

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Lugares R=new Lugares(rs.getInt("idCliente"),rs.getString("cliente"),rs.getString("horaDesde"),rs.getString("horaHasta"),rs.getDouble("negocioLatitud"),rs.getDouble("negociolongitud"),
						rs.getString("negocioNombre"),rs.getInt("lugarVisitado"));
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
	
	
	public ArrayList promotoresRuta(){	
		ArrayList lista=new ArrayList();
		
		String query= "select U.User_Id,U.nombre promotor,Sum(meta) meta,"
			+ " (select count(*) from dbsanatf.promotores_detalle Det where Det.idPromotores = PD.idPromotores) visitados,"
			+ " (select count(*) from dbsanatf.promotores_detalle Det where Det.idPromotores = PD.idPromotores and solicitud is not null) solicitud"
			+ " from dbsanatf.User U"
			+ " left join dbsanatf.promotores P on U.User_Id = P.User_Id"
			+ " left join dbsanatf.promotores_detalle PD on P.idPromotores = PD.idPromotores"
			+ " Where P.fecha <= current_date()"
			+ " group by U.User_Id,U.nombre";

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				PromotoresRuta R=new PromotoresRuta(rs.getInt("User_Id"),rs.getString("promotor"),rs.getInt("meta"),rs.getInt("visitados"),rs.getInt("solicitud"));
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
	
	
	public ArrayList pagos(String clientes){	
		ArrayList lista=new ArrayList();
		
		String query= "SELECT C.Usuario as usuario,E.CreditoId,A.dispositivo,A.folio, A.pagoMontoCobrado,0 montoGL"
				+ " FROM dbsanatf.lugares_cobro A, dbsanatf.solicitudes B, dbsanatf.User C,dbsanatf.clientes D,dbsanatf.bachtable E"
				+ " where A.idCliente = B.idCliente and B.idCliente in (" + clientes + ")"
				+ " and B.User_id=C.User_id"
				+ " and A.idCliente = D.idCliente"
				+ " and D.idClienteSANA = E.ClienteId";

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Pagos R=new Pagos(rs.getString("usuario"),rs.getInt("CreditoId"),rs.getString("dispositivo"),rs.getString("folio"),rs.getDouble("pagoMontoCobrado"),rs.getDouble("montoGL"));
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
	
	public ArrayList promotoresLatLng(String UserId){	
		ArrayList lista=new ArrayList();
		
		String query= "select latitud,longitud,solicitud"
				+ " from dbsanatf.User U, dbsanatf.promotores P, dbsanatf.promotores_detalle PD"
				+ " Where P.fecha <= current_date()"
				+ " and U.User_Id = P.User_Id"
				+ " and P.idPromotores = PD.idPromotores"
				+ " and U.User_Id = " + UserId;

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				PromotoresLL R=new PromotoresLL(rs.getDouble("latitud"),rs.getDouble("longitud"),rs.getString("solicitud"));
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
	
	public String nombrePromotor(String UserId){	
		ArrayList lista=new ArrayList();
		String sNombre="";
		String query= "select U.nombre"
				+ " from dbsanatf.User U"
				+ " Where U.User_Id = " + UserId;

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				sNombre = rs.getString("nombre");				
			}
			rs.close();				
			c.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
		return sNombre;
		
	}
	
	public double[][] recorreLista(ArrayList lista){
		int i=0;
		int j=0;
		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		ArrayList copia = new ArrayList();
		copia = lista;
		Iterator<Lugares> listaIterator = lista.iterator();
		double[][] matriz = new double[lista.size()][lista.size()];
		String[] vectorLocal = new String[lista.size()];
		
		
		DistanceMatrixAplicacion distancia = new DistanceMatrixAplicacion(context);
		DistanceMatrix matrix=null;
		
		while(listaIterator.hasNext()){
			Lugares ruta = listaIterator.next();
			Iterator<Lugares> copiaIterator = copia.iterator();
			while(copiaIterator.hasNext()){
				Lugares rutaCopia = copiaIterator.next();
				if (j>=i) {	
					try {
						
							matrix = distancia.obtenDistancias(ruta.getLatitud() + "," + ruta.getLongitud(),rutaCopia.getLatitud() + "," + rutaCopia.getLongitud());
							matriz[i][j]=matrix.rows[0].elements[0].distance.inMeters;
							matriz[j][i]=matrix.rows[0].elements[0].distance.inMeters;
							
							if(i==0){
								vectorLocal[j] = rutaCopia.getLatitud() + "," + rutaCopia.getLongitud() + "," + rutaCopia.getCliente() + "," + rutaCopia.getLugarVisitado();
							}
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}	
				
				j+=1;
			}
			j=0;
			i+=1;
			
		}
		
		System.out.println(matriz.toString());
		vectorLatLng = vectorLocal;
		return matriz;
		
	}
	
	
}





