<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session="false"%>
<!DOCTYPE html>

<html lang="ko">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<h1>스케줄러</h1>
		</div>
	</div>
	<div class="container">
		<h2>로그인</h2>
		<form role="form">
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password">
			</div>
			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<button type="submit" class="btn btn-warning btn-lg">Sign in</button>
			<a href="./Join" class="btn btn-primary btn-lg" role="button">Join</a>
		</form>
		 


	</div>
	${str }
</body>
</html>


<script>
	function joinBtn_onClick() {
		window.open("./login/");
		
	}
</script>

