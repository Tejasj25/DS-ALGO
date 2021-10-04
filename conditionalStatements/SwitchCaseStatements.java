package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
//		
//		int dayOfWeek = 0;
//		
//		switch(dayOfWeek) {
//		case 1:
//			System.out.println("I'm on leave");
//			break;
//		case 2:
//			System.out.println("I'm in office");
//			break;
//		case 3:
//			System.out.println("I am playing Footbal");
//			break;
//		default:
//			System.out.println("I don't know what day it is?");
//		}
		
		int rating = 2;
		
		switch(rating) {
		case 1: 
		case 2:
			System.out.println("Bad Review");
			break;
		case 3:
			System.out.println("Average Review");
			break;
		case 4:
		case 5:
			System.out.println("Good Review");
			break;
		}
	}

}
