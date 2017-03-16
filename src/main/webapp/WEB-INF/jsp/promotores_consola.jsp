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
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-datepicker.min.css" rel="stylesheet">
        
        <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        
        <style type="text/css">
   .mapIconLabel {
     color: black;
     font-family: "Lucida Grande", "Arial", sans-serif;
     font-size: 15px;
     font-weight: bold;
     text-align: left;
     width: 40px;     
     white-space: nowrap;
   }
 </style>
        <!-- font Awesome -->
        <!-- Google font -->
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
        <!--  <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>-->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBOlaApEpQRQ6NJpf9ADlSHatXlG-0gpEc"></script>
         <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/ajax/utilerias.js"></script>
         <script type="text/javascript" src="https://google-maps-utility-library-v3.googlecode.com/svn/trunk/markerwithlabel/src/markerwithlabel.js"></script>
        <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/ajax/ajax-consolaPromotoresRuta.js"></script>
    </head>
    <body>
    <%@ include file="/WEB-INF/jsp/menu.jsp"%>
    
    <script>
		$dr=jQuery.noConflict();
		
		function envia(page) {
			window.location.replace("<%=request.getContextPath()%>"+page);
		}
</script>
    
	<div class="">
        <div class="container">
        <div class="cobrador-ruta">
        <h1 class="text-center color-amber" id ="nombrePromotor"></h1>
        	<div class="row">
            	<div class="col-sm-12 col-md-12 col-lg-12 ">
                    <div class="panel panel-primary">
                        <div class="panel-heading double-line">
                        	<div class="col-xs-5 col-sm-5 col-md-5">
                            	<h3 class="panel-title">Resumen Ruta de Promotor</h3>
                            </div>
                            <div class="col-xs-2 col-sm-2 col-md-2 text-right">
                            	<div class="form-inline">
                                     <h3 class="panel-title">Meta: <span class="big-text" id = "sMeta"></span></h3>
                            	</div>     
                            </div>
                            <div class="col-xs-2 col-sm-2 col-md-2 text-right">
                            	<div class="form-inline">
                                     <h3 class="panel-title">Visitados: <span class="big-text" id = "sVisitados"></span></h3>
                            	</div> 
                            </div>
                            <div class="col-xs-2 col-sm-2 col-md-2 text-right">
                            	<div class="form-inline">
                                     <h3 class="panel-title">Solicitudes: <span class="big-text" id = "sSolicitudes" ></span></h3>
                            	</div> 
                            </div>
                            <div class="col-xs-1 col-sm-1 col-md-1">
                                <button id="button-float" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber"><i class="mdi-action-print"></i></button>
                            </div>
                        </div>
                        <div class="panel-body"> 
                              <div id="map-ruta-promotor">&nbsp;</div>
                        </div>
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
        <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap-datepicker.js"></script>
        
         	    	<!--    	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script> -->
			<script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.gmap.js"></script>
			
        
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
			$('.input-daterange').datepicker({
				language: "es"
			});
			$('#consola-date').datepicker({
			});
			$('.input-group.date').datepicker({
			});
        </script>
        
    </body>
</html>