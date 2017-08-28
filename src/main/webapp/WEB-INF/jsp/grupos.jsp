<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="UTF-8">
        <title>Admin-Sana</title>
        <!-- bootstrap -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/roboto.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/material.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/ripples.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/custom.css" rel="stylesheet">
        
        
        <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/ajax/ajax-grupos.js"></script>
        
        
        <!-- font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/fonts/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        
        <!-- Google font -->
		<link href='https://fonts.googleapis.com/css?family=Noto+Sans:400,700' rel='stylesheet' type='text/css'>
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
    
	<div class="">
        <div class="container">
        	<div class="row cobrador-ruta">
                <div class="col-md-3 col-sm-1 hidden-xs">
                    &nbsp;
                </div>
            	<div class="col-md-6 col-sm-10 col-xs-12">
                <h1 class="header">Grupos</h1>
  
  <form:form action="grupos.do" class="form-horizontal" method="POST" commandName="grupos"> 
    <fieldset>        
        <form:hidden path="idGrupo" class="form-control" id="idgrupo" name="idgrupo" placeholder="id de grupo"/>
        <form:hidden path="User_id" class="form-control" id="user_id" name="user_id" placeholder="id de usuario"/>
		<div class="form-group">
            <label for="nombre" class="col-lg-4 col-sm-4 col-md-4 control-label hidden-xs">Nombre</label>
            <div class="col-lg-8 col-sm-8 col-md-8">                
                <form:input path="nombre" class="form-control" id="nombre" name="nombre"  placeholder="Nombre" maxlength="200" readonly="true"/>
            </div>
        </div>
        <div class="form-group">
            <label for="direccion" class="col-lg-4 col-sm-4 col-md-4 control-label hidden-xs">Fecha Registro</label>
            <div class="col-lg-8 col-sm-8 col-md-8">
                <form:input path="fecha_Registro" class="form-control" id="fecha_registro" name="fecha_registro" placeholder="fecha registro" maxlength="300" readonly="true"/>
            </div>
        </div>
        <div class="form-group">
            <label for="telefono" class="col-lg-4 col-sm-4 col-md-4 control-label hidden-xs">Grupo SAFI</label>
            <div class="col-lg-8 col-sm-8 col-md-8">
                <form:input path="idGrupoSafi" class="form-control" id="idgruposafi" name="idgruposafi" placeholder="grupo safi" maxlength="20" readonly="true"/>
            </div>
        </div>
     
        
        <div class="form-group">
            <div class="col-lg-8 col-lg-offset-4 col-sm-8 col-sm-offset-4">
            	<input type="button" id="cancelar" value="Cancelar" class="btn btn-danger" />
	            <input type="submit" name="action" id="action2" value="Guardar" class="btn btn-success"/>
            </div>
        </div>
    </fieldset>
</form:form>
            	</div>
                <div class="col-md-3 col-sm-1 hidden-xs">
                    &nbsp;
                </div>

            </div>            
		</div>            
	</div><!-- /.center -->

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/ripples.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/material.min.js"></script>        
        
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
        
    </body>
</html>