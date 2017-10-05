package ie.ucd.luggage;

public class Bomb implements Item {
	
	public String getType() {
		return "dynomite";
	}
	
	public double getWeight() {
		return 5;
	}
	
	public boolean isDangerous() {
		return true;
	}


}