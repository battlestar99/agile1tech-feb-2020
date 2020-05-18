package OOP;

public class runClass2 {

	public static void main(String[] args) {


		car ab = new car("fdfad");
		
		car ac = new car("sedan");
		
		System.out.println(ac.cartype);
		System.out.println(ab.cartype);
		
		ab.go();
		
		ac.go(12);
	}

}
