package Module1;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap mot chuoi: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int counter = 0;
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == 'a') {
				counter ++;
			}
		}
		System.out.println("Ki tu a xuat hien " + counter + " lan trong chuoi!");
	}
}
