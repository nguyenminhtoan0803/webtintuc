/*
* @author Admin
* @date Dec 23, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.dangky.model.bo;
* @type_declaration public class UserRegisterBo{ }
*/
package web.tintuc.dangky.model.bo;

import web.tintuc.dangky.model.dao.UserRegisterDao;

public class UserRegisterBo {

	UserRegisterDao registerDao = new UserRegisterDao();
	
	public int userRegister(String tenNguoiDung, String email, String matKhau, 
							String sdt, String diaChi, String gioiTinh) {
		return registerDao.userRegister(tenNguoiDung, email, matKhau, sdt, diaChi, gioiTinh);
	}
}

