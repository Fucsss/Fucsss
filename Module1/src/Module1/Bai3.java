package Module1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap gia tri: ");
		int n = sc.nextInt();
		int sum = 0;
		if(n%2 != 0) {
			for(int i = 1; i <= n; i+=2) {
				sum += i;
			}
		}else {
			for(int i = 2; i <= n; i+=2) {
				sum += i;
			}
		}
		System.out.println();
		System.out.println("Gia tri cua day so la: " + sum);
	}

}
