
public class car {
	public String brand = "Fiat";
	public String model = "500";
	public int amountOfFuel = 50;
	
	
	static boolean accelerate = false;
	
	
	public void brake() {
		System.out.println("Car is braking");
	}
	
	public void acceleration() {
		if(accelerate = true) {
			System.out.println("Car is accelerating");
			System.out.println("Amount of fuel: " + (amountOfFuel -1));
		}
		
		}
		
	
	
	
	public void printData() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Amount of fuel: " + amountOfFuel);
	
	}
	
	

}
