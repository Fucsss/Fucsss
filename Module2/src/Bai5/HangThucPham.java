package Bai5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HangThucPham {
	private String MaHang;
	private String TenHang;
	private double DonGia;;
	private LocalDate NgaySanXuat = LocalDate.now();
	private LocalDate NgayHetHan = NgaySanXuat;
	
	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		try {
			setMaHang(maHang);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	
	public String getMaHang() {
		return MaHang;
	}
	private void setMaHang(String maHang) throws Exception {
		if(!MaHang.trim().equals("")){
			MaHang = maHang;
		}else {
			throw new Exception("Lỗi: Mã hàng rỗng!");
		}
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		DonGia = donGia;
	}
	public LocalDate getNgaySanXuat() {
		return NgaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		NgaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return NgayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		NgayHetHan = ngayHetHan;
	}
	
	public boolean hetHan() {
		if(this.NgayHetHan.isBefore(LocalDate.now())) {
			return true;
		}else {
			return false;
		}
	}
	private String GhiChu() {
		if(this.hetHan()) {
			return "Hàng hết hạn";
		}else {
			return "";
		}
	}
	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat dt = new DecimalFormat("#,##0.00");
		String s = "";
		s += s.format("%-10s %-10s %-20s %-15s %-15s %-15s", this.MaHang, this.TenHang, dt.format(DonGia), df.format(NgaySanXuat), df.format(NgayHetHan),this.GhiChu());
		return s;
	}
}
