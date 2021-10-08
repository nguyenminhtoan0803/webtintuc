<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
	.page{
		width:100%;
		height: 500px;
	}
	.footer{
		text-align:center;
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
	<%
		String error = (String) session.getAttribute("errorMessage");
	%>
	<div class="page">
		<form action="login" method="post">
			<div class="form-group col-sm-6">
				<label for="username">Username</label>
				<input type="text" class="form-control" id="tenNguoiDung" name="tenNguoiDung"
					placeholder="Username">
			</div>
			<div class="form-group col-sm-6">
				<label for="password">Password</label>
				<input type="password" class="form-control" id="matKhau" name="matKhau"
					placeholder="Password">
			</div>
			<button type="submit" class="btn btn-primary" style="margin-left:100px">Submit</button>
			<%--hien thi message loi khi dang nhap khong thanh cong --%>
			<%
				if (error != null) {
			%>
			<p style="color: red;"><%=error%></p>
			<%
				}
			%>
		</form>
	</div>
	<div class="footer">
		<jsp:include page="footer.jsp" />
	</div>
</body>
</html>