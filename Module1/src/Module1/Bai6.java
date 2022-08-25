package Module1;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen: ");
		int n = sc.nextInt();
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.println(n +" khong la la so nguyen to!");
				return;
			}
		}
		System.out.println(n + " la so nguyen to!");
	}
}

