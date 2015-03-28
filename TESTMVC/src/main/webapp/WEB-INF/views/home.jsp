<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<html>
<head>	
	<title>Home JINSUB!</title>
</head>
<body>
<h1>
	HELLO JINSUB!
</h1>
<input type ="button" id="testBtn" name="testBtn" value="testbtn" onclick="testBtn_onClick()">

<p>${greeting}
</body>
</html>

 <script>
 
 function testBtn_onClick(){
	alert("how was your meeting?"); 
 }
	
	
	
</script>

