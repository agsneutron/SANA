<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="UTF-8">
        <title>Admin-Sana</title>
        <!-- bootstrap -->
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/roboto.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/material.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/ripples.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/custom.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-datepicker.min.css" rel="stylesheet">
        <!-- font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/fonts/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<!-- Dropdown.js -->
	<link href="${pageContext.request.contextPath}/resources/bootstrap/css/jquery.dropdown.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/jquery.mCustomScrollbar.css" rel="stylesheet">
    
    <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/ajax/ajax-solicitud.js"></script>

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
        
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/alertas/alertify.core.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/alertas/alertify.default.css" id="toggleCSS" />
  		 
		<style>
				.alertify-log-custom {
					background: blue;
				}		
		</style>    
        
        
    </head>
    <body>
            <%@ include file="/WEB-INF/jsp/menu.jsp"%>
    
			<script>
			function envia(page) {
				window.location.replace("<%=request.getContextPath()%>"+page);
			}
			</script>
    
<form:form action="solicitud_grupal.do" method="POST" commandName="solicitud" >      
	<div class="">
        <div class="container">
        	<div class="cobrador-ruta">
        		<h1 class="text-center color-amber">Solicitud: ${solicitud.cliente.nombre} ${solicitud.cliente.apellidoPaterno} ${solicitud.cliente.apellidoMaterno}</h1>
        	<div class="container-fixed">
        		<div class="row row-xs-11" >
            		<div class="col col-md-9" id="mainContent">
                
<!--Datos personales  -->              
                  <div class="panel panel-primary "  >
                 	<div class="panel-heading">
                        <h3 class="panel-title" style="text-align:center">Datos de Identificación del Solicitante</h3>
                    </div>
                    <div class="panel-body">
                     	<div class="table-responsive">
                        <form class="">
                        <table class="table solicitud-t">
        <tbody>
<!--bloque de fila 3 items-->        
         <tr >
            <td>
            	<div class="form-group">
            		<form:hidden path="idSolicitud" id="idSolicitud"/>
            		<form:hidden path="idCliente" id="idCliente"/>
            		<label class="form-text" for="exampleInputEmail1">Nombre (s)</label>
            		<form:input path="cliente.nombre" class="form-control form-height" readonly="true"/>                	
              	</div>
            </td>
            <td>
            	<div class="form-group">
              	<label class="form-text" for="exampleInputEmail1">Apellido Paterno</label>
                <form:input path="cliente.apellidoPaterno" class="form-control form-height" readonly="true"/>
             	</div>
            </td>
            <td>
            	<div class="form-group">
                <label class="form-text" for="exampleInputEmail1">Apellido Materno</label>
                <form:input path="cliente.apellidoMaterno" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
			<td>
				<div class="form-group">
               <label class="form-text" for="exampleInputEmail1">Sexo</label>
               	<form:input path="cliente.sexo" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
            <td>
                <div class="form-group">
                    <label class="form-text" for="exampleInputEmail1">Nacimiento</label>
                    <form:input path="cliente.fechaNacimiento" class="form-control form-height" readonly="true"/>
             	</div>
            </td>
           
          </tr>
<!--bloque de fila 3 items-->          
          <tr>
           <td>
				<div class="form-group">
                <label class="form-text" for="exampleInputEmail1">Nacionalidad</label><br>
               <form:input path="cliente.nacionalidad" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
             <td>
            	<div class="form-group">
                <label class="form-text" for="escolaridad">Edad</label>
                <form:input path="cliente.edad" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
           
            <td>
            	<div class="form-group">
              	<label class="form-text" for="edocivil">Pais de nacimiento</label>
               <form:input path="cliente.paisNacio.nombre" class="form-control form-height" readonly="true"/>
             	</div>
            </td>
			<td>
            	<div class="form-group">
            	<label class="form-text" for="exampleInputEmail1">Entidad F. Nacimiento</label>
                <form:input path="cliente.estadoNacio.nombreEntidadFederativa" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
            <td>
            	<div class="form-group">
            	<label class="form-text" for="exampleInputEmail1">CURP</label>
                <form:input path="cliente.curp" class="form-control form-height"/>
              	</div>
            </td>
          </tr>
<!--bloque de fila 4 items-->
         <tr>
            <td>
            	<div class="form-group">
            	<label class="form-text" class="form-text" for="exampleInputEmail1">RFC</label>
                <form:input path="cliente.rfc" class="form-control form-height"/>
              	</div>
            </td>
            <td>
            	<div class="form-group">
            	<label class="form-text" for="exampleInputEmail1">Tel. Fijo</label>
                <form:input path="cliente.telefonolParticular" class="form-control form-height"/>
              	</div>
            </td>
            <td>
            	<div class="form-group">
            	<label class="form-text" for="exampleInputEmail1">Tel. Celular</label>
                <form:input path="cliente.telefonoCelular" class="form-control form-height"/>
              	</div>
            </td>
            <td colspan="2">
            	<div class="form-group">
            	<label class="form-text" for="exampleInputEmail1">E-mail</label>
                <form:input path="cliente.mail" class="form-control form-height"/>
              	</div>
            </td>
          </tr>
          
    <!--bloque domicilio particular, fila 3 items-->          
          <tr >
            <td>
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">No. Identificaci&oacute;n</label>
            		<form:input path="cliente.numeroIdentificacion" class="form-control form-height" placeholder="Número de Identificación"/>                	
              	</div>
            </td>
            <td>
            	<div class="form-group">
              	<label class="form-text" for="exampleInputEmail1">Tipo Identificaci&oacute;n</label>
                
                <form:select  path="cliente.idTipoIdentificacion" class="form-control  floating-label" placeholder="Tipo de Identificación">
					      <option></option>
					      <c:forEach items="${tipoIdentificacion}" var="identificacion">
					            <option <c:if test="${identificacion.getIdTipoIdentificacion() == solicitud.cliente.getIdTipoIdentificacion()}"> selected="selected" </c:if> value="${identificacion.getIdTipoIdentificacion()}">${identificacion.nombre} </option>
					        </c:forEach>
				</form:select>
                
             	</div>
            </td>
            <td>
            	<div class="form-group">
                <label class="form-text" for="exampleInputEmail1">¿Identificaci&oacute;n Oficial?</label> 
                <br>               
                <form:radiobutton path="cliente.identificacionOficial" value="S" label="Si"  class="form-height"/> 
            	<form:radiobutton path="cliente.identificacionOficial" value="N" label="No"  class="form-height"/>
              	</div>
            </td>
			<td>
				<div class="form-group">
               <label class="form-text" for="exampleInputEmail1">T&iacute;tulo</label>
               	<form:input path="cliente.titulo" class="form-control form-height" placeholder="Título"/>
              	</div>
            </td>           
           
          </tr>
          
          
          <tr>
          	<td class="backg-amber" colspan="6">
            	Domicilio particular
            </td>
          </tr>
          <tr>
            <td colspan="2">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Calle</label>
                	<form:input path="cliente.calle" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
            <td>
                    <div class="form-group">
                    <label class="form-text" for="exampleInputEmail1">No. Ext.</label>
                	<form:input path="cliente.numeroExterior" class="form-control form-height" readonly="true"/>
                    </div>
             </td>
             <td>
                    <div class="form-group">
                    <label class="form-text" for="exampleInputEmail1">No. Int.</label>
                	<form:input path="cliente.numeroInterior" class="form-control form-height" readonly="true"/>
                    </div>
               
            </td>
            <td>
            	<div class="form-group">
               <label class="form-text" for="exampleInputEmail1">Colonia</label>
                <form:input path="cliente.coloniaDomicilio.nombre" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
          </tr>
          <tr>
          <td>
				<div class="form-group">
               <label class="form-text" for="exampleInputEmail1">C.P.</label>
                <form:input path="cliente.cp" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
          	 <td colspan="2">
                <div class="form-group">
                    <label class="form-text" for="exampleInputEmail1">Del. Municipio</label>
                    <form:input path="cliente.municipioDomicilio.nombre" class="form-control form-height" readonly="true"/>
             	</div>
            </td>
            <td>
                <div class="form-group">
                    <label class="form-text" for="exampleInputEmail1">Estado</label>
                    <form:input path="cliente.estadoDomicilio.nombreEntidadFederativa" class="form-control form-height" readonly="true"/>
             	</div>
            </td>
          </tr>
          
          
          <tr >
            <td>
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Tipo de Direcci&oacute;n</label>
            		           		
            		<form:select  path="cliente.idTipoDireccion" class="form-control  floating-label" placeholder="Tipo de Dirección">
					      <option></option>
					      <c:forEach items="${tipoDireccion}" var="tipoDir">
					            <option <c:if test="${tipoDir.getIdTipoDireccion() == solicitud.cliente.getIdTipoDireccion()}"> selected="selected" </c:if> value="${tipoDir.getIdTipoDireccion()}">${tipoDir.nombre} </option>
					        </c:forEach>
					</form:select>              	
              	</div>
            </td>
            <td>
            	<div class="form-group">
              	<label class="form-text" for="exampleInputEmail1">¿Es Oficial Direcci&oacute;n?</label>               
                <br>               
                <form:radiobutton path="cliente.direccionOficial" value="S" label="Si"  class="form-height"/> 
            	<form:radiobutton path="cliente.direccionOficial" value="N" label="No"  class="form-height"/>
             	</div>
            </td>                      
           
          </tr>
          

	          <tr>
	          	<td class="backg-azul" colspan="6">
	            	Datos del negocio
	            </td>
	          </tr>
	          
	           <tr >
	            <td colspan="2">
	            	<div class="form-group">
	            		<label class="form-text" for="exampleInputEmail1">Calle</label>
	                	<form:input path="negocioCalle" class="form-control form-height" readonly="true"/>
	              	</div>
	            </td>
	            <td>
	                    <div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">No. Ext.</label>
	                	<form:input path="negocioNoExt" class="form-control form-height" readonly="true"/>
	                    </div>
	             </td>
	             <td>
	                    <div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">No. Int.</label>
	                	<form:input path="negocioNoInt" class="form-control form-height" readonly="true"/>
	                    </div>
	               
	            </td>
	            <td>
	            	<div class="form-group">
	               <label class="form-text" for="exampleInputEmail1">Colonia</label>
	                <form:input path="negocioColonia.nombre" class="form-control form-height" readonly="true"/>
	              	</div>
	            </td>
				
	          </tr>
	          <tr>
	          <td>
					<div class="form-group">
	               <label class="form-text" for="exampleInputEmail1">C.P.</label>
	                <form:input path="negocioCP" class="form-control form-height" readonly="true"/>
	              	</div>
	            </td>
	          	 <td>
	                <div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">Del. Municipio</label>
	                    <form:input path="negocioMunicipio.nombre" class="form-control form-height" readonly="true"/>
	             	</div>
	            </td>
	            <td>
	                <div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">Estado</label>
	                    <form:input path="negocioEntidadFederativa.nombreEntidadFederativa" class="form-control form-height" readonly="true"/>
	             	</div>
	            </td>
	             <td>
	                <div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">Entre las calles:</label>
	                    <form:input path="negocioEntreCalles" class="form-control form-height" readonly="true"/>
	             	</div>
	            </td>
	            <td>
	                <div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">Telefono de negocio:</label>
	                    <form:input path="negocioTelefono" class="form-control form-height" readonly="true"/>
	             	</div>
	            </td>
	          </tr>
	          <tr>
	          	<td colspan="4">
	            	<div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">Referencias físicas del negocio:</label>
	                    <form:input path="negocioReferencia" class="form-control form-height" readonly="true"/>
	             	</div>
	            </td>
	          	<td colspan="2">
	            	<div class="form-group">
	                    <label class="form-text" for="exampleInputEmail1">Giro del negocio:</label>
	                    <form:input path="negocioGiro.nombre" class="form-control form-height" readonly="true"/>
	             	</div>
	            </td>
	          </tr>
          
          </tbody>
      </table>
                      
                     	
                       	</form>
                      	</div>
                    </div>
                  </div>
