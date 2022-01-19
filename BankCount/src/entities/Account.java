package entities;

public class Account {
	
	private String name;
	private int account_number;
	private double balance;
	private double value;
	
	public Account(String name, int account_number) {
		this.name = name;
		this.account_number = account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount_number() {
		return account_number;
	}

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public void deposit () {
		 balance += value;
	}
	

	public void withdraw () {
		 balance -= value + 5;
	}
	
	
	
	
	

}
