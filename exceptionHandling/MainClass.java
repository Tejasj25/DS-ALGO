package exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
//		try {
////		int a= 5;
////		int b= 0;
//			
//			int [] a = new int[5];
//			
//			System.out.println(a[4]);
//		
////		int c = a/b;
//		
////		System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage() + " occured,Please check your code.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage() + " index should be in the range of 0 to size of array");
//		}catch(IllegalArgumentException e) {
//			System.out.println(e.getMessage() + " check your casting carefully");
//		}finally {
//			System.out.println("Sorry for the incovienience");
//		}
//		
//		System.out.println("Very Important Code");
//		System.out.println("need to run");
		
	fun1();
	}
	
	static void fun1(){
		int a = 5;
		int b = 3;
		
		int c = a/b;
		
		System.out.println(c);
		
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("After Delay");
	}
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
	if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger is Coming");
		}
	
	}

}
