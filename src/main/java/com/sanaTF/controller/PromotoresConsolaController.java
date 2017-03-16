

package com.sanaTF.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PromotoresConsolaController {
	@RequestMapping({"/promotores_consola","/"})
	public String doConsola(HttpSession session,Map<String, Object> map,HttpServletRequest request){
		boolean rolAdministrador = request.isUserInRole("Administrador");
		String regresa="login";
        
		if (rolAdministrador){
			regresa = "promotores_consola";
		}
		return regresa;
	}
	
}
