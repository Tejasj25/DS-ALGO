package oops;

class Vehicle {
	int wheels;
	int noOfHeadLights;
	String color;
	Vehicle(){
		noOfHeadLights = 2;
	}
	
	Vehicle(int wheels, String color){
		this.wheels =wheels;
		this.color = color;
	}
}



public class MyConstructor {
		
		MyConstructor(){
			System.out.println("Object is created");
		}
	
	public static void main(String[] args) {
		Vehicle car1 = new Vehicle(4, "Black");
		Vehicle scooty = new Vehicle(2, "Blue");
		
		Vehicle eRickshaw = new Vehicle(3, "Yellow");
		
		System.out.println(eRickshaw.wheels + " Wheels and Color is " + eRickshaw.color);
	}

}
