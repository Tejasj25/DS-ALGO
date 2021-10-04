package interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		Person obj = new Person();
		
		obj.study();
		obj.makeVideo();
	}
	
	public void study() {
				System.out.println("Person is Studying");
	}
	
	public void makeVideo() {
		System.out.println("Person is making good video");
	}

}
