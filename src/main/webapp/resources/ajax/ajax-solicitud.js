/**
 * Created by usuario on 30/04/2015.
 */
/**
 * Created by db2 on 7/04/15.
 */
var $j = jQuery.noConflict();
$j(document).on('ready', main_consulta);

var datosJson;


function main_consulta() {
    $j.ajaxSetup({
		beforeSend: function(xhr, settings) {
			if(settings.type == "POST"){
				xhr.setRequestHeader("X-CSRFToken", $j('[name="csrfmiddlewaretoken"]').val());
			}
            if(settings.type == "GET"){
				xhr.setRequestHeader("X-CSRFToken", $j('[name="csrfmiddlewaretoken"]').val());
			}
		}
	});
    
    
    $j('#imgIdentificacion').on('click', function (){descargaImagen(1)});  
    $j('#pdfIdentificacion').on('click', function (){descargaPDF(1)});
    
    $j('#imgComprobanteDomicilio').on('click', function (){descargaImagen(2)});  
    $j('#pdfComprobanteDomicilio').on('click', function (){descargaPDF(2)});
    
    $j('#imgComprobantePropiedad').on('click', function (){descargaImagen(3)});  
    $j('#pdfComprobantePropiedad').on('click', function (){descargaPDF(3)});
    
    $j('#imgSolicitudBuro').on('click', function (){descargaImagen(4)});  
    $j('#pdfSolicitudBuro').on('click', function (){descargaPDF(4)});
    

}

function descargaImagen(indice){
	var nombre="";
	
	switch(indice) {
	    case 1:
	    	nombre = $j("#nombreIdentificacion").val();
	        break;
	    case 2:
	    	nombre = $j("#nombreComprobanteDomicilio").val();
	        break;
	    case 3:
	    	nombre = $j("#nombreComprobantePropiedad").val();
	        break;    
	    default:
	    	nombre = $j("#nombreSolicitudBuro").val();
	}
	
	    
	if (nombre!=""){
	    var URL="DownloadFileServlet?nombreFoto=" + nombre;    
	    location.href = URL;
	}else{
		alert("no existe imágen");
	}
}

function descargaPDF(indice){
   
	var nombre="";
	
	switch(indice) {
	    case 1:
	    	nombre = $j("#nombreIdentificacion").val();
	        break;
	    case 2:
	    	nombre = $j("#nombreComprobanteDomicilio").val();
	        break;
	    case 3:
	    	nombre = $j("#nombreComprobantePropiedad").val();
	        break;    
	    default:
	    	nombre = $j("#nombreSolicitudBuro").val();
	}
	
	    
	if (nombre!=""){

		var URL="DownloadPDF?nombreFoto=" + nombre;
        var win = window.open(URL, '_blank');
        win.focus();
	}else{
		alert("no existe imágen");
	}
    //location.href = URL;
	
}