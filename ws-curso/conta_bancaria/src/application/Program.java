package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there na initial deposit? (y/n)");
		char verification = sc.next().charAt(0);
		
		System.out.print("Enter initial deposit value: ");
		double balance = sc.nextDouble();
		
		Account account = new Account(accNumber, holder, balance);
		
		account.verify(verification, balance);
		
		System.out.println(account);
		
		sc.close();

	}

}
