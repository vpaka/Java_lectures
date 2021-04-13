package lecture06;

public class Vehicle {
	
	private int vehicleid;
	private String make;
	private String model;
	private static int count=1;
	
	//default constructor
	Vehicle()
	{
		//this.vehicleid=10000;
		this.setVehicleId();
		this.make= "Unknown";
		this.model= "Unknown";
	}
	
	//parameterised constructor
	Vehicle(String make, String model)
	{
		this.setVehicleId();
		this.setMake(make);
		this.setModel(model);
		
	}
	
	
	public void setMake(String make)
	{
		this.make=make;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	private void setVehicleId()
	{
		//generates a new vehicleid every time a new object is created
		this.vehicleid=10000+this.count++;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public int getVechicleid()
	{
		return this.vehicleid;
	}
	
	public String toString()
	{
	return "Vehicle id:\t"+this.getVechicleid()+"\n"+"Make :\t"+this.getMake()+"\nModel: "
			+ "\t"+this.model;
	}
	

}
