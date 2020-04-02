package FunctionsTest;

import java.util.Scanner;

public class carMonthLypayment_VersionOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the base price");
		int basePrice = sc.nextInt(); 
		System.out.println("Enter the down payment");
		int downpayment = sc.nextInt();  
		System.out.println("Enter the dealer fee");
		int dealerfee = sc.nextInt(); 
		System.out.println("Enter the warrenty amount");
		int warrenty = sc.nextInt();  
		System.out.println("Enter the credit score");
		int creditScore = sc.nextInt(); 
		
		
		double taxprice ; 
		double totalprice; 
		double financeAmount; 
		double totalfinancAmount; 
		double interestRate = 0; 
		double tax = 3.14;
		
		carPaymentUtility cy = new carPaymentUtility(); 
		 totalprice = cy.getTotalCarprice(basePrice, dealerfee, warrenty, tax);
		 interestRate = cy.getInterestrate(creditScore);
		
		
		
		System.out.println("This is the total price .....");
		System.out.println(totalprice);
		
		
		
		financeAmount = totalprice - downpayment; 
		totalfinancAmount = financeAmount + (financeAmount*interestRate); 
		
		
		
		
		System.out.println("This is the financed amount .....");
		System.out.println(totalfinancAmount);
		
		double monthlypayment ; 
		
		monthlypayment = financeAmount/60; 
		System.out.println("This is the monthly payment amount .....");
		System.out.println(monthlypayment);

	}

}
