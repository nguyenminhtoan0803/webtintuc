/*
* @author Admin
* @date Dec 23, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.dangnhap.model.dao;
* @type_declaration public class UserInformationDao{ }
*/
package web.tintuc.dangnhap.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.tintuc.quanly.common.MySqlConnection;

public class UserLoginDao{

	public Connection connection;
	public ResultSet resultSet;
	public PreparedStatement preStatement;
	MySqlConnection mySqlConnection = new MySqlConnection();
	public boolean userLogin(String tenNguoiDung, String matKhau){
		//setting flag
		boolean flag = false;
		connection = mySqlConnection.getMySQLConnection();
		
		String sql = "SELECT TenNguoiDung, MatKhau FROM nguoidung WHERE TenNguoiDung = ? AND MatKhau = ?";
		try {
			
			preStatement = connection.prepareStatement(sql);
			preStatement.setString(1, tenNguoiDung);
			preStatement.setString(2, matKhau);
			if(preStatement != null) {
				
				resultSet = preStatement.executeQuery();
				if(resultSet != null) {
					if(resultSet.next()) {
						flag = true;
					}
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			flag=false;
		}finally {
			try {
				mySqlConnection.closeConnect(connection, preStatement, resultSet);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return flag;
	}
}

