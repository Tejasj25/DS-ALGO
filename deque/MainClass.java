package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(12);
		ad.addFirst(24);
		ad.addFirst(36);
		ad.addFirst(48);
		
		System.out.println(ad.removeFirst());
		
	}

}
