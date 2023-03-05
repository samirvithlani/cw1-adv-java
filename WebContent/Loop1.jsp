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
	int x=22;
%>
	<%=x %>



<%
	for(int i=1;i<=10;i++){
		
%>
	<font size = "<%=i%>">
		<%=i %>
	</font>
<%} %>

</body>
</html>