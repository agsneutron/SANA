package com.sanaTF.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.axis.AxisFault;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.tomcat.util.codec.binary.Base64;
//import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sanaTF.model.ApplicationContextProvider;
import com.sanaTF.service.UsuariosService;
import com.sanaTF.model.Usuarios;
import safisrv.ws.schemas.*;


import com.sanaTF.model.UsuariosStatus;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.psd.PsdMetadataReader;
import com.drew.imaging.tiff.TiffMetadataReader;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.*;
import com.drew.metadata.MetadataException;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.exif.ExifThumbnailDirectory;
import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.ImageMetadataReader;

import java.security.MessageDigest;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.drew.lang.GeoLocation;


@Controller
public class UsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;
	
			
	@RequestMapping({"/usuarios"})
	public String setupForm(Map<String, Object> map,HttpServletRequest request) throws RemoteException{
		Usuarios usuarios = new Usuarios();		
		String redirecciona ="usuarios";
		boolean rolAdministrador = request.isUserInRole("Administrador");
		boolean rolCaptura = request.isUserInRole("Captura");
		
		SAFIServiciosSoap11Stub servicio = new SAFIServiciosSoap11Stub();
		ConsultaSaldoCreditoRequest req = new ConsultaSaldoCreditoRequest();
		ConsultaSaldoCreditoResponse res = new ConsultaSaldoCreditoResponse();
		
		//req.setClaveUsuario("1621");
		//req.setCreditoID("100015785");
		//res = servicio.consultaSaldoCredito(req);
		
        //int permiso=permisos(request);
		if (rolAdministrador || rolCaptura){
			map.put("usuarios", usuarios);						
		}else{
			redirecciona="permisoerror";
		}
		
		return redirecciona;
	}
	@RequestMapping(value="/usuarios.do", method=RequestMethod.POST)
	public String doActions(HttpSession session,@ModelAttribute Usuarios usuarios, BindingResult result, @RequestParam String action, Map<String, Object> map,HttpServletRequest request) throws Exception{
		Usuarios usuariosResult = new Usuarios();		
		String redirecciona ="usuarios";
		boolean rolAdministrador = request.isUserInRole("Administrador");
		boolean rolCaptura = request.isUserInRole("Captura");
		
		
        //int permiso=permisos(request);
		if (rolAdministrador || rolCaptura){
				
				Authentication usuauthentication = SecurityContextHolder.getContext().getAuthentication();
		        User usu = (User)usuauthentication.getPrincipal();				
				Iterator<?> ListaAuth = usu.getAuthorities().iterator();
				String Error="";
				
				
				while (ListaAuth.hasNext()){
					System.out.println("Sesion: " + usu.getUsername() + " " + ListaAuth.next());	
				}
				
				switch(action.toLowerCase()){	//only in Java7 you can put String in switch
				case "guardar":
					Error = alertaErrores(request,usuarios);
					if (Error.compareTo("")==0) {
					
						usuarios.setActivo(UsuariosStatus.S);
						
						if (usuarios.getContrasena().compareTo("")!=0){
							usuarios.setContrasena(md5(usuarios.getContrasena()));
						}
						
						
						if (usuarios.getUserId()==0){
							usuariosService.add(usuarios);
							request.setAttribute("scriptError","alertify.alert('El usuario se registró con éxito');");
						}else{
							if (usuarios.getContrasena().compareTo("")==0){
								Usuarios searchUsuario = usuariosService.find(usuarios.getUserId()) ;
								usuarios.setContrasena(searchUsuario.getContrasena());
								usuarios.setReContrasena(searchUsuario.getReContrasena());
							}
							
							usuariosService.edit(usuarios);
							request.setAttribute("scriptError","alertify.alert('El usuario se modificó con éxito');");
						}
					}else{
						request.setAttribute("scriptError","alertify.alert('" + Error + "');");
					}	
					
					usuariosResult = usuarios;
					break;
				case "modificar":								
					usuariosService.edit(usuarios);					
					break;				
				case "buscar":
					//busca el usuario mediante su id
					Usuarios searchedUsuarios = usuariosService.find(usuarios.getUserId()) ;
						            
					if (searchedUsuarios != null) {
						usuariosResult = searchedUsuarios;
					}
					else{	
						usuariosResult = new Usuarios();
						request.setAttribute("msgBusca","No existe información del usuario que busca.");
					}	
					
					break;
				}
				map.put("usuarios", usuariosResult);				
		
		}else{
		     redirecciona="permisoerror";
		}
		return redirecciona;
	}
	
	
	private static String md5(String clear) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] b = md.digest(clear.getBytes());

		int size = b.length;
		StringBuffer h = new StringBuffer(size);
		for (int i = 0; i < size; i++) {
			int u = b[i] & 255;
			if (u < 16) {
				h.append("0" + Integer.toHexString(u));
			} else {
				h.append(Integer.toHexString(u));
			}
		}
		return h.toString();
	}
	
	private String alertaErrores(HttpServletRequest request,@ModelAttribute Usuarios usuarios){
		String Error="";
		String nuevalinea = System.getProperty("line.separator");
		
		if (usuarios.getNombre().compareTo("")==0){
			Error += "Debe capturar el nombre del usuario.\\n";			
		}
		
		if (usuarios.getDireccion().compareTo("")==0){
			Error+="Debe capturar la dirección del usuario.\\n";			
		}
		
		if (usuarios.getUsuario().compareTo("")==0){
			Error+="Debe capturar su usuario.\\n";			
		}
		
		if (usuarios.getContrasena().compareTo(usuarios.getReContrasena())!=0){
			Error+="Las contraseñas no son iguales.\\n";			
		}
				
		return Error;
	}
	
	
	private int validaNumeroEspecial(String Numero){

        int Bandera=0;
        String n = Numero.substring(Numero.lastIndexOf(".")+1,Numero.length());        
        if(n.length() < 6 || Numero.lastIndexOf(".")==-1) {
        	Bandera = 0;          
        }else{          
        	Bandera = 1;
        }
        return Bandera;
    }
	
			public ArrayList<Integer> permisos(HttpServletRequest request){					
			String auth ="";			
			Authentication usuauthentication = SecurityContextHolder.getContext().getAuthentication();
	        User usu = (User)usuauthentication.getPrincipal();				
			Iterator<?> ListaAuth = usu.getAuthorities().iterator();		
			ArrayList<Integer> arrayPermisos = new ArrayList<Integer>();
			
			request.setAttribute("MenuCaptura","disabled='disabled'");
			request.setAttribute("MenuValida","disabled='disabled'");
			request.setAttribute("MenuCalidad","disabled='disabled'");
			request.setAttribute("MenuRecepcion","disabled='disabled'");
			
			
			
			while (ListaAuth.hasNext()){
				auth = ListaAuth.next().toString();
				if (auth.compareTo("Administrador")==0){					
					arrayPermisos.add(1);
					request.setAttribute("MenuCaptura","");
					request.setAttribute("MenuValida","");
					request.setAttribute("MenuCalidad","");
					request.setAttribute("MenuRecepcion","");
				}
				if (auth.compareTo("Captura")==0){
					arrayPermisos.add(2);
					request.setAttribute("MenuCaptura","");
				}
				if (auth.compareTo("Calidad")==0){
					arrayPermisos.add(3);
					request.setAttribute("MenuCalidad","");
				}				
				if (auth.compareTo("Recepcion")==0){
					arrayPermisos.add(4);
					request.setAttribute("MenuRecepcion","");
				}
				if (auth.compareTo("Validacion")==0){
					arrayPermisos.add(5);
					request.setAttribute("MenuValida","");
				}	
			}
			
			return arrayPermisos;
		}
		
		public boolean tienePermisos(HttpServletRequest request,String modulo){
			boolean permiso=false;
			int indice=0;
			ArrayList<Integer> arrayPermisos = permisos(request);
			
			
			switch(modulo.toLowerCase()){	//only in Java7 you can put String in switch
				case "captura":
					for (indice=0; indice<=arrayPermisos.size(); indice++){
						if (arrayPermisos.get(indice) ==1 || arrayPermisos.get(indice) ==2 ){permiso=true;} 
					}
					break;
				case "calidad":
					for (indice=0; indice<=arrayPermisos.size(); indice++){
						if (arrayPermisos.get(indice) ==1 || arrayPermisos.get(indice) ==3 ){permiso=true;} 
					}
					break;
				case "recepcion":
					for (indice=0; indice<=arrayPermisos.size(); indice++){
						if (arrayPermisos.get(indice) ==1 || arrayPermisos.get(indice) ==4 ){permiso=true;} 
					}
					break;
				case "validadcion":
					for (indice=0; indice<=arrayPermisos.size(); indice++){
						if (arrayPermisos.get(indice) ==1 || arrayPermisos.get(indice) ==5 ){permiso=true;} 
					}
					break;
			}
			
			return permiso;
		}
		
		
	

		
		
}