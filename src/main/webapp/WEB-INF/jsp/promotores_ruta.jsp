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
        
        <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-1.11.3.min.js">
	</script>
        <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js">
	</script>
        <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/ajax/utilerias.js"></script>
        <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/ajax/ajax-promotoresRuta.js"></script>
        
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
		    $dr('#tablaPromotores').DataTable({
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
    
	<div class="center col-md-12">
        <div class="container">
        	<div class="row">
                <div class="col-md-3"></div>
            	<div class="col-md-6 text-center">
                <h1 class="header">Ruta de Promotores</h1>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Promotores Sana tus Finanzas</h3>
                    </div>
                    <div class="panel-body">
                    	<div class="table-responsive" id="divTable">
                          <table id="tablaPromotores" class="table table-bordered">
                            <thead>
                              <tr>
                                <th>Cobrador</th>
                                <th>Meta</th>
                                <th>Visitados</th>
                                <th>Solicitud</th>    
                                <th>&nbsp;</th>          
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td><a href="#">Consola</a></td>
                              </tr>
                              
                            </tbody>
                          </table>
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
        </script>
        
    </body>
</html>