package FunctionsTest;

public class carPaymentUtility {
	
	
	
	
	public double getTotalCarprice(int basePrice, int dealerfee, int warrenty, double tax) {
		
		double tax1=tax/100;
		
		double taxprice = (basePrice + dealerfee + warrenty)*tax1; 
		
		double totalPrice = taxprice + basePrice + dealerfee + warrenty;
		
		return totalPrice; 
		
	}
	
	
	public double getInterestrate(int creditScore) {
		
    double interestRate=0;
		
		if(creditScore>700) {
			
			interestRate =.2;
			
		}
		
      if(creditScore>650 && creditScore<700) {
			   
			interestRate =.5;
			
		}
      
      if(creditScore<650) {
			
			interestRate =.8;
			
		}
      
      return interestRate;
		
	}

}
