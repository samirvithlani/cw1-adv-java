<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 9;
%>
<h1>
<%out.print(a); %>
<%-- <%
	if(a>=18){
		out.print("aligble...");
	}
	else{
		out.print("not...");
	}
%>
 --%>
 
 <%
 	if(a>=18){
 %>
 	<font color="blue">
 		<h2>ELIGIBLE...</h2>
 	</font>
 <%}
 	else{
 %>
 	<font color="red">
 		<h2>not ELIGIBLE...</h2>
 	</font>
 <%} %>
 
 
 
 
 
</h1>
</body>
</html>