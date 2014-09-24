<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery-2.1.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <script src='ts/greeter.js'></script>
<h1> Hola mundo </h1>


<script>

function callJson ()
{
	$.ajax(
	{
	    headers: 
	    { 
	        Accept : "application/json"
	    },
		url: "rest/todo",
	}).done(
		function( data ) 
		{
	    	alert (data);
	    	$("#data").html (data.description);
		}
	);	
}

function callUpdateCounter()
{
	
	$.get("rest/counter/update", "", 
		function (data)
		{
	    	$("#data").html (data);
		}
	);
}

</script>


<a onClick="callJson()" >Click me</a>
<a onClick="callUpdateCounter()" >Update Counter</a>
<div id="data">

</div>

</body>
</html>