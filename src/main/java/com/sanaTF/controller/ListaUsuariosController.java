package com.sanaTF.controller;


import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import com.sanaTF.model.Usuarios;
import com.sanaTF.service.UsuariosService;

import safisrv.ws.schemas.*;

import java.util.List;


@Controller
public class ListaUsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@RequestMapping({"/listausuarios"})
	public String listado(HttpSession session,Map<String, Object> map,HttpServletRequest request) throws RemoteException, ServiceException{
		Usuarios usuariosResult = new Usuarios();
		Usuarios usuarios = new Usuarios();	
		boolean rolAdministrador = request.isUserInRole("Administrador");
		boolean rolCaptura = request.isUserInRole("Captura");
		
		/*SAFIServiciosServiceLocator locator = new SAFIServiciosServiceLocator();
		SAFIServicios servicio = locator.getSAFIServiciosSoap11();
		
	
		ConsultaSaldoCreditoRequest req = new ConsultaSaldoCreditoRequest();
		
		req.setClaveUsuario("agarcia");
		req.setCreditoID("100015785");
		req.setDispositivo("android-1");
		req.setFolio("0001");
		ConsultaSaldoCreditoResponse res = servicio.consultaSaldoCredito(req);*/
		
	  
		
        //int permiso=permisos(request);
		if (rolAdministrador || rolCaptura){			
			List<Usuarios> resultado = (List<Usuarios>) usuariosService.getAllUsuarios();
			map.put("listaUsuarios", resultado);
			
		}
		
		return "listausuarios";
	}
	
	@RequestMapping(value="/listausuarios.do", method=RequestMethod.POST)
	public String doActions(HttpSession session,@ModelAttribute Usuarios usuarios, BindingResult result, @RequestParam String action, Map<String, Object> map,HttpServletRequest request) throws IOException{
		Usuarios usuariosResult = new Usuarios();		
		String redirecciona ="usuarios";
		boolean rolAdministrador = request.isUserInRole("Administrador");
		boolean rolCaptura = request.isUserInRole("Captura");
		
		
        //int permiso=permisos(request);
		if (rolAdministrador || rolCaptura){
				
				Authentication usuauthentication = SecurityContextHolder.getContext().getAuthentication();
		        User usu = (User)usuauthentication.getPrincipal();				
				Iterator<?> ListaAuth = usu.getAuthorities().iterator();		
				
				String idUsuario = request.getParameter("action");
				
				while (ListaAuth.hasNext()){
					System.out.println("Sesion: " + usu.getUsername() + " " + ListaAuth.next());	
				}
				
					//busca el usuario mediante su id
				Usuarios searchedUsuarios = usuariosService.find(Integer.parseInt(idUsuario)) ;
						            
				if (searchedUsuarios != null) {
					usuariosResult = searchedUsuarios;
				}
				else{	
					usuariosResult = new Usuarios();
					request.setAttribute("msgBusca","No existe información del usuario que busca.");
				}	
				
				map.put("usuarios", usuariosResult);				
		
		}else{
		     redirecciona="permisoerror";
		}
		return redirecciona;
	}
	
}
