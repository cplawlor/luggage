package ie.ucd.luggage;

public class Laptop implements Item{
	private String type;
	private double weight;
	
	Laptop(String type, double weight){
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
