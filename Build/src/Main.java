public class Main {

	public static void main(String[] args) {
	    Car car1 = new Car("Fiat", "500", 50);
	    //car1.setModel("");
	    //System.out.println(car1.getModel());
	    
	    car1.printData();
	    
	    car1.accelerate();
	    car1.accelerate();
	    car1.accelerate();
	    car1.accelerate();
	    
	    car1.getFuel();
	    
	    car1.brake();
	}
}