/*
* @author Admin
* @date Dec 23, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.dangnhap.model.bean;
* @type_declaration public class UserInformation{ }
*/
package web.tintuc.dangnhap.model.bean;

public class UserLoginBean {
	/**
	 * username
	 */
	private String tenNguoiDung;
	
	/**
	 * password
	 */
	private String matKhau;
	
	/**
	 * contructor khong tham so
	 */
	public UserLoginBean() {
		
	}
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public UserLoginBean(String tenNguoiDung, String matKhau) {
		super();
		this.tenNguoiDung = tenNguoiDung;
		this.matKhau = matKhau;
	}
	/**
	 * getter tenNguoiDung
	 * @return String tenNguoiDung
	 */
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	/**
	 * setter tenNguoiDung
	 * @param tenNguoiDung
	 */
	public void setUsername(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	/**
	 * getter matKhau
	 * @return String matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * setter matKhau
	 * @param matKhau
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
}

