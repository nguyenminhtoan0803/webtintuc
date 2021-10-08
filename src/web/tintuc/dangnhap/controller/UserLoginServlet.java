package web.tintuc.dangnhap.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.tintuc.dangnhap.model.bo.UserLoginBo;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenNguoiDung = request.getParameter("tenNguoiDung");
		String matKhau = request.getParameter("matKhau");
		
		UserLoginBo informationBo = new UserLoginBo();
		
		
		if(informationBo.userLogin(tenNguoiDung, matKhau) == false) {
			String errorMessage = "Sai username hoặc password";
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("errorMessage", errorMessage);
			//request.setAttribute("errorMessage", errorMessage);
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}else {
			RequestDispatcher dispatcher =
					this.getServletContext().getRequestDispatcher("/TrangChu.jsp?username=" + tenNguoiDung);
			dispatcher.forward(request, response);
		}
	}

}
