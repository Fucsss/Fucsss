package HoaDon;

public class HoaDon {
	private String TenHang;
	private String DvTinh;
	private int SoLuong;
	private double GiaDonVi;
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	public String getDvTinh() {
		return DvTinh;
	}
	public void setDvTinh(String dvTinh) {
		DvTinh = dvTinh;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public double getGiaDonVi() {
		return GiaDonVi;
	}
	public void setGiaDonVi(double giaDonVi) {
		GiaDonVi = giaDonVi;
	}
	
	public HoaDon(String tenHang, String dvTinh, int soLuong, double giaDonVi) {
		setTenHang(tenHang);
		setDvTinh(dvTinh);
		setSoLuong(soLuong);
		setGiaDonVi(giaDonVi);
	}
	public double getThanhTien() {
		return SoLuong*GiaDonVi;
	}
}
