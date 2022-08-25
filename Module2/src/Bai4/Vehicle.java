package Bai4;

import java.util.Scanner;

public class Vehicle{
	private String TenChuXe;
	private String LoaiXe;
	private int DungTich;
	private double TriGia;
	private double Thue;
	
	
	public Vehicle(String ten, String loai, int dungTich, double triGia) {
		this.setTenChuXe(ten);
		this.setLoaiXe(loai);
		this.setDungTich(dungTich);
		this.setTriGia(triGia);
	}
	
	
	public String getTenChuXe() {
		return TenChuXe;
	}
	
	public String getLoaiXe() {
		return LoaiXe;
	}
	
	public int getDungTich() {
		return DungTich;
	}
	
	public double getTriGia() {
		return TriGia;
	}
	
	public double getThue() {
		if(DungTich < 100) {
			return (TriGia*(1.0/100));
		}else if(DungTich <= 200){
			return (TriGia*(3.0/100));
		}else {
			return (TriGia * (5.0/100));
		}
	}
	
	public void setTenChuXe(String tenChuXe) {
		TenChuXe = tenChuXe;
	}
	
	public void setLoaiXe(String loaiXe) {
		LoaiXe = loaiXe;
	}
	
	public void setDungTich(int dungTich) {
		if(dungTich > 0) {
			DungTich = dungTich;
		}else {
			Scanner sc = new Scanner(System.in);
			int temp;
			do {
				System.out.print("Gia tri dung tich khong hop le. Nhap lai: ");
				temp = sc.nextInt();
			}while(temp <= 0);
			
			DungTich = temp;
		}
	}
	
	public void setTriGia(double triGia) {
		if(triGia > 0) {
			TriGia = triGia;
		}else {
			Scanner sc = new Scanner(System.in);
			double temp;
			do {
				System.out.print("Gia tri cua xe khong hop le. Nhap lai: ");
				temp = sc.nextDouble();
			}while(temp <= 0);
			
			TriGia = temp;
		}
	}

}	
