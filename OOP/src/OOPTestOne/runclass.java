package OOPTestOne;

public class runclass {

	public static void main(String[] args) {
		
		
	//	car c = new car();
		
	/*
	 * honda h = new honda();
	 * 
	 * h.accelerate();
	 */
		
		cartype h = new hondaType(); 
		
		cartype t = new toyotaType(); 
		
		h.go();
		
		t.go();
		
		webdriver driver = new chromedriver(); 
		webdriver driver1=new moziladriver(); 
		
		driver.sendkeys();
		
		driver1.sendkeys();
		
		

	}

}
