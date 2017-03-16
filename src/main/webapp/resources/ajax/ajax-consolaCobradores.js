/**
 * Created by usuario on 30/04/2015.
 */
/**
 * Created by db2 on 7/04/15.
 */
var $j = jQuery.noConflict();
$j(document).on('ready', main_consulta);

var datosJson,userId,fechaInicio,fechaFinal;
var dirRender = new google.maps.DirectionsRenderer();





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
    
    $j('#enviaCaja').on('click', function (){seleccionados}) 
    
    $j('#imgComprobantePropiedad').on('click', seleccionados)
    
    var get = getGET();
    //var objJson = JSON.parse(get);
    userId = get.user;
    fechaInicio = get.fechaInicio;
    fechaFinal = get.fechaFinal;
    
    verDatos();
    
    $('.input-group').datepicker({
		language: "es",
		autoclose: true
	});
	
	$('.input-group').datepicker().on('changeDate', function (ev) {
		cambiafecha();
	});

    

}

function seleccionados() {

    var arrClientes = $.map($('input:checkbox:checked'), function(e, i) {
        return +e.value;
    });

    alert(arrClientes.join(','));
    
    var ajax_data = {};
    
    ajax_data.clientes = arrClientes.join(',');  
    
	$j.ajax({
        url: 'pagos',
        type: 'get',        
        dataType: 'json',
        data: ajax_data,
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {
            datosJson = data;
            
            
        },
        error: function (data) {
            alert('error!!! ' + data.status);
        }
    });
    
}

function cambiafecha(){
	var fecha = $j("#fecha").val();
    if (fecha!=""){fecha = myDateFormatter(fecha);}
    
    var URL="cobradores_consola?user=" + userId;
    URL += "&fechaInicio=" + fecha;
    URL += "&fechaFinal=" + fecha;
    location.href = URL;
	
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
  ajax_data.fechaInicio=fechaInicio;
  ajax_data.fechaFinal=fechaFinal;
    
	$j.ajax({
        url: 'rutaOptima',
        type: 'get',        
        dataType: 'json',
        data: ajax_data,
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {
            datosJson = data;
            
            initialize();
            
            if (datosJson.rutaOptima.length>0) {            	
            	metavscobrado();
            }
            initializeClientes();
            
           
        },
        error: function (data) {
            alert('error!!! ' + data.status);
        }
    });
    
}




function pintaRuta(x,y){
	dirRender.setMap(null);
	calcularDistanciaEntre(new google.maps.LatLng(datosJson.rutaOptima[x].latitud,datosJson.rutaOptima[x].longitud),
    		new google.maps.LatLng(datosJson.rutaOptima[y].latitud,datosJson.rutaOptima[y].longitud));
}

function metavscobrado(){
	var meta=0;
	var cobrado=0;
	for(var i = 0, l = datosJson.montos.length; i < l; i++){		
		meta +=datosJson.montos[i].cuota;
		cobrado +=datosJson.montos[i].cobrado;
    }
	$j('#meta').html('Meta del d&iacute;a <br> <strong>$'+ formato_numero(meta,2,'.',',') + '</strong>');
	$j('#cobrado').html('Cobrado <br> <strong>$'+ formato_numero(cobrado,2,'.',',') + '</strong>');
}


function formato_numero(numero, decimales, separador_decimal, separador_miles){
    numero=parseFloat(numero);
    if(isNaN(numero)){
        return "";
    }

    if(decimales!==undefined){
        // Redondeamos
        numero=numero.toFixed(decimales);
    }

    // Convertimos el punto en separador_decimal
    numero=numero.toString().replace(".", separador_decimal!==undefined ? separador_decimal : ",");

    if(separador_miles){
        // Añadimos los separadores de miles
        var miles=new RegExp("(-?[0-9]+)([0-9]{3})");
        while(miles.test(numero)) {
            numero=numero.replace(miles, "$1" + separador_miles + "$2");
        }
    }

    return numero;
}

