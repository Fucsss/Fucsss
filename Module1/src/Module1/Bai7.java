package Module1;

import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class Bai7 {

	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap vao so nguyen: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2, sum = 0;
		while (i < n) {
			if(isPrime(i)) {
				sum += i;
			}
			i++;
		}
		System.out.println("Tong cua cac so nguyen to nho hon " + n + " la: " + sum);
	}

}
