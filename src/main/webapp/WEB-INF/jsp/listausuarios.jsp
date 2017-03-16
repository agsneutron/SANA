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
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
    
    <%@ include file="/WEB-INF/jsp/menu.jsp"%>
    <script>
	function envia(page) {
		window.location.replace("<%=request.getContextPath()%>"+page);
	}

	function sub_mit(Form){
		alert("sssdddd");
		document.listausuarios.submit();
	}	

	
	</script>
	<div class="">
        <div class="container">
        	<div class="cobrador-ruta">
        	<div class="container-fixed">
        		<div class="row row-xs-11">
            		<div class="col col-md-6 col-md-offset-3" id="mainContent">
                  <div class="panel panel-primary">
                 	<div class="panel-heading">
                        <h3 class="panel-title" style="text-align:center">Usuarios</h3>
                        <button id="button-float-users" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber" onclick="envia('/usuarios')"><i class="mdi-content-add"></i></button>
                    </div>
 <!--Select list de usuarios-->
 			<form:form action="listausuarios.do" class="form-horizontal" method="POST" commandName="listausuarios" name="listausuarios"> 
                    <div class="panel-body">
                        <div class="list-group">
                        	<c:forEach items="${listaUsuarios}" var="usuario">
                        	
	                        	<div class="list-group-item">
	                                <div class="icon-clients color-blue" id="envia">
	                                	<input type="hidden" name="user_id" id="user_id" value="${usuario.userId}" class="btn btn-primary"/>	                                	
	                                	<button type="submit" name="action" id="action1" value="${usuario.userId}" class="btn btn-default btn-fab btn-fab-micro btn-raised mdi-content-create"></button>	                                    
	                                </div>
	                                <div class="row-content">
	                                    <div class="least-content togglebutton">
	                                       <label><input type="checkbox" checked=""></label>
	                                    </div>
	                                    <h4 class="list-group-item-heading-users">${usuario.nombre}</h4>
	                                    <p class="list-group-item-text-users">${usuario.rol.roleName}</p>
	                                </div>
	                            </div>
	                            <div class="list-group-separator-users"></div>
		                          							
							</c:forEach>
                            
                        </div>
                <!--Select list de usuarios-->
                    </div>
                </form:form>    
                  </div>
                  </div>
            	</div>
            </div>           
		</div>            
	</div><!-- /.center -->

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/ripples.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/material.min.js"></script> 
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery-birthday-picker.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
		<script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.gmap.js"></script>
		<script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.mCustomScrollbar.js"></script>  
      
        <script>
		(function($){
			$(window).load(function(){
				$("#mainContent").mCustomScrollbar({
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
	<script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.dropdown.js"></script>
     
    <script>
      $("#dropdown-menu select").dropdown();
    </script>   
    </body>
</html>