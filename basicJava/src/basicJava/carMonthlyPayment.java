package basicJava;

public class carMonthlyPayment {

	public static void main(String[] args) {
		
		int basePrice = 10000; 
		int downpayment = 1000; 
		int dealerfee = 700; 
		int warrenty = 1000; 
		
		double taxprice ; 
		double totalprice; 
		double financeAmount; 
		
		double tax = 3.14/100; 
		taxprice = (basePrice + dealerfee + warrenty)*tax; 
		totalprice = taxprice + basePrice + dealerfee + warrenty;
		
		
		System.out.println(totalprice);
		
		financeAmount = totalprice - downpayment; 
		
		System.out.println(financeAmount);
		
		double monthlypayment ; 
		
		monthlypayment = financeAmount/60; 
		
		System.out.println(monthlypayment);
	}

}
