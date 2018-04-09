package by.epam.les08;

import java.util.Date;

public class testBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dNow = new Date();

		BankAccount acc_customer1 = new BankAccount("1234", "Aliaksandr Koren", "USD");
		BankAccount acc_customer2 = new BankAccount("1234", "Aliaksandr Koren", "USD");
		System.out.println("acc_customer1 now " + dNow + " " + acc_customer1.hashCode()); // -2040933628
		acc_customer1.setopendate(dNow);
		System.out.println("acc_customer1 now " + dNow + " " + acc_customer1.hashCode()); // 1450954280
		if (acc_customer1.addtransaction(100, "USD")) {
			System.out.println("acc_customer1 100 USD added " + acc_customer1.hashCode()); 
		};
		System.out.println("acc_customer1 " + acc_customer1.toString()); 
		if (acc_customer1.minustransaction  (100, "USD")) {
			System.out.println("acc_customer1 100 USD deducted " + acc_customer1.hashCode()); 
		}
		System.out.println("Is acc_customer1 equals to acc_customer2: " + acc_customer1.equals(acc_customer2)); 
		acc_customer2.setopendate(dNow);
		System.out.println("acc_customer2 hash " + acc_customer2.hashCode()); // 1450954280
		System.out.println("Is acc_customer1 equals to acc_customer2: " + acc_customer1.equals(acc_customer2)); 
		
	}
}