function initialize() {
	var latlng = new google.maps.LatLng(19.2791116,-99.6491435);
	var myOptions = {
	zoom: 10,
	center: latlng,
	mapTypeId: google.maps.MapTypeId.ROADMAP
	};


	 map = new google.maps.Map(document.getElementById("map-ruta"),myOptions);
    

    //Almacen central (Cliente 1)
	 if (datosJson.rutaOptima.length>0) {
		    $j('#ruta').html("RUTA : " + datosJson.rutaOptima[0].ruta);
		    
		    for(var i = 0, l = datosJson.rutaOptima.length; i < l-1; i++){
		    	marcarPunto(new google.maps.LatLng(datosJson.rutaOptima[i].latitud,datosJson.rutaOptima[i].longitud), datosJson.rutaOptima[i].nombreCliente,i+1,datosJson.rutaOptima[i].lugarVisitado);
		    }
	 }
   
   

}

function initializeClientes() {
	var latlng = new google.maps.LatLng(19.2791116,-99.6491435);
	var myOptions = {
	zoom: 10,
	center: latlng,
	mapTypeId: google.maps.MapTypeId.ROADMAP
	};


	mapClientes = new google.maps.Map(document.getElementById("map-client-asig"),myOptions);
    
    
    for(var i = 0, l = datosJson.clientesAsignados.length; i < l; i++){
    	ubicaCliente(new google.maps.LatLng(datosJson.clientesAsignados[i].latitud,datosJson.clientesAsignados[i].longitud), datosJson.clientesAsignados[i].cliente,i+1);
    }
    
   
   

}

function calcularDistanciaEntre(iniPos, endPos) {

    var dmreq = {
    avoidHighways:false,
    avoidTolls:false,
    destination:endPos,
    origin:iniPos,
    travelMode:google.maps.TravelMode.DRIVING,
    unitSystem:google.maps.UnitSystem.METRIC
    };

    var dms = new google.maps.DirectionsService();

    dms.route(dmreq, function(dmres, dmst) {
    if (dmst == google.maps.DirectionsStatus.OK) {
    console.log("distance =" + dmres.routes[0].legs[0].distance.value + "m.");
    
    dirRender.setMap(map);
    dirRender.setPanel($j('#panel_ruta').get(0));
    dirRender.setDirections(dmres);

    
    }
    });


}


function marcarPunto(location, nombre,numero,lugarVisitado) {
   /* var marker = new google.maps.Marker({
    position: location,
    map: map
    });

    colocarNombre(marker, nombre);*/
    var sIcon = "";
    
    if (numero==1){sIcon='resources/img/pinAzul.png';}
    else{
    	if (lugarVisitado ==1) {
    		sIcon='resources/img/pinVerde.png';
    	}else{
    		sIcon='resources/img/pinRojo.png';
    	}
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
    
    colocarNombre(marker, nombre, map);
    
}


function ubicaCliente(location, nombre,numero) {
	   /* var marker = new google.maps.Marker({
	    position: location,
	    map: map
	    });

	    colocarNombre(marker, nombre);*/
	    var sIcon = "";
	    
	   sIcon='resources/img/pinVerde.png';
	   
	    
	    var marker = new MarkerWithLabel({
	        position: location,
	                  map: mapClientes,
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
	    
	    colocarNombre(marker, nombre, mapClientes);
	    
	}


function colocarNombre(marker, nombre, mapa) {
    var infowindow = new google.maps.InfoWindow(
    { content: nombre,
    size: new google.maps.Size(50, 50)
    });
    google.maps.event.addListener(marker, 'click', function() {
    infowindow.open(mapa, marker);
    });
}

function initializeMap(){
     var latlng = new google.maps.LatLng(-12.07, -77.09);
     var myOptions = {
     zoom: 15,
     center: latlng,
     mapTypeId: google.maps.MapTypeId.ROADMAP
     };
   var map = new google.maps.Map(document.getElementById("map-ruta"),myOptions);
    google.maps.event.addListener(map, 'click', function(event) {
        map = null;
        map = new google.maps.Map(document.getElementById("map-ruta"),myOptions);
        placeMarker(event.latLng,map);
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


