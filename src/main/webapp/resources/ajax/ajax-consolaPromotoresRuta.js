/**
 * Created by usuario on 30/04/2015.
 */
/**
 * Created by db2 on 7/04/15.
 */
var $j = jQuery.noConflict();
$j(document).on('ready', main_consulta);

var datosJson,userId,fechaInicio,fechaFinal;






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
    
    var get = getGET();
    //var objJson = JSON.parse(get);
    userId = get.user;
    meta = get.meta;
    visitados = get.visitados;
    solicitudes = get.solicitudes;
    
    
    verDatos();
    datosEncabezado(meta,visitados,solicitudes);
    

    

}



function getGET(){
	   var loc = document.location.href;
	   var getString = loc.split('?')[1];
	   var GET = getString.split('&');
	   var get = {};//this object will be filled with the key-value pairs and returned.

	   for(var i = 0, l = GET.length; i < l; i++){
	      var tmp = GET[i].split('=');
	      get[tmp[0]] = unescape(decodeURI(tmp[1]));
	   }
	   return get;
	}


function verDatos() {
	
    var ajax_data = {};
  
    ajax_data.userId = userId;
    
	$j.ajax({
        url: 'promotoresLL',
        type: 'get',        
        dataType: 'json',
        data: ajax_data,
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {
            datosJson = data;
            
            initialize();
            
           
        },
        error: function (data) {
            alert('error!!! ' + data.status);
        }
    });
    
}





function datosEncabezado(meta,visitados,solicitudes){
	
	$j('#sMeta').html(meta);
	$j('#sVisitados').html(visitados);
	$j('#sSolicitudes').html(solicitudes);
	
	
}

function initialize() {
	var latlng = new google.maps.LatLng(19.2791116,-99.6491435);
	var myOptions = {
	zoom: 10,
	center: latlng,
	mapTypeId: google.maps.MapTypeId.ROADMAP
	};


	 map = new google.maps.Map(document.getElementById("map-ruta-promotor"),myOptions);
	 $j('#nombrePromotor').html("Promotor: " + datosJson.promotor);

    //Almacen central (Cliente 1)
	 if (datosJson.lista.length>0) {	    
		    
		    for(var i = 0, l = datosJson.lista.length; i < l; i++){
		    	marcarPunto(new google.maps.LatLng(datosJson.lista[i].latitud,datosJson.lista[i].longitud), datosJson.lista[i].solicitud,i+1);
		    }
	 }
   
   

}



function marcarPunto(location, solicitud,numero) {
   /* var marker = new google.maps.Marker({
    position: location,
    map: map
    });

    colocarNombre(marker, nombre);*/
    var sIcon = "";    
   	if (solicitud !="" && solicitud !=null) {
    		sIcon='resources/img/pinVerde.png';
   	}else{
    		sIcon='resources/img/pinRojo.png';
    		solicitud="sin solicitud";
   	}

    
    var marker = new MarkerWithLabel({
        position: location,
                  map: map,
                  icon: sIcon,
                  shadow: sIcon,
                  transparent: sIcon,
                  draggable: false,
                  raiseOnDrag: false,
                  labelContent: ""+numero,
                  labelAnchor: new google.maps.Point(12, 45),
                  labelClass: "mapIconLabel", // the CSS class for the label
                  labelInBackground: false
                 });
    
    colocarNombre(marker, solicitud, map);
    
}



function colocarNombre(marker, nombre, mapa) {
    var infowindow = new google.maps.InfoWindow(
    { content: 'Solicitud : ' + nombre,
    size: new google.maps.Size(50, 50)
    });
    google.maps.event.addListener(marker, 'click', function() {
    infowindow.open(mapa, marker);
    });
}

function placeMarker(location,map) {
  var marker = new google.maps.Marker({
      position: location,
      draggable : true,
      map: map
  });

  map.setCenter(location);
}


