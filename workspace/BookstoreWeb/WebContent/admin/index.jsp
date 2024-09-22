<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<div align="center">
		<h2>Administrative Dashboard</h2>
	</div>
	</br>
	<div align="center">
		<hr width="60%"/>
		<h3>Quick Action</h3>
		</br>
		<a href="create_book">New Book</a>&nbsp;
		<a href="create_user">New User</a>&nbsp;
		<a href="create_category">New Category</a>&nbsp;
		<a href="create_customer">New Customer</a>
		
	
	</div>
	</br>
	
	<div align="center">
		<hr width="60%"/>
		<h4>Recent Sales</h4>
	</div>
	</br>
	<div align="center">
		<hr width="60%"/>
		<h4>Recent Reviews</h4>
	</div>
	</br>
	<div align="center">
	<hr width="60%"/>
		<h4>Statistics</h4>
		<hr width="60%"/>
		
	</div>
	
	
	
	
	<jsp:directive.include file="footer.jsp"/>
	
</body>
</html>