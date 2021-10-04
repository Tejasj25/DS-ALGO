package oops;

class cat{
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is Walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void description() {
		System.out.println("My cat has " + legs + " legs and " + eyes +" eyes");
	}
}

class Dog{
	String breed,name;
	
	public void jump() {
		System.out.println("My Dog "+name + " jumped");
	}
	
	public void description() {
		System.out.println("My Dog's name is " +name+" and it's breed is " +breed);
	}
}

public class MainClass {

	public static void main(String[] args) {
		
//		cat cat1 = new cat();
//		cat cat2 = new cat();
//		
//		cat1.legs=4;
//		cat1.eyes=2;
//		
//		cat2.legs=3;
//		cat2.eyes=1;
//		
//		cat1.description();
//		cat2.description();
		
		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		poodle.breed = "Poodle";
		poodle.name = "Jerry";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
	}

}
