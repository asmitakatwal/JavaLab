package myFirstProject;
final class Vehicle {
	private String name;
	
	Vehicle(String name){
		this.name=name;
	}
	
final void vehicleDetails() {
	System.out.println("vehicle Name "+name);
}
	
}

class Car {
	private String model;
	
	Car(String model)
	{
		this.model=model;
	}
	
	void CarDetails() {
		System.out.println("Car model "+model);
	}
}



public class FinalClass {

	public static void main(String[] args) {
		Car car=new Car("sedan");
		car.CarDetails();
		
		Vehicle vehicle=new Vehicle("Generic vehicle ");
		vehicle.vehicleDetails();
	

	}

}
