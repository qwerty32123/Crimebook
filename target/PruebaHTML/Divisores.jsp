<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Divisores positivos</title>
</head>
<body>
	
<form method="GET" action="">
	<label for="num">Número: </label>
	<input type="text" name="num"><br>
	
	<input type="submit" value="Calcular"><br>
	
</form>


	
<% String sNum = request.getParameter("num"); if(sNum != null) { %>
<%
	Integer num = Integer.parseInt(sNum);
%>
<table>
	<tr>
		<th>Divisores de <%= num %></th>
	</tr>
	<% for(int i = 1; i <= num / 2; i++) { %>
		<% if(num % i == 0) { %>
		<tr>
				<td> <%= i %> </td> 
		</tr>
		<% } %>
	<% } %>
</table>

<% } %>
	
</body>
</html>