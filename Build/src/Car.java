

public class Car {
	public String brand;
	public String model;
	public int amountOfFuel;
	
	//Default Constructors
	   public Car(){
	        brand = "";
	        model = "";
	        amountOfFuel = 0;
	        
	       
	    
	    }

	    //Parameterized Constructors
	    public Car(String brand1, String model1, int amountOfFuel1){
	        brand = brand1;
	        model = model1;
	        amountOfFuel = amountOfFuel1;
	    }
	    //Getters and Setters
	    public String getModel(){
	        return model;
	    }
	    
	    public void setModel(String value){
	        model = value;
	    }
	    
	    public void getFuel() {
	    	System.out.println("Fuel: " + amountOfFuel);
	    	
	    }
	    //Refuel method
	    public void refuel(int amount){
	        System.out.println("Fuel in the tank: " + amountOfFuel);
	        System.out.println("Refuel: " + amount);
	        System.out.println("Fuel in the tank after the refuel: " + (amount + amountOfFuel)); 
	    }

	    //Brake method
	    public void brake(){
	        System.out.println("Car is breaking");
	    }
	    
	    //Accelerate method
	    public void accelerate(){
	        if(amountOfFuel > 0){
	            System.out.println("Car is accelerating");
	            amountOfFuel--;
	        }
	    }
	    
	    //Print Data
	    public void printData(){
	        System.out.println("Brand: "+ brand);
	        System.out.println("Model: "+ model);
	        System.out.println("Fuel: "+ amountOfFuel);
	    }
	}