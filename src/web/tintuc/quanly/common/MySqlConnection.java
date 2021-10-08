/*
* @author Admin
* @date Dec 23, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.quanly.common;
* @type_declaration public class MySqlConnection{ }
*/
package web.tintuc.quanly.common;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import java.sql.Connection;
public class MySqlConnection {

	public java.sql.Connection getMySQLConnection() {
		String hostName = "localhost";
		String dbName = "musicshop";
		String userName = "root";
		String password = "";
		Connection connect = null;
		// khai bao class driver cho db mysql
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// cau truc url connection danh cho mysql
			String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName;
			
			connect =  DriverManager.getConnection(connectionUrl, userName, password);
		} catch (ClassNotFoundException ex) {
			
			System.out.println(ex.getMessage());
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connect;
	}
	
	public void closeConnect(Connection connect, PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {
		if(connect != null) {
			connect.close();
		}
		if(preparedStatement != null) {
			preparedStatement.close();
		}
		if(resultSet != null) {
			resultSet.close();
		}
	}
}
