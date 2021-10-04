package loops;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		
//		for(int j=1; j<=20;j++) {
//			int n = j;
//			for(int i=1;i<=10; i++) {
//				System.out.print(n * i +" ");
//			}
//			System.out.println();
//		}
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i=1;i<=10;i++) {
			result = n*i;
			
			System.out.println(n +" x " + i + " = " +result);
		}
	}

}
