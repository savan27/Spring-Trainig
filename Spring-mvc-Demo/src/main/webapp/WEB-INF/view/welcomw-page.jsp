<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe home</title>
</head>
<body>

	<form action="processOrder" method="post">
		<div align="center">
			<h1 align="center">Welcome to MyCafe</h1>
			<hr>

			<label for="item_nmae">Item Name : </label> <input id="item_nmae"
				type="text " name="foodType" placeholder="Ente Your Choise">
			<input type="submit" value="order Now">

		</div>
	</form>

</body>
</html>