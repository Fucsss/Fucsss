package Module1;

import java.util.Scanner;

public class Bai5 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap gia tri cho a: ");
		int a = sc.nextInt();
		System.out.print("Nhap gia tri cho b: ");
		int b = sc.nextInt();
		int temp;
		
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		
		System.out.println("Uoc chung lon nhat hai so la: " + a);
	}

}
