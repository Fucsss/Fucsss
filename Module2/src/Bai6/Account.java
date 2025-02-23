package Bai6;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber = 9999999;
	private String name = "Chưa xác định";
	private double balance = 50000;
	private final double RATE = 0.035;
	
	public Account() {
		
	}
	
	public Account(long accountNumber, String name, double balance) {
		if(accountNumber > 0 && !name.equals("") && balance >= 50000) {
			this.accountNumber = accountNumber;
			this.name = name;
			this.balance = balance;
		}
	}
	
	public Account(long accountNumber, String name) {
		if(accountNumber > 0 && !name.equals("")) {
			this.accountNumber = accountNumber;
			this.name = name;			
		}
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean whithdraw(double amount, double fee) {
		if(amount > 0 && amount + fee <= balance) {
			this.balance -= amount + fee;
			return true;
		}else {
			return false;
		}
	}
	public double addInterest() {
		this.balance = this.balance*(1+RATE);
		return this.balance;
	}
	
	public boolean transfer(Account account2, double amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			account2.deposit(amount);
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		
		String s = "";
		s += "Số tài khoản: " + this.accountNumber + '\n';
		s += "Tên chủ tài khoản: " + this.name + '\n';
		s += "Số dư: " + formatter.format(this.balance) + '\n';
		return s;
 	}
}
