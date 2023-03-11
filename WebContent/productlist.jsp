<%@page import="java.util.List"%>
<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.List"%>
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
		List<ProductBean> products = (List<ProductBean>)request.getAttribute("product");
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>price</th>
		</tr>
		<%
			for (int i = 0; i < products.size(); i++) {

			ProductBean productBean = products.get(i);
		%>
		<tr>
			<td><%=productBean.getpId()%></td>
			<td><%=productBean.getpName()%></td>
			<td><%=productBean.getpPrice()%></td>

		</tr>
		<%
			}
		%>
	</table>
</body>
</html>