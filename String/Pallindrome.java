package String;
import java.util.*;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String r = new StringBuilder(s).reverse().toString();
		
		if(s.equals(r)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
