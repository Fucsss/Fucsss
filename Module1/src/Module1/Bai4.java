package Module1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cho phuong trinh ax + b = 0");
		System.out.print("Nhap gia tri cho a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap gia tri cho b: ");
		double b = sc.nextDouble();
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			System.out.println("Phuong trinh co nghiem la: " + -b/a );
		}
	}

}
