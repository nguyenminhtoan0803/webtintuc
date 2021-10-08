<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<div class="header">
		<%
			String username = request.getParameter("username");
		%>
	
		<%
			if (username != null) {
		%>
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" 
			        		role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			         		Hello, <%=username%>
			       	 		</a>
			        		<div class="dropdown-menu" aria-labelledby="navbarDropdown">
			         			<a href="${pageContext.request.contextPath }/logout">Logout</a><br />
			         			<a href="${pageContext.request.contextPath }/userInformation?username=<%=username%>">Thong Tin</a>
			        		</div>
			     		</li>
			    	</ul>
			  	</div>
			</nav>
		
		<%
			} else {
		%>
		<a href="${pageContext.request.contextPath }/login">Login</a> 
		<a href="${pageContext.request.contextPath }/register">Đăng Ký</a>
		<%
			}
		%>
	</div>
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	     <li class="nav-item ">
	        <a class="nav-link" href="${pageContext.request.contextPath }/index" 
	           role="button">
	          Home
	        </a>
	      </li>
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" 
	           role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Sáo
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="#">Sáo Trúc</a>
	          <a class="dropdown-item" href="#">Sáo Thuyết</a>
	        </div>
	      </li>
		  <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" 
	           role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Đàn
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="#">Đàn Tranh</a>
	          <a class="dropdown-item" href="#">Đàn Bầu</a>
	          <div class="dropdown-divider"></div>
	        </div>
	      </li>
		  <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Kèn
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="#">Amoniac</a>
	          <a class="dropdown-item" href="#">SakSoPhone</a>
	          <div class="dropdown-divider"></div>
	        </div>
	      </li>
		  <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" 
	        	role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Ghita
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="#">Ghita Điện</a>
	          <a class="dropdown-item" href="#">Ghita Truyền Thống</a>
	          <div class="dropdown-divider"></div>
	          <a class="dropdown-item" href="#">Xem Thêm</a>
	        </div>
	      </li><li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" 
	        	role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         	Trống
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="#">Trống Lớn</a>
	          <a class="dropdown-item" href="#">Trống Nhỏ</a>
	          <div class="dropdown-divider"></div>
	          <a class="dropdown-item" href="#">Something else here</a>
	        </div>
	      </li>
	    </ul>
	    <form class="form-inline my-2 my-lg-0">
	      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
	      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Tìm Kiếm</button>
	    </form>
	  </div>
	</nav>