<!--Datos del credito-->
				<div class="panel panel-primary">
                 	<div class="panel-heading">
                        <h3 class="panel-title" style="text-align:center">Datos del Crédito</h3>
                    </div>
                    <div class="panel-body">
                     	<div class="table-responsive">
                        <form class="">
                        <table class="table solicitud-t">
        <tbody>
<!--bloque de fila 3 items-->        
         	 <tr>
          	<td colspan="">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Monto Solicitado</label>
                	<form:input path="creditoMonto" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
            <td colspan="">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Frecuencia de pagos</label>
                	<form:input path="Frecuencia.descripcion" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
        	<td colspan="">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Plazo del crédito</label>
                	<form:input path="Plazo.descripcion" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
            <td colspan="">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Uso de recursos:</label>
                	<form:input path="creditoUsoRecursos.nombre" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
          </tr>
          <tr>
          	<td colspan="3">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">En caso de aumento de renovación y aumento de línea de crédito</label>
                	<form:input path="creditoRenovacionAumento.nombre" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
            <td colspan="">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Tipo de Crédito solicitado</label>
                	<form:input path="creditoTipoCredito.nombre" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
          </tr>
		  <tr>
          	<td colspan="4">
            	<div class="form-group">
            		<label class="form-text" for="exampleInputEmail1">Entrevista Personal. Comentarios adicionales del promotor</label>
                	<form:input path="comentarios" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
          </tr>
          <tr>
          	<td colspan="4">
            	<div class="form-group">
                	<label class="form-text">
                    Autorización para usar datos con fines comerciales:       	</label>
                    <form:input path="autorizacionUsoDatos" class="form-control form-height" readonly="true"/>
              	</div>
            </td>
          </tr>
         
          </tbody>
      </table>
                       	</form>
                      	</div>
                    </div>
                  </div>
                  </div>
            		<div class="col col-md-3" id="mainContent2">
                 <div class="panel panel-primary">
                 	<div class="panel-heading">
                        <h3 class="panel-title" style="text-align:center">Documentos</h3>
                    </div>
                    <div class="panel-body">
                      <div class="row">
                     	<div class="col-md-6 text-center">
                            <p class="">Identificación</p>
                            <button id="pdfIdentificacion"  type="button" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber"><i class="mdi-action-print"></i></button>
                            <span class="divider"></span><form:hidden path="fotoIdentificacion" id="nombreIdentificacion"/>
                            <button id="imgIdentificacion" type="button" class="btn btn-fab btn-fab-mini btn-raised  btn-material-amber" name="imgIdentificacion" ><i class="mdi-action-get-app"></i></button>
                            													
                         </div>
                         <div class="col-md-6 text-center">
                            <p class="">Comprobante Domicilio</p>
                            <button id="pdfComprobanteDomicilio"  type="button" class="btn btn-fab btn-fab-mini btn-sm btn-material-amber"><i class="mdi-action-print"></i></button>
                            <span class="divider"></span><form:hidden path="fotoComprobanteDomicilio" id="nombreComprobanteDomicilio"/>
                            <button id="imgComprobanteDomicilio"  type="button" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber" name="action" value="DCDomicilio"><i class="mdi-action-get-app"></i></button>
                        </div>
                      </div>
                      <hr>
                      <div class="row">
                     	<div class="col-md-6 text-center">
                            <p class="">Comprobante Propiedad</p>
                            <button id="pdfComprobantePropiedad"  type="button" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber"><i class="mdi-action-print"></i></button>
                            <span class="divider"></span><form:hidden path="fotoComprobantePropiedad" id="nombreComprobantePropiedad"/>
                            <button id="imgComprobantePropiedad"  type="button" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber" name="action" value="DCPropiedad"><i class="mdi-action-get-app"></i></button>
                         </div>
                         <div class="col-md-6 text-center">
                            <p class="">Solicitud de Buró</p>
                            <button id="pdfSolicitudBuro"  type="button" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber"><i class="mdi-action-print"></i></button>
                            <span class="divider"></span><form:hidden path="fotoSolicitudBuro" id="nombreSolicitudBuro"/>
                            <button id="imgSolicitudBuro"  type="button" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber" name="action" value="DSBuro"><i class="mdi-action-get-app"></i></button>
                        </div>
                    </div>
                  </div>
            	</div>
                
                <div class="panel panel-primary">
                 	<div class="panel-heading">
                        <h3 class="panel-title" style="text-align:center">Referencias</h3>
                    </div>
                    <div class="panel-body">
                      <form class="form-horizontal">
                          <div class="form-group">
                            <label for="inputEmail3" class="col-sm-4 control-label form-text">Nombre</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaNombre1" maxlength="100" size="15" class="form-control form-height"/>
                              
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Dir. Particular</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaDomicilio1" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Dir. Negocio</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaDomicilio1" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Tel. Fijo</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaTelefono1" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Tel. Cel.</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaTelefono1" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                        </form>
                      <hr>
                      	<form class="form-horizontal">
                          <div class="form-group">
                            <label for="inputEmail3" class="col-sm-4 control-label form-text">Nombre</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaNombre2" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Dir. Particular</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaDomicilio2" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Dir. Negocio</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaDomicilio2" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Tel. Fijo</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaTelefono2" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="inputPassword3" class="col-sm-4 control-label form-text">Tel. Cel.</label>
                            <div class="col-sm-8">
                              <form:input path="referenciaTelefono2" class="form-control form-height" readonly="true"/>
                            </div>
                          </div>
                        </form>
                  </div>
            	</div>
            </div>
            	</div>
                <div class="row row-xs-1">
                <div class="col-md-9" >
                  	<div class="col-md-4" >
                  	&nbsp;
                  </div>
                  <div class="col-md-2" id="dropdown-menu">
                    
                    <form:select  path="User_id" class="form-control  floating-label" placeholder="Asignar Cobrador">
					      <option></option>
					      <c:forEach items="${cobradores}" var="cobrador">
					            <option <c:if test="${cobrador.getUserId() == solicitud.getUser_id()}"> selected="selected" </c:if> value="${cobrador.getUserId()}">${cobrador.nombre} </option>
					        </c:forEach>
					</form:select>
					
                    
                  	
                  </div>
                  <div class="col-md-2">
                  	<button class="btn btn-material-amber btn-raised"><i class="mdi-action-print" style="font-size:14px"></i> Imprimir</button>
                  </div>
                  <div class="col-md-2">
                  	<button class="btn btn-danger btn-raised" name="action" id="action1" value="rechazar"><i class="mdi-navigation-close" style="font-size:14px"></i> Rechazar</button>
                  </div>
                  <div class="col-md-2">
                  	<button class="btn btn-success btn-raised" name="action" id="action2" value="aceptar"><i class="mdi-navigation-check" style="font-size:14px"></i> Aceptar</button>
                  </div>
                  </div>
                <div class="col-md-3">
                	&nbsp;
                </div>	
                </div> 
            </div>           
		</div>            
	</div><!-- /.center -->
