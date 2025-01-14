package MonHoc;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MonHoc {
	private String MaMH;
	private String TenMonHoc;
	private Calendar NgayMoLop;
	private String HoTenGV;

	public String getMaMH() {
		return MaMH;
	}
	public void setMaMH(String maMH) {
		MaMH = maMH;
	}
	public String getTenMonHoc() {
		return TenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		TenMonHoc = tenMonHoc;
	}
	public Calendar getNgayMoLop() {
		return NgayMoLop;
	}
	public void setNgayMoLop(Calendar ngayMoLop) {
		NgayMoLop = ngayMoLop;
	}
	public String getHoTenGV() {
		return HoTenGV;
	}
	public void setHoTenGV(String hoTenGV) {
		HoTenGV = hoTenGV;
	}
	public MonHoc() {
	
	}
	public MonHoc(String maMH, String tenMH, Calendar ngayMoLop, String hoTenGV){
		setMaMH(maMH);
		setTenMonHoc(tenMH);
		setNgayMoLop(ngayMoLop);
		setHoTenGV(hoTenGV);
	}
	public String NhapHoc() {
		return "Nhập học thành công!\n";
	}
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String s = "";
		s += s.format("|%-10s|%-20s|%-10s|%-20s|", this.MaMH, this.TenMonHoc, df.format(this.getNgayMoLop().getTime()), this.HoTenGV);
		return s;
	}
}
