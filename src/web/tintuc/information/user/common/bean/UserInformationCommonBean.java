/*
* @author Admin
* @date Dec 23, 2019
* @project WebTinTuc
* @package_declaration package web.tintuc.dangky.model.bean;
* @type_declaration public class UserRegisterBean{ }
*/
package web.tintuc.information.user.common.bean;
/**
 * 
 * @author Admin
 * version 1.0
 */
public class UserInformationCommonBean {
	/**
	 * tenNguoiDung
	 */
	private String tenNguoiDung;
	/**
	 * matKhau
	 */
	private String matKhau;
	/**
	 * email
	 */
	private String email;
	/**
	 * diaChi
	 */
	private String diaChi;
	/**
	 * sdt
	 */
	private String sdt;
	/**
	 * gioiTinh
	 */
	private String gioiTinh;
	/**
	 * contructor co tham so
	 * @param tenNguoiDung
	 * @param email
	 * @param diaChi
	 * @param sdt
	 * @param gioiTinh
	 */
	public UserInformationCommonBean(String tenNguoiDung, String email, String diaChi, String sdt, String gioiTinh) {
		super();
		this.tenNguoiDung = tenNguoiDung;
		this.email = email;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
	}
	/**
	 * getter tenNguoiDung
	 * @return String
	 */
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	/**
	 * setter tenNguoiDung
	 * @param tenNguoiDung
	 */
	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	/**
	 * getter matKhau
	 * @return matkhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * setter matKhau
	 * @param password
	 */
	public void setPassword(String matKhau) {
		this.matKhau = matKhau;
	}
	/**
	 * getter email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @setter email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * getter diaChi
	 * @return diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * setter diaChi
	 * @param diaChi
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * getter sdt
	 * @return sdt
	 */
	public String getSdt() {
		return sdt;
	}
	/**
	 * setter sdt
	 * @param sdt
	 */
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	/**
	 * getter gioiTinh
	 * @return gioitinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}
	/**
	 * setter gioiTinh
	 * @param gioiTinh
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	
	
}
