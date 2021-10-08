/*
* @author Admin
* @date Dec 23, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.dangky.model.dao;
* @type_declaration public class UserRegisterDao{ }
*/
package web.tintuc.dangky.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import web.tintuc.quanly.common.MySqlConnection;

public class UserRegisterDao {

	public Connection connection;
	public PreparedStatement statement;
	private MySqlConnection mySqlConnection = new MySqlConnection();
	public int userRegister(String tenNguoiDung, String email, String matKhau,
							String sdt, String diaChi, String gioiTinh) {
		int result = 0;
		 connection = mySqlConnection.getMySQLConnection();
		 String sql = " INSERT INTO nguoidung(TenNguoiDung, Email, MatKhau,SDT, DiaChi, GioiTinh) "
		 			+ " VALUES(?, ?, ?, ?, ?,?)";
		 try {
				
				statement = connection.prepareStatement(sql);
				statement.setString(1, tenNguoiDung);
				statement.setString(2, email);
				statement.setString(3, matKhau);
				statement.setString(4, sdt);
				statement.setString(5, diaChi);
				statement.setString(6, gioiTinh);
				result = statement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				mySqlConnection.closeConnect(connection, statement, null);
			} catch (SQLException e) {
				
			}
		}
		 return result;
	}
}

