package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter with the name of the owner account: ");
		String name =  sc.nextLine();
		
		System.out.println("Enter with the number account:");
		int number = sc.nextInt();
		
		System.out.println("Do you want you deposit some money ?: (y/n) ");
		char x = sc.next().charAt(0);
		
		
		Account account = new Account(name, number);
		
		double value=0;
		
		if (x == 'y') {
			System.out.println("Enter a deposit value:");
			value = sc.nextDouble();
			account.setValue(value);
			account.deposit();
			System.out.println("Account data: ");
			System.out.printf("Account %d, Holder: %s, Balance %.2f\n", account.getAccount_number(), account.getName(), account.getBalance());
		}
		
		else System.out.printf("Account %d, Holder: %s, Balance %.2f ", account.getAccount_number(), account.getName(), account.getBalance());
			
		
		System.out.println("\nEnter a deposit value:");
		value = sc.nextDouble();
		account.setValue(value);
		account.deposit();
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance %.2f\n", account.getAccount_number(), account.getName(), account.getBalance());
		
		
		System.out.println("\nEnter a withdraw value:");
		value = sc.nextDouble();
		account.setValue(value);
		account.withdraw();
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance %.2f ", account.getAccount_number(), account.getName(), account.getBalance());
		
		
		sc.close();
	}

}
