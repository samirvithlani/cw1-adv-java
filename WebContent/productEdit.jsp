<%@page import="com.bean.ProductBean"%>
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
		ProductBean productBean = (ProductBean) request.getAttribute("product");
	%>
	<form action="./productupdate">
	<input type="hidden" name="pId" value="<%=productBean.getpId()%>">
		<div>
			<label> NAME: <input type="text" name="txtPName"
				value="<%=productBean.getpName()%>">
			</label>
		</div>
		<div>
			<label> PRICE: <input type="text" name="txtPrice"
				value="<%=productBean.getpPrice()%>">
			</label>
		</div>
		<div>
		<input type="submit" value="UPDATE">
		</div>

	</form>
</body>
</html>