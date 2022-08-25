package Bai4;

import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle xe1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
		Vehicle xe2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
		Vehicle xe3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
		
		System.out.printf("%-25s	%-15s	%15s	%20s	%20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		
		System.out.printf("%-25s	%-15s	%15d	%20.2f	%20.2f\n", xe1.getTenChuXe(), xe1.getLoaiXe(), xe1.getDungTich(), xe1.getTriGia(), xe1.getThue());
		System.out.printf("%-25s	%-15s	%15d	%20.2f	%20.2f\n", xe2.getTenChuXe(), xe2.getLoaiXe(), xe2.getDungTich(), xe2.getTriGia(), xe2.getThue());
		System.out.printf("%-25s	%-15s	%15d	%20.2f	%20.2f\n", xe3.getTenChuXe(), xe3.getLoaiXe(), xe3.getDungTich(), xe3.getTriGia(), xe3.getThue());
	}

}
