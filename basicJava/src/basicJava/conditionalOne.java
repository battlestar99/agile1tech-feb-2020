package basicJava;

public class conditionalOne {

	public static void main(String[] args) {
		
		int x = 10; 
		
		boolean test = (x==10);
		boolean test1=(x>102);
		boolean test2=(x<200);
     
		
		if(test2) {
			
			System.out.println("x is less than 200"); 
			
		}
		
		if(test) {
			
			System.out.println("x is equal to 10"); 
			
		}
		
		
		
		if(test1) {
			
			System.out.println("x greater than 102"); 
			
		}
		
		else {
			
			System.out.println("else statement: x is not greater than 102"); 
			
		}

	}

}
