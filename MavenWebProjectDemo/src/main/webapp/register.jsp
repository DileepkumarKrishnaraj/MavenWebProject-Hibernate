<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Details</title>
</head>
<body>
 <form action="validate" method = "post">
 	<table>
 		<tr>
 			<td><label>NAME: </label></td>
 			<td><input type="text" name = "name"></td>
 		</tr>
 		<tr>
 			<td><label>EMAIL ID: </label></td>
 			<td><input type="email" name = "email"></td>
 		</tr>
 		<tr>
 			<td><label>PHONE NUMBER: </label></td>
 			<td><input type="tel" name = "phone"></td>
 		</tr>
 		<tr>
 			<td><label>DATE OF BIRTH: </label></td>
 			<td><input type="date" name = "dob"></td>
 		</tr>
 		<tr>
 			<td colspan = "1"><input type = "submit" value = "submit"></td> 
 		</tr>
 		
 	</table>
 	</form>                            
</body>
</html>