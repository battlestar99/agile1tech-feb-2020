package OOPTestOne;

public class hondaType implements cartype {

	@Override
	public void go() {
		System.out.println("it is go method");
		
	}

	@Override
	public int run() {
		System.out.println("it is run method");
		return 0;
	}

}
