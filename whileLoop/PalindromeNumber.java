package whileLoop;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = 0;
		
		int reversedNum = 0 ;
		
		while(temp>0) {
			
			int lastDigit = temp%10;
			
			reversedNum = reversedNum*10+lastDigit;
			temp/=10;
		}
			
			if(reversedNum == n) {
				System.out.println(n+" the number is pallindrome");
			}else {
				System.out.println(n+" the number is not pallindrome");
			}
		}
	}


