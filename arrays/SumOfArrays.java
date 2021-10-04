package arrays;
import java.util.*;

public class SumOfArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] a = new int[n]; 
		
		int sumOfArray= 0;
		
		for(int i = 1; i<n; i++) {
		    a[i] = sc.nextInt();
			sumOfArray += a[i];
		}
		System.out.println(sumOfArray);

	}

}
