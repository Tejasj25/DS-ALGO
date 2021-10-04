package abstraction;

public class RepairShop {


	public static void repairCar(Car car) {
		System.out.println("Car is Repaired");
	}

	public static void main(String[] args) {
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		
		repairCar(wagonR);
		repairCar(audi);
		
	}

}
