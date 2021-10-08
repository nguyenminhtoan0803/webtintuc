/*
* @author Admin
* @date Dec 29, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.nguoidung.xemthongtin.model.bo;
* @type_declaration public class UserInformationBo{ }
*/
package web.tintuc.nguoidung.xemthongtin.model.bo;

import java.util.List;

import web.tintuc.information.user.common.bean.UserInformationCommonBean;
import web.tintuc.nguoidung.xemthongtin.model.dao.UserInformationDao;

public class UserInformationBo {
	
	UserInformationDao informationDao = new UserInformationDao();
	/**
	 * override method userInformation tu UserInformationDao
	 * @param username
	 * @return ArrayList<UserInformationCommonBean>
	 */
	public List<UserInformationCommonBean> userInformation(String username){
		return informationDao.userInformation(username);
	}
}

