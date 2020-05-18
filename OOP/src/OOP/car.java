package OOP;

public class car {
	
	
	// global variable
	String cartype; 
	String carCompany; 
	int carMileage; 
	int x; 
	int numberOftires; 
	
	static int numberofcars; 
	
	
	
	 public car() {
	 
	  System.out.println("This is a constructor");
	 
	  }
	 
	
	public car(String cartype) {
		go();
		this.cartype=cartype;
		System.out.println("This is the second constructor");
		
	}
	
	
	
	
	
	
	
	public void go() {
		// local variable
		int x = 12; 
		
		System.out.println(this.x);
		System.out.println("This is go function");
	}
	
	
	public void go(int x) {
		
		System.out.println("this is go function");
		
	}
	
	
	public void accelerate() {
		
		
		System.out.println(x);
		System.out.println("This is accelerate function");	
		
	}
	
	public static void getworkdone() {
		
		
		
	}
	
	

}
