package com.sanaTF.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanaTF.model.ApplicationContextProvider;
import com.sanaTF.model.ClientesAsignados;
import com.sanaTF.model.Clientes;

import com.sanaTF.model.DistanceMatrixAplicacion;
import com.sanaTF.model.Lugares;
import com.sanaTF.model.Mensajes;
import com.sanaTF.model.PromotoresRuta;
import com.sanaTF.model.Solicitudes;
import com.sanaTF.model.TablaRuta;
import com.sanaTF.service.ClientesService;
import com.sanaTF.service.SolicitudesService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;


@Controller
public class CobradoresConsolaController {
	
	private GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyCh3BwQ9kuSt5lb2hoRd5Y7pLk0IhN8src");
	private ClientesService clientesService;
	
	@RequestMapping({"/cobradores_consola","/"})
	public String doLogin(HttpSession session,Map<String, Object> map,HttpServletRequest request){
		
		boolean rolAdministrador = request.isUserInRole("Administrador");
		String regresa="login";
		ArrayList lista=new ArrayList();
		if (rolAdministrador){
			String fechaInicio = request.getParameter("fechaInicio");
			String fechaFinal = request.getParameter("fechaFinal");
			String userId = request.getParameter("user");
			lista=reporteCobradoresConsola(userId,fechaInicio,fechaFinal,map);
			String result="";
			
			
			DateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("es_ES"));
			SimpleDateFormat formato = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
			Date date;

				try {
					result = formato.format(formato1.parse(fechaInicio));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(result);

			
			
			//recorreLista(lugaresCobradoresConsola(userId,fechaInicio,fechaFinal));
			
			map.put("listaClientes", lista);
			map.put("clientesAsignados", clientesAsignados(userId));
			map.put("usuario",nombreUsuario(userId));
			map.put("fechas",result);
			regresa = "cobradores_consola";
		}
		return regresa;
	}
	
		
	
	
	public String nombreUsuario(String userId){
		String usuario = "";
		
		String query="SELECT nombre as usuario"
				+ " FROM dbsanatf.User "
				+ " where User_id = " + userId;


				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				usuario = rs.getString("usuario");
			}
			rs.close();				
			c.close();
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return usuario;
	}
	
	public ArrayList reporteCobradoresConsola(String userId,String fechaInicio, String fechaFinal,Map<String, Object> map){	
		ArrayList lista=new ArrayList();
		String cobro ="";
		String circulo ="glyphicon-remove-circle cobro-no";
		
		String query="SELECT C.nombre as usuario,C.Usuario claveUsuario,D.idCliente, CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,"
				+ " concat(B.horaDesde) as horaDesde,concat(B.horaHasta) horaHasta,E.MontoTotalExigible pagoCuota,A.pagoCobroRealizado,A.pagoMontoCobrado,A.descripcion,"
				+ " B.negocioLatitud,B.negocioLongitud,"
				+ " CONCAT(B.negocioCalle,' ',B.negocioNoExt,' ',(select nombre From colonias col where col.id = B.negocioIdColonia and col.estado_id = B.negocioIdEntidadFederativa ),"
				+ " ' ',(Select nombre from municipios M where M.estado_id = B.negocioIdEntidadFederativa and M.id = B.negocioIdMunicipio)) direccion,"
				+ " B.negocioNombre,A.CreditoId,folioSolicitud"
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
				cobro = rs.getString("pagoCobroRealizado");
				if (cobro.compareTo("1")==0){
					circulo="glyphicon-ok-circle cobro-ok";
				}else{
					circulo ="glyphicon-remove-circle cobro-no";
				}
				TablaRuta R=new TablaRuta(rs.getInt("idCliente"),rs.getString("cliente"),rs.getString("horaDesde"),rs.getString("horaHasta"),rs.getDouble("pagoCuota"),cobro,rs.getDouble("pagoMontoCobrado"),rs.getString("descripcion"),circulo,rs.getDouble("negocioLatitud"),rs.getDouble("negociolongitud"),
						rs.getString("direccion"),rs.getString("negocioNombre"),rs.getString("CreditoId"),rs.getString("folioSolicitud"),rs.getString("claveUsuario"));
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
	
	
	public ArrayList clientesAsignados(String userId){	
		ArrayList lista=new ArrayList();

		String query="SELECT CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,"
				+ " B.negocioLatitud,B.negocioLongitud"
				+ " FROM dbsanatf.lugares_cobro A, dbsanatf.solicitudes B, dbsanatf.User C,dbsanatf.clientes D"
				+ " where A.idCliente = B.idCliente and B.user_id = " + userId
				+ " and B.User_id=C.User_id"
				+ " and A.idCliente = D.idCliente";
				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {				
				ClientesAsignados R=new ClientesAsignados(rs.getString("cliente"),rs.getString("negocioLatitud"),rs.getString("negocioLongitud"));
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
	
	
	
	
	public double calcularDistanciaEntre(String[] origenes, String[] destinos) {
        
		DistanceMatrixAplicacion distancia = new DistanceMatrixAplicacion(context);
		/*try {
			distancia.obtenDistancias(origenes,destinos);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		
        return 0;


	}
	
	public ArrayList lugaresCobradoresConsola(String userId,String fechaInicio, String fechaFinal){	
		ArrayList lista=new ArrayList();
		
		String query= " SELECT 0 idCliente,'SANA' cliente,'09:00' horaDesde,'21:00' horaHasta,latitud negocioLatitud,longitud negocioLongitud,nombre negocioNombre FROM dbsanatf.sanaubicacion"
				+ " UNION SELECT D.idCliente, CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,"
				+ " concat(B.horaDesde) as horaDesde,concat(B.horaHasta) horaHasta,"
				+ " B.negocioLatitud,B.negocioLongitud,"
				+ " B.negocioNombre,A.lugarVisitado"
				+ " FROM dbsanatf.lugares_cobro A, dbsanatf.solicitudes B, dbsanatf.user C,dbsanatf.clientes D,dbsanatf.bachtable E"
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
	
	public void recorreLista(ArrayList lista){
		int i=0;
		int j=0;
		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		ArrayList copia = new ArrayList();
		copia = lista;
		Iterator<Lugares> listaIterator = lista.iterator();
		double[][] matriz = new double[lista.size()][lista.size()];
		
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
		
	}
	
}




