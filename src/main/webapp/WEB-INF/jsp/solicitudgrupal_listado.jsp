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
        <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-datepicker.min.css" rel="stylesheet">
        <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
        
        <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
        
        <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/ajax/utilerias.js"></script>
        
        
        <!-- font Awesome -->
        <link href="${pageContext.request.contextPath}/resources/bootstrap/fonts/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Google font -->
	
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
			$dr=jQuery.noConflict();
			$dr(document).ready(function() {
			    $dr('#tableSolicitudes').DataTable({
			        "language": {
			            "lengthMenu": "Despliega _MENU_  registros por página",
			            "zeroRecords": "No se encontraron registros",
			            "info": "Mostrando página _PAGE_ de _PAGES_",
			            "infoEmpty": "No hay registros disponibles",
			            "search": "Buscar",
			            "oPaginate":{sFirst:"First",sLast:"Last",sNext:"Siguiente",sPrevious:"Anterior"},
			            "infoFiltered": "(filtrado de _MAX_ registros totales)"
			            
			        }
			    } );
			} );
			
			function envia(page) {
				window.location.replace("<%=request.getContextPath()%>"+page);
			}
			</script>

	<div class="">
        <div class="container">
        <div class="cobrador-ruta">
        <h1 class="text-center color-amber">Solicitudes Grupales</h1>
        	<div class="row">
            	
            	<div class="col-md-12">
                 <div class="panel panel-primary">
                        <div class="panel-heading">
                        	<div class="col-xs-6 col-sm-6 col-md-9">
                            	<h3 class="panel-title">Resumen de Solicitudes</h3>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-3 input-group date">
                            	<div class="form-control">
                                <form class="">
                                  <input type="text" class="form-control floating-label white" placeholder="Busqueda...">
                                  <button id="button-float" class="btn btn-fab btn-fab-mini btn-raised btn-sm btn-material-amber"><i class="mdi-action-search"></i></button>
                                </form>
                                </div>
                            </div>
                        </div>
                    <div class="panel-body">
                    	
                        <div class="col-md-12 text-center">   
                 <div class="table-responsive">
                          <table class="table table-bordered" id="tableSolicitudes">
                            <thead>
                              <tr>
                                <th>No.</th>
                                <th>Grupo</th>
                                <th>Cliente</th>
                                <th>Alta</th>    
                                <th>Cobrador</th>
                                <th>Inspector</th>
                                <th>Status</th> 
                                <th>Monto</th> 
                                <th>Adeudo</th> 
                                <th>Visualizar</th>       
                              </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="solicitud" items="${listaSolicitudes}">
	                              <tr>
	                                <td>1</td>
	                                <td>${solicitud.folio}</td>
	                                <td>${solicitud.cliente}</td>
	                                <td>${solicitud.fechaRegistro}</td>
	                                <td>${solicitud.cobrador}</td>
	                                <td>${solicitud.nombreNegocio}</td>
	                                <td>${solicitud.estatus}</td>
	                                <td>${solicitud.montoCredito}</td>
	                                <td>${solicitud.adeudo}</td>
	                                <td><a href="solicitud?Folio=${solicitud.idSolicitud}">Ver</a></td>
	                              </tr>
	                        </c:forEach>
	                        
                              
                            </tbody>
                          </table>
    				</div>
                    </div>
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
        
         	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
			<script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.gmap.js"></script>
            <script type="text/javascript">
    var locations = [
      	['Morelos No. 105  Col. Centro, Tula de Allende Hidalgo ', 20.0539368, -99.3430843, 1], 
		['Lic Benito Juarez No. 212, Col. Centro C.P. 93990 Panuco Veracruz', 22.0595745, -98.1796215, 2],
		['Maximino Avila Camacho #107 Col. Centro CP 93600 Martinez de la Torre,  Ver.', 20.062972, -97.0529809, 3], 
		['Plaza Principal # 27 Col. Centro C.P. 37980 San Jose Iturbide Gto.', 21.0000002, -100.3853965, 4],
		['Hidalgo #185-B Col. Centro C.P. 99100, Sombrerete Zacatecas', 23.6339499, -103.6372117, 5],
    ];

    var map = new google.maps.Map(document.getElementById('map-client-asig'), {
      zoom: 4,
      center: new google.maps.LatLng(22.6526121, -100.1780452),
      mapTypeId: google.maps.MapTypeId.ROADMAP
    });
	 var map2 = new google.maps.Map(document.getElementById('map-ruta'), {
      zoom: 4,
      center: new google.maps.LatLng(22.6526121, -100.1780452),
      mapTypeId: google.maps.MapTypeId.ROADMAP
    });

    var infowindow = new google.maps.InfoWindow();

    var marker, i;

    for (i = 0; i < locations.length; i++) {  
      marker = new google.maps.Marker({
        position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        map: map
      });

      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        return function() {
          infowindow.setContent(locations[i][0]);
          infowindow.open(map, marker);
        }
      })(marker, i));
    }
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
			$('.input-daterange').datepicker({
				language: "es"
			});
			$('#consola-date').datepicker({
			});
        </script>
        
    </body>
</html>