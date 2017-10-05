package ie.ucd.luggage;

public class Laptop implements Item{
	
	public String getType() {
		return "ASUS";
	}
	
	public double getWeight() {
		return 3;
	}
	
	
	public boolean isDangerous() {
		return false;
	}

}
