
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
import com.sanaTF.model.ListaGrupos;

@Controller
public class GruposListadoController {
	
	@RequestMapping({"/grupos_listado","/"})
	public String doLogin(HttpSession session,Map<String, Object> map,HttpServletRequest request){
		boolean rolAdministrador = request.isUserInRole("Administrador");
		String regresa="login";
        
		if (rolAdministrador){		
			
			map.put("listaGrupos", listaGrupos());			
			regresa = "grupos_listado";
		}
		return regresa;
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList listaGrupos(){	
		ArrayList lista=new ArrayList();
		
		String query="SELECT idgrupo,user_id,nombre,concat(date_format(fecha_registro,'%d'),'/',date_format(fecha_registro,'%m'),'/',date_format(fecha_registro,'%Y')) fecha_registro ,"
					+ " if (idGrupoSafi =0,'No asignado',idGrupoSafi) as idgruposafi "
					+ " FROM grupos"
					+ " where idgrupo>0";
							
		
		DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
		Connection c;	    	
		try {
			c = ds.getConnection();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				ListaGrupos R=new ListaGrupos(rs.getInt("idgrupo"),rs.getInt("user_id"),rs.getString("nombre"),rs.getString("fecha_registro"),rs.getString("idgruposafi"));
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
