package web.tintuc.dangky.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.tintuc.dangky.model.bo.UserRegisterBo;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost(request, response);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/dangky.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenNguoiDung = request.getParameter("tenNguoiDung");
		String email = request.getParameter("email");
		String matKhau = request.getParameter("matKhau");
		String sdt = request.getParameter("sdt");
		String diaChi = request.getParameter("diaChi");
		String gioiTinh = request.getParameter("gioiTinh");
		
		UserRegisterBo bo = new UserRegisterBo();
		if(bo.userRegister(tenNguoiDung, email, matKhau, sdt, diaChi, gioiTinh) == 0) {
			String errorRegister= "Đăng ký thất bại";
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("errorRegister", errorRegister);
			//request.setAttribute("errorMessage", errorMessage);
			response.sendRedirect(request.getContextPath() + "/dangky.jsp");
		}else {
			RequestDispatcher dispatcher =
					this.getServletContext().getRequestDispatcher("/TrangChu.jsp");
			dispatcher.forward(request, response);
		}
	}

}
