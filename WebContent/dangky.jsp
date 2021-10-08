<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Ký</title>
<style>
	.page{
		width:100%;
		height:500px;
	}
	.footer{
		text-align: center;
	}
</style>
<jsp:include page="header.jsp" />
<script type="text/javascript" >
	function checkValidateRegisterPage(){
		var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;
		var gmail 	 = document.getElementById('gmail').value;
		var address	 = document.getElementById('address').value;
		var phone	 = document.getElementById('phone').value;
		var patternGmail =/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		var patternPhone = /(03[2|3|4|5|6|7|8|9])+([0-9]{7})\b/g; 
		//check validate cho item username
		var dem = 0;
		if(username.length == 0){
			document.getElementById('errorUsername').innerHTML = "Không để trống username";
			dem++;
		}else if(username.length < 6 || username.length > 20){
			document.getElementById('errorUsername').innerHTML = "username phải nhiều hơn 6 ký tự và ít hơn 20 ký tự";
			dem++;
		}else{
			document.getElementById('errorUsername').innerHTML = "";
		}
		//check validate cho item password 
		if(password.length == 0){
			document.getElementById('errorPassword').innerHTML = "Không để trống password";
			dem++;
		}else if(password.length < 8 || password.length > 20){
			document.getElementById('errorPassword').innerHTML = "password phải nhiều hơn 8 ký tự và ít hơn 30 ký tự";
			dem++;
		}else{
			document.getElementById('errorPassword').innerHTML = "";
		}
		//check validate cho item gmail
		if(gmail.length == 0){
			document.getElementById('errorGmail').innerHTML = "Không để trống gmail";
			dem++;
		}else if(password.length != 0 && password.length > 50){
			document.getElementById('errorGmail').innerHTML = "gmail phải ít hơn hoặc bằng 50 ký tự";
			dem++;
		}else if(password.length != 0&&patternGmail.test(gmail) == false){
			document.getElementById('errorGmail').innerHTML = "gmail phải có định dạng @gmail.com";
			dem++;
		}else{
			document.getElementById('errorGmail').innerHTML = "";
		}
		//check validate cho item address
		if(address.length != 0 && address.length > 50){
			document.getElementById('errorAddress').innerHTML = "address phải có ít hơn hoặc bằng 50 ký tự";
			dem++;
		}else{
			document.getElementById('errorAddress').innerHTML = "";
		}
		//check validate cho item phone
		if(phone.length != 0 && phone.length > 10){
			document.getElementById('errorPhone').innerHTML = "phone phải bằng 10 ký tự";
			dem++;
		}else if(phone.length != 0 && patternPhone.test(phone) == false){
			document.getElementById('errorPhone').innerHTML = "phone phải có định dạng 03xxxxxxxx";
			dem++;
		}else{
			document.getElementById('errorAddress').innerHTML = "";
			
		}
		if(dem > 0){
			return false;
		}else{
			return true;
		}
	}
</script>
</head>


<body>
	<jsp:include page="menu.jsp" />
	<%
		String error = (String) session.getAttribute("errorRegister");
	%>
	<div class="page">
		<form action="register" method="post">
				<div class="form-group col-sm-6">
					<label for="username">Tên Người Dùng<span style="color:red">*</span></label>
					<input type="text"
						class="form-control" id="" name="tenNguoiDung"
						placeholder="Username">
				</div>
				<p id="errorUsername" style="color:red"></p>
				<div class="form-group col-sm-6">
					<label for="password">Mật Khẩu<span style="color:red">*</span></label>
					<input type="password"
						class="form-control" id="password" name="matKhau"
						placeholder="Password">
				</div>
				<p id="errorPassword" style="color:red"></p>
				<div class="form-group col-sm-6">
					<label for="gmail">Email<span style="color:red">*</span></label>
					<input type="text"
						class="form-control" id="gmail" name="email"
						placeholder="Gmail">
				</div>
				<p id="errorGmail" style="color:red"></p>
				<div class="form-group col-sm-6">
					<label for="address">Địa Chỉ</label>
					<input type="text"
						class="form-control" id="address" name="diaChi"
						placeholder="Address">
				</div>
				<p id="errorAddress" style="color:red"></p>
				<div class="form-group col-sm-6">
					<label for="phone">Số Điện Thoại</label>
					<input type="text"
						class="form-control" id="phone" name="sdt"
						placeholder="Phone">
				</div>
				<p id="errorPhone" style="color:red"></p>
				<div class="form-group col-sm-6">
					<label for="gender">Giới Tính</label>
					<input type="radio" value="nam" name="gioiTinh">Nam
					<input type="radio" value="Nữ" name="gioiTinh">Nữ
				</div>
				<button type="submit" class="btn btn-primary" style="margin-left:100px" onclick="return checkValidateRegisterPage();">Submit</button>
				
				<%--hien thi message loi khi dang ky khong thanh cong --%>
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