package FunctionsTest;

public class mathRun {

	public static void main(String[] args) {
	
		
		// how to use a function 
		
		// to use a function from a class, need to create an object of the class
		
		mathCalculation xyz=new mathCalculation();
		
		car c = new car(); 
		c.go();
		int a = xyz.addTwoNumber(15, 17);
		
		int b = xyz.subTract(100, 50);
		xyz.printName("Michael");
		
		mathCalculation abc=new mathCalculation();
		
		String y = abc.findLargerNumber();
		
		System.out.println(y);
		System.out.println(b);
		

	}

}