</form:form>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        
       
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/ripples.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/material.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery-birthday-picker.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.mCustomScrollbar.js"></script>
        
        
        

        
        <script>
		(function($){
			$(window).load(function(){
				$("#mainContent").mCustomScrollbar({
					theme:"dark-thin",
					autoExpandScrollbar:true,
					
				});
				$("#mainContent2").mCustomScrollbar({
					theme:"dark-thin",
					autoExpandScrollbar:true,
					
				});
			});
		})(jQuery);
	</script>    
        <script>
            $(document).ready(function() {
                // This command is used to initialize some elements and make them work properly
                $.material.init();
            });
        </script>
        <script type="text/javascript">
		
            $(function() {               
                $(".center").center();
                $(window).resize(function() {
                    $(".center").center();
                });
            });
            /* Centrar elementos */
            jQuery.fn.center = function() {
                this.css("position", "absolute");
                this.css("top", Math.max(0, (($(window).height() - $(this).outerHeight()) / 2) +
                        $(window).scrollTop()) - 1 + "px");
                this.css("left", Math.max(0, (($(window).width() - $(this).outerWidth()) / 2) +
                        $(window).scrollLeft()) + "px");
                return this;
            }
			
			$('#birthdayPicker').birthdayPicker();



	</script>
	
	
	
	<script src="${pageContext.request.contextPath}/resources/alertas/alertify.min.js"></script>
  
  		<script>
		function reset () {
			$("#toggleCSS").attr("href", "${pageContext.request.contextPath}/resources/alertas/alertify.default.css");
			alertify.set({
				labels : {
					ok     : "OK",
					cancel : "Cancel"
				},
				delay : 5000,
				buttonReverse : false,
				buttonFocus   : "ok"
			});
		}

		reset();
		${scriptError}
		
		</script>
	
	
	
	
	<script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.dropdown.js"></script>
     
    <script>
      $("#dropdown-menu select").dropdown();
    </script>   
    </body>
</html>