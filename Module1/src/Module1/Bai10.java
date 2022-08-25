package Module1;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap mot chuoi: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		char arr[] = n.toCharArray();
		for(int i = 0; i < n.length(); i++) {
			if(arr[i] == ' ') {
				arr[i] = '\n';
			}
		}
		System.out.println(arr);
	}

}
