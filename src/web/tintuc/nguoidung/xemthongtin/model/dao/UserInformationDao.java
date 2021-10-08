/*
* @author Admin
* @date Dec 29, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.nguoidung.xemthongtin.model.dao;
* @type_declaration public class UserInformationDao{ }
*/
package web.tintuc.nguoidung.xemthongtin.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import web.tintuc.information.user.common.bean.UserInformationCommonBean;
import web.tintuc.quanly.common.MySqlConnection;
/**
 * 
 * @author Admin
 * @version 1.0
 */
public class UserInformationDao {

	private Connection connection;
	private ResultSet resultSet;
	private PreparedStatement preparedStatement;
	MySqlConnection mySqlConnection = new MySqlConnection();
	UserInformationCommonBean userInformation;
	/**
	 * method getting user information with username
	 * @param username
	 * @return ArrayList<UserInformationCommonBean>
	 */
	public List<UserInformationCommonBean> userInformation(String username) {
		List<UserInformationCommonBean> thongTinUser = new ArrayList<UserInformationCommonBean>();
		connection = mySqlConnection.getMySQLConnection();
		String sql = "SELECT TenNguoiDung, Email, SDT, DiaChi, GioiTinh FROM nguoidung WHERE TenNguoiDung = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			if(preparedStatement != null) {
				resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					userInformation = new UserInformationCommonBean(resultSet.getString("TenNguoiDung"),
																	resultSet.getString("Email"),
																	resultSet.getString("SDT"),
																	resultSet.getString("DiaChi"),
																	resultSet.getString("GioiTinh"));
					thongTinUser.add(userInformation);
				}
			}
		}catch(SQLException e) {
			
		}finally {
			try {
				mySqlConnection.closeConnect(connection, preparedStatement, resultSet);
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return thongTinUser;
	}
}

