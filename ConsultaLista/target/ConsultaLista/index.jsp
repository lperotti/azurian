<!DOCTYPE HTML>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
	
	<link href="https://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.3.1/lumen/bootstrap.min.css">
    
    <script>
    $( document ).ready(function() {
   
    	var URL = window.location.protocol + "//" + window.location.host + "/ConsultaListaRestService/consulta"
    	
    	$.ajax({
    	    type: "GET",
    	    dataType: "json",
    	    url:	URL,
    	})
    	 .done(function( data, textStatus, jqXHR ) {
    		 
    		 $.each(data.nombres, function( index, value ) {
    			 
    			 $( "#table tbody" ).append( "<tr><td>"+value.id+"</td><td>"+value.nombre+"</td><td>"+value.aPaterno+"</td><td>"+value.aMaterno+"</td><td>"+value.edad+"</td></tr>" );

   			 });

    	 })
    	 .fail(function( jqXHR, textStatus, errorThrown ) {
    	     console.log( "La solicitud a fallado: " +  textStatus);
    	});

    });
    </script>
	
	<title>Consulta Lista</title>
</head>

<body>

<input type="text" id="input">

<table id="table" class="table table-bordered table-striped">
  <thead>
    <tr>
      <th>ID</th>
      <th>Nombre</th>
      <th>Apellido Paterno</th>
      <th>Apellido Materno</th>
      <th>Edad</th>
    </tr>
  </thead>
  <tbody>
    
  </tbody>
</table>	

<footer>
	<p>Copyright 2019 Luis Perotti Bravo</p>
</footer>

</body>
<script src="table_search.js"></script>
<script>
	$('#input').keyup(function () {
	  table_search($('#input').val(),$('#table tbody tr'),'012');
	});
</script>

</html>