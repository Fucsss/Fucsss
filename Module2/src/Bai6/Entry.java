package Bai6;

public class Entry {

	public static void main(String[] args) {
		Account acc1 = new Account(72354, "Ted Murphy", 102000.56);
		Account acc2 = new Account(69713, "Jane Smith", 40000.00);
		Account acc3 = new Account(93757, "Edward Demsey", 759000.32);
		
		acc1.deposit(25000.85);
		acc2.deposit(500000.00);
		acc2.whithdraw(430000.75, 1000.50);
		System.out.println("Số dư của acc3: " + acc3.addInterest());
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
	}

}
