function initialize() {

    var latlng = new google.maps.LatLng(-12.07, -77.09);
    var myOptions = {
    zoom: 15,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
    };


    map = new google.maps.Map(document.getElementById("map-ruta"),myOptions);
    


    //Almacen central (Cliente 1)
    marcarPunto(new google.maps.LatLng(19.2799481,-99.669227), "Central SANA");
    //Cliente 2 -------------------------------------------------------------------------------------------------
    marcarPunto(new google.maps.LatLng(19.250103, -99.601471), "Bruno, Cliente 1");
    //Cliente 3 -------------------------------------------------------------------------------------------------
    marcarPunto(new google.maps.LatLng(19.290219, -99.659703),"Michelle, Cliente 2");
    //Cliente 5 -------------------------------------------------------------------------------------------------
    marcarPunto(new google.maps.LatLng(19.289384, -99.656404), "Cesar, Cliente 4");
   
    
//------------------------------------------------------------------------------------------------------------------------


    //Cliente 1,2
    console.log("1-2");
    calcularDistanciaEntre(new google.maps.LatLng(19.2799481,-99.669227), new google.maps.LatLng
    (19.250103, -99.601471),"1-2");

    //*************************************************************************************************************************


    // cliente 1,3
    console.log("1-3");
    calcularDistanciaEntre(new google.maps.LatLng(19.2799481,-99.669227), new
    google.maps.LatLng(19.290219, -99.659703),"1-3");


    //cliente 2,3
    console.log("2-3");
    calcularDistanciaEntre(new google.maps.LatLng(19.290219, -99.659703), new google.maps.LatLng
    (19.250103, -99.601471),"2-3");

    //*************************************************************************************************************************


    //cliente 1,4
    console.log("1-4");
    calcularDistanciaEntre(new google.maps.LatLng(19.2799481,-99.669227), new
    google.maps.LatLng(19.289384, -99.656404),"1-4");

    //cliente 2,4
    console.log("2-4");
    calcularDistanciaEntre(new google.maps.LatLng(19.250103, -99.601471), new
    google.maps.LatLng(19.289384, -99.656404),"2-4");

    //cliente 3,4
    console.log("3-4");
    calcularDistanciaEntre(new google.maps.LatLng(19.290219, -99.659703), new
    google.maps.LatLng(19.289384, -99.656404),"3-4");

    //*************************************************************************************************************************


        //*************************************************************************************************************************


}

function calcularDistanciaEntre(iniPos, endPos, puntos) {

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
    console.log("distance " + puntos + " =" + dmres.routes[0].legs[0].distance.value + "m.");
    // alert("distance=" + dmres.routes[0].legs[0].distance.value + "m.");
    var dirRender = new google.maps.DirectionsRenderer({
    map:map,
    directions:dmres
    });
    }
    });


}

function marcarPunto(location, nombre) {
    var marker = new google.maps.Marker({
    position: location,
    map: map
    });

    colocarNombre(marker, nombre);
}

function colocarNombre(marker, nombre) {
    var infowindow = new google.maps.InfoWindow(
    { content: nombre,
    size: new google.maps.Size(50, 50)
    });
    google.maps.event.addListener(marker, 'click', function() {
    infowindow.open(map, marker);
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