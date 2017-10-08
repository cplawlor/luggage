package ie.ucd.luggage;

public class Pen implements Item {
	private String type;
	private double weight;
	
	
	public Pen(String type, double weight) {
		this.type = type;
		this.weight = weight;
		
	}
	
	public String getType() {
		return type;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
	public boolean isDangerous() {
		return false;
	}

}
