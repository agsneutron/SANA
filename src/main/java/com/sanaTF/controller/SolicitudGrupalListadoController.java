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
public class SolicitudGrupalListadoController {
	
	@RequestMapping({"/solicitudgrupal_listado","/"})
	public String doLogin(HttpSession session,Map<String, Object> map,HttpServletRequest request){
		boolean rolAdministrador = request.isUserInRole("Administrador");
		String regresa="login";
        
		if (rolAdministrador){		
			
			map.put("listaSolicitudes", listaSolicitudes());			
			regresa = "solicitudgrupal_listado";
		}
		return regresa;
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList listaSolicitudes(){	
		ArrayList lista=new ArrayList();
		
		String query="SELECT B.idSolicitud,F.idgrupo,F.nombre as grupo, if (C.nombre is null,'No asignado',C.nombre) as cobrador,"
				+ " if (G.nombre is null,'No asignado',G.nombre) as inspector,"
		+ " CONCAT(D.nombre,' ',D.apellidoPaterno,' ',D.apellidoMaterno) as cliente,"
		+ " fechaRegistro,if (estatus=1,'Aprobada','No Aprobada') estatus ,if (creditoMonto is null,0"
		+ " ,creditoMonto) MontoCredito, 0 adeudo"
		+ " FROM dbsanatf.solicitudes B"
		//+ " left join dbsanatf.lugares_cobro A on  B.idCliente = A.idCliente"
		+ " left join dbsanatf.User C on B.User_id=C.User_id"
		+ " left join dbsanatf.clientes D on B.idCliente = D.idCliente"
		+ " left join dbsanatf.bachtable E on D.idClienteSANA = E.ClienteId"
		+ " left join dbsanatf.grupos F on B.idgrupo=F.idgrupo"
		+ " left join dbsanatf.User G on G.User_id=B.idinspector"
		+ " where C.nombre is not null and B.idgrupo > 0"
		+ " and creditoIdRenovacionAumento not in (1,2)"
		+ " and B.idgrupo is not null order by B.idgrupo";
		
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				ListaSolicitudes R=new ListaSolicitudes(rs.getInt("idSolicitud"),rs.getString("grupo"),rs.getString("cobrador"),rs.getString("cliente"),rs.getString("inspector"),rs.getString("fechaRegistro")
						,rs.getString("estatus"),rs.getDouble("MontoCredito"),rs.getDouble("adeudo"));
				lista.add(R);
				
			}
			rs.close();				
			c.close();
			

		} catch (SQLException e) {			
			e.printStackTrace();
		} 
		
		return lista;
		
	}	

}
