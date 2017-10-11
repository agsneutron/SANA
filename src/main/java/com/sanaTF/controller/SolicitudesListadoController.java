package com.sanaTF.controller;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanaTF.model.ApplicationContextProvider;
import com.sanaTF.model.ListaSolicitudes;


@Controller
public class SolicitudesListadoController {
	@RequestMapping({"/solicitudes_listado","/"})
	public String doLogin(HttpSession session,Map<String, Object> map,HttpServletRequest request){
		boolean rolAdministrador = request.isUserInRole("Administrador");
		String regresa="login";
        
		if (rolAdministrador){		
			
			map.put("listaSolicitudes", listaSolicitudes());
			map.put("listaSolicitudesNuevas", listaSolicitudesNuevas());
			map.put("listaSolicitudesRenovadas", listaSolicitudesRenovadas());
			regresa = "solicitudes_listado";
		}
		return regresa;
	}
	
	public ArrayList listaSolicitudes(){	
		ArrayList lista=new ArrayList();
		
		String query="SELECT B.idSolicitud,folioSolicitud, if (C.nombre is null,'No asignado',C.nombre) as cobrador," 
					+ " CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,negocioNombre,"
					+ " fechaRegistro,if (estatus=1,'Aprobada','No Aprobada') estatus ,if (MontoCredito is null,0"
					+ " ,MontoCredito) MontoCredito, 0 adeudo"
					+ " FROM dbsanatf.solicitudes B"
					+ " left join dbsanatf.lugares_cobro A on  B.idCliente = A.idCliente"
					+ " left join dbsanatf.User C on B.User_id=C.User_id"
					+ " left join dbsanatf.clientes D on B.idCliente = D.idCliente"
					+ " left join dbsanatf.bachtable E on B.idCliente = E.ClienteId"
					+ " where C.nombre is not null and (B.idgrupo = 0 or B.idgrupo is null)"
					+ " and creditoIdRenovacionAumento not in (1,2)";

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				ListaSolicitudes R=new ListaSolicitudes(rs.getInt("idSolicitud"),rs.getString("folioSolicitud"),rs.getString("cobrador"),rs.getString("cliente"),rs.getString("negocioNombre"),rs.getString("fechaRegistro")
						,rs.getString("estatus"),rs.getDouble("MontoCredito"),rs.getDouble("adeudo"));
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
	
	
	public ArrayList listaSolicitudesNuevas(){	
		ArrayList lista=new ArrayList();
		
		String query="SELECT B.idSolicitud,folioSolicitud, if (C.nombre is null,'No asignado',C.nombre) as cobrador," 
					+ " CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,negocioNombre,"
					+ " fechaRegistro,if (estatus=1,'Aprobada','No Aprobada') estatus ,if (MontoCredito is null,0"
					+ " ,MontoCredito) MontoCredito, 0 adeudo"
					+ " FROM dbsanatf.solicitudes B"
					+ " left join dbsanatf.lugares_cobro A on  B.idCliente = A.idCliente"
					+ " left join dbsanatf.User C on B.User_id=C.User_id"
					+ " left join dbsanatf.clientes D on B.idCliente = D.idCliente"
					+ " left join dbsanatf.bachtable E on B.idCliente = E.ClienteId"
					+ " where C.User_id = 0 and (B.idgrupo = 0 or B.idgrupo is null)"
					+ " and creditoIdRenovacionAumento not in (1,2)";

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				ListaSolicitudes R=new ListaSolicitudes(rs.getInt("idSolicitud"),rs.getString("folioSolicitud"),rs.getString("cobrador"),rs.getString("cliente"),rs.getString("negocioNombre"),rs.getString("fechaRegistro")
						,rs.getString("estatus"),rs.getDouble("MontoCredito"),rs.getDouble("adeudo"));
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
	
	public ArrayList listaSolicitudesRenovadas(){	
		ArrayList lista=new ArrayList();
		
		String query="SELECT B.idSolicitud,folioSolicitud, if (C.nombre is null,'No asignado',C.nombre) as cobrador," 
					+ " CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,negocioNombre,"
					+ " fechaRegistro,if (estatus=1,'Aprobada','No Aprobada') estatus ,if (MontoCredito is null,0"
					+ " ,MontoCredito) MontoCredito, 0 adeudo"
					+ " FROM dbsanatf.solicitudes B"
					+ " left join dbsanatf.lugares_cobro A on  B.idCliente = A.idCliente"
					+ " left join dbsanatf.User C on B.User_id=C.User_id"
					+ " left join dbsanatf.clientes D on B.idCliente = D.idCliente"
					+ " left join dbsanatf.bachtable E on B.idCliente = E.ClienteId"
					+ " where creditoIdRenovacionAumento in (1,2) and (B.idgrupo = 0 or B.idgrupo is null)";

				
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				ListaSolicitudes R=new ListaSolicitudes(rs.getInt("idSolicitud"),rs.getString("folioSolicitud"),rs.getString("cobrador"),rs.getString("cliente"),rs.getString("negocioNombre"),rs.getString("fechaRegistro")
						,rs.getString("estatus"),rs.getDouble("MontoCredito"),rs.getDouble("adeudo"));
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
	
}
