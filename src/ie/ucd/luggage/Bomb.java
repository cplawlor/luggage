package ie.ucd.luggage;

public class Bomb implements Item {
		
	private String type;
	private double weight;
	
	Bomb (String type, double weight) {
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
		return true;
	}


}