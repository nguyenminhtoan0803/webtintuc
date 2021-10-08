/*
* @author Admin
* @date Dec 23, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.dangnhap.model.bo;
* @type_declaration public class UserInformationBo{ }
*/
package web.tintuc.dangnhap.model.bo;

import web.tintuc.dangnhap.model.dao.UserLoginDao;

public class UserLoginBo {

	UserLoginDao userLoginDao = new UserLoginDao();
	public boolean userLogin(String tenNguoiDung, String matKhau) {
		return userLoginDao.userLogin(tenNguoiDung, matKhau);
	}
}

