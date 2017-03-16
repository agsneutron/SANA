/**
 * 
 */


function myDateFormatter (dateObject) {
    var d = new Date(dateObject);
    var day = d.getDate();
    var month = d.getMonth()+1;
    var year = d.getFullYear()
    if (day < 10) {
        day = "0" + day;
    }
    if (month < 10) {
        month = "0" + month;
    }
    var fecha =year + "-" + month + "-" + day;

    return fecha;
};

function listaPromotores(user_id,meta,visitados,solicitudes){
    var URL="promotores_consola?user=" + user_id;    
    URL += "&meta=" + meta;
    URL += "&visitados=" + visitados;
    URL += "&solicitudes=" + solicitudes;
    location.href = URL;
	
};