package web.tintuc.nguoidung.xemthongtin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.tintuc.information.user.common.bean.UserInformationCommonBean;
import web.tintuc.nguoidung.xemthongtin.model.bo.UserInformationBo;

/**
 * Servlet implementation class UserInformationServlet
 */
@WebServlet("/userInformation")
public class UserInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInformationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		UserInformationBo informationBo = new UserInformationBo();
		List<UserInformationCommonBean> thongTinUser = new ArrayList<UserInformationCommonBean>();
		
		thongTinUser = informationBo.userInformation(username);
		if(thongTinUser != null) {
			RequestDispatcher dispatcher = 
					this.getServletContext().getRequestDispatcher("/thongtinuser.jsp");
			request.setAttribute("thongTinUser", thongTinUser);
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath() + "/TrangChu.jsp");
		}
	}

}
