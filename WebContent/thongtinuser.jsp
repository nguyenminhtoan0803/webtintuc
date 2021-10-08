<%@page import="web.tintuc.information.user.common.bean.UserInformationCommonBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<%
		ArrayList<UserInformationCommonBean> thongTinUser = (ArrayList<UserInformationCommonBean>)request.getAttribute("thongTinUser");
		for(UserInformationCommonBean infor:thongTinUser){
	%>
	<div class="page">
		<div class="form-group col-sm-6">
		<label for="username">Tên Người Dùng</label>
		<input type="text" class="form-control"  value="<%=infor.getTenNguoiDung() %>"
			placeholder="Username" readonly>
		</div>
		<div class="form-group col-sm-6">
			<label for="gmail">Email</label>
			<input type="text" class="form-control" value="<%=infor.getEmail()%>"
				placeholder="Gmail" readonly>
		</div>
		<div class="form-group col-sm-6">
			<label for="phone">Số Điện Thoại</label>
			<input type="text" class="form-control" value="<%=infor.getSdt()%>"
				placeholder="Phone" readonly>
		</div>
		<p id="errorGmail" style="color: red"></p>
		<div class="form-group col-sm-6">
			<label for="address">Địa Chỉ</label>
			 <input type="text" class="form-control" value="<%=infor.getDiaChi()%>"
				placeholder="Address" readonly>
		</div>
		<div class="form-group col-sm-6">
			<label for="gender">Giới Tính</label>
			<input type="text" class="form-control"  value="<%=infor.getGioiTinh()%>"
				placeholder="Gender" readonly>
		</div>
	</div>
	<%} %>
	<div class="footer">
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>