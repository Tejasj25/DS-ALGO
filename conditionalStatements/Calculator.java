package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		
		System.out.println("Enter your operation");
		sc.nextLine();
		int operation = sc.nextLine().charAt(0);
		
		int result= 0;
		
		switch(operation){
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		default:
			System.out.println("Invalid");
			
		}
		
		System.out.println("The result is " +result);

	}

}
