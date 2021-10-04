package oops;

public class StaticKeyword {
	

	
	public static void main(String[] args) {
	
		System.out.println("inside main");

	}
	
	static { 
		System.out.println("in block 1");
	}
	
	static {
		System.out.println("in block 2");
	}

}
