package ie.ucd.luggage;

public class Pen implements Item {
	private String brand;
	
	public String getType() {
		return brand;
	}
	
	public double getWeight() {
		return 1;
	}
	
	
	public boolean isDangerous() {
		return false;
	}

}
