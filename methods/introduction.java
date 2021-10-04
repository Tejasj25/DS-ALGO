package methods;

public class introduction {

	public static void main(String[] args) {
		
		int FirstNumber =100;
		int SecondNumber = 200;
		
		int result= maxOf(FirstNumber, SecondNumber);
		
		maxOf(200,300);
		
		System.out.println(result);	
		
		sayHi();
		
		maxOf(5);

	}
	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	static void maxOf(float d) {
		
	}
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Tejas Here");
	}
}
