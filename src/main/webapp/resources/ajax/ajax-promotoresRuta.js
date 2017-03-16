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
    
       
    verDatos();
    
    

}


function verDatos() {
	
    
	$j.ajax({
        url: 'promotoresRuta',
        type: 'get',        
        dataType: 'json',
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {
            datosJson = data;
            despliegaTabla();
            
        },
        error: function (data) {
            alert('error!!! ' + data.status);
        }
    });
    
}

function despliegaTabla(){
	var stabla = '<table id="tablaPromotores" class="table table-bordered">'
    +'<thead>'
    +'  <tr>'
    +'    <th>Promotor</th>'
    +'    <th>Meta</th>'
    +'    <th>Visitados</th>'
    +'    <th>Solicitudes</th>'
    +'    <th></th>'
    +'  </tr>'
    +'</thead>'
    +'<tbody>';
	
    for(var i = 0, l = datosJson.lista.length; i < l; i++){
    	stabla+= '<tr>'
				+'<th scope="row">' + datosJson.lista[i].nombre + '</th>'
				+'<td>' + datosJson.lista[i].meta + '</td>'
				+'<td>' + datosJson.lista[i].visitados + '</td>'
				+'<td>' + datosJson.lista[i].solicitudes + '</td>'				
		        +'<td> <a href="javascript:listaPromotores(' + datosJson.lista[i].user_Id + ',' + datosJson.lista[i].meta + ',' + datosJson.lista[i].visitados +','+ datosJson.lista[i].solicitudes +');">Consola</a></td>'
		        +'</tr>';    
    }		
    stabla += '</tbody>'
	+'</table>'
	
	+'<script type="text/javascript">'
	+'$dr("#tablaPromotores").DataTable({'
	+'"language": {'
	+'    "lengthMenu": "Despliega _MENU_  registros por p&aacute;gina",'
	+'    "zeroRecords": "No se encontraron registros",'
	+'    "info": "Mostrando p&aacute;gina _PAGE_ de _PAGES_",'
	+'    "infoEmpty": "No hay registros disponibles",'
	+'    "search": "Buscar",'
	+'    "oPaginate":{sFirst:"First",sLast:"Last",sNext:"Siguiente",sPrevious:"Anterior"},'
	+'    "infoFiltered": "(filtrado de _MAX_ registros totales)"'
	+'   }'
	+'  } );'
	+'</script>';
	
	
	$j('#divTable').html(stabla);
	//$j('#labelFecha').html(objJson.rangoFechas);
}



