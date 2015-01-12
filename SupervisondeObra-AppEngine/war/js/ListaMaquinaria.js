/**
 * 
 */function init(){
		var x = document.getElementById("bodyTable");
		var peticion = 'peticion';
		var linkCelda = "./EditMaquinaria.jsp";
			$.ajax({
				url : '/listamaquinaria',
				type : 'post',
				data : {'objectJson' : JSON.stringify(peticion)},
				success: function(data){
					for (var i = 0; i < data.length; i++){
						var checkbox = document.createElement("input");
						checkbox.type = "checkbox";    // make the element a checkbox
						checkbox.name = "checkbox";      // give it a name we can check on the server side
						checkbox.value = data[i].id_Maquinaria;
						
						var tr = document.createElement("tr");
						var td1 = document.createElement("td");
						//var td2 = document.createElement("td");
						var td3 = document.createElement("td");
						var td4 = document.createElement("td");
						var td5 = document.createElement("td");
						var td6 = document.createElement("td");
						
						td1.appendChild(checkbox);						
						//td2.innerHTML = data[i].id_Maquinaria;
						td3.innerHTML = "<a href="+linkCelda+"?idMaquinaria="+data[i].id_Maquinaria+">"+data[i].Nombre+"</a>";
						td4.innerHTML = data[i].Descripcion;
						td5.innerHTML = data[i].tipo_Maquinaria;
						td6.innerHTML = "<img src="+data[i].Path_Imagen+" style='max-width: 160px; max-height: 120px; border: none;'></>";
						
						tr.appendChild(td1);
						//tr.appendChild(td2);
						tr.appendChild(td3);
						tr.appendChild(td4);
						tr.appendChild(td5);
						tr.appendChild(td6);
						
						x.appendChild(tr);
					}
					$(document).ready(function() {
						var table = $('#exampleTable').DataTable();
						$('#exampleTable tbody').on( 'click', 'tr', function () {
							if ( $(this).hasClass('selected') ) {
								$(this).removeClass('selected');
							}
							else {
								table.$('tr.selected').removeClass('selected');
								$(this).addClass('selected');
							}
						} );

					} );
				},
				error: function(jHR,e,throwsError){
					alert(e);
				}		
		});
}
 
 var maquinariaborrar= new Array();

 $(function () {
	 maquinariaborrar=[];
 	$('#borrar').click(function () {
 	    $('#exampleTable').find('tr').each(function () {
 	        var row = $(this);
 	        if (row.find('input[type="checkbox"]').is(':checked')) {
 	        	var object = {
 	        	 		'id' : row.find('input[type="checkbox"]').val(),
 	        	 		'index' : row.index() 
 	        	 	};
 	        	maquinariaborrar.push(object);
 	        }
 	    });
 	    borrar();
 	});
 });

 function borrar() {
 	
 	var object = {
 		'borrar' : maquinariaborrar
 	};
 	$.ajax({
 		url : '/listamaquinaria',
 		type : 'post',
 		data : {
 			'objectJson' : JSON.stringify(object)
 		},
 		success : function(data) {
 			var table = $('#exampleTable').DataTable();
 			if(data.length != 0){
 				var cont = 0;
 				for (var i = 0; i < data.length; i++) {
 					table.row(data[i].index-cont).remove().draw(false);
 					cont++;
				}
 				maquinariaborrar.length = 0;
 			}
 		},
 		error : function(jHR, e, throwsError) {
 			maquinariaborrar.length = 0;
 			alert(e);
// 			window.location.reload();
 		}

 	});
 }


 
