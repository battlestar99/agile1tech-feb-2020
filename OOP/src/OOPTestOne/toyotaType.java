package OOPTestOne;

public class toyotaType implements cartype {

	@Override
	public void go() {
		System.out.println("it is go method in toyota");
		
	}

	@Override
	public int run() {
		System.out.println("it is run method in toyota");
		return 0;
	}

}
