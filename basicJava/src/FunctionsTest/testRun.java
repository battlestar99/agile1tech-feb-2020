package FunctionsTest;

public class testRun {

	public static void main(String[] args) {
		
		// tf is an object of the testfucntion class
		// tf in an instance of the testfunction class
		testFunction tf=new testFunction(); 
		
		tf.dosomething(15, 16);
		 tf.dosomething(100, 200);
		
		int abc = tf.dosomethingOne(100, 200);

	}

}
