package nestedForLoops;

import java.util.Scanner;

public class Patern9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i+1;j++) {
			System.out.print("*  ");
		}
		}
		for(int j=1;j<=n;j++) {
			System.out.println("* ");
		}
		System.out.println();
		
	}
}
