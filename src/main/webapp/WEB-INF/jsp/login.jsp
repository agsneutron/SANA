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
    </head>
    <body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>          
          <a class="brand" href="#">< <img src="data:image/jpeg;base64,${logo_small}"></a>
 
        </div>
       <!-- <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div>-->
      </div>
    </nav>
    
	<div class="center">
        <div class="">
        	<div class="row">
            	
            	<div class="col-md-12 login">
                <h1 class="header">Ingresa a tu cuenta</h1>
                    <form action="j_spring_security_check" method="POST" name="login" class="form-horizontal">
                   
                    <div class="inputs">
                      <div class="form-group">
                        <!--<label for="inputEmail3" class="col-sm-2 control-label">Usuario:</label>-->
                        <div class="col-sm-12">
                          <input type="text" name="j_username" class="form-control floating-label" placeholder="Usuario">
                        </div>
                      </div>
                      <div class="form-group">
                        <!--<label for="inputPassword3" class="col-sm-2 control-label">Contraseña:</label>-->
                        <div class="col-sm-12" >
                        <input type="password" name="j_password" class="form-control floating-label"  placeholder="Contraseña">
                         
                        </div>
                      </div>
                      <div class="form-group">
                        <div class="col-sm-12" style="text-align:center">
                          <input type="submit" class="btn btn-primary" value="Entrar"/>
                          
                        </div>
                      </div>
                      </div>
                      <font color="red">
							<span>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
						</font>
                    </form>
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
      
    </body>
</html>