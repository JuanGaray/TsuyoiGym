function mostrar(){
	var x;
	with(document.forms[0]){
		if(document.getElementById("rmaquina").value>0){
			x=document.forms[0].rmaquina.value;	
			alert(x);
		}
	}
}
function añadirfila(tabla) {

    var table = document.getElementById(tabla);



    var cuentaf = table.rows.length;

    var row = table.insertRow(cuentaf);



    var cell1 = row.insertCell(0);

    var element1 = document.createElement("input");

    element1.type = "checkbox";

    cell1.appendChild(element1); 



    var cell2 = row.insertCell(1);

    var element2 = document.createElement("input");

    element2.type = "text";
    
    element2.name="tipomaquina";

    cell2.appendChild(element2);
    
    
    var cell3 = row.insertCell(2);

    var element3 = document.createElement("input");

    element3.type = "text";
    
    element3.name="hora";

    cell3.appendChild(element3);
    
    
    var cell4 = row.insertCell(3);

    var element4 = document.createElement("input");

    element4.type = "text";
    
    element4.name="tiempo";

    cell4.appendChild(element4);

}



function eliminarfila(tabla) {

    try {

    var table = document.getElementById(tabla);

    var contarf = table.rows.length;



    for(var i=0; i<contarf; i++) {

         var row = table.rows[i];

         var chkbox = row.cells[0].childNodes[0];

         if(null != chkbox && true == chkbox.checked) {

              table.deleteRow(i);

              rowCount--;

              i--;

         }

    }

    }catch(e) {

         alert(e);

    }

}

