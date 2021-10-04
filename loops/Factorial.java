package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int factorial=1;
		
		for(int i=n;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}

//Basically the factorial of any number means E.g - 5! = 5*4*3*2*1=120
