package operators;

public class LogicalOperators {
	public static void main(String[]args) {
		
		int grade = 12;
		
//		if(number>=1 && number<=100) {
//			System.out.println("Number is in the range");
//		}
		
//		if(grade ==10 || grade ==12) {
//			System.out.println("You have Board exam now");
//		}
		
		if(!(grade==10 || grade==12)) {
			System.out.println("You cannot give board exams now");
		}
		
	}

}
