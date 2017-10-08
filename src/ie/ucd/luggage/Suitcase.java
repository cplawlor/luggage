package ie.ucd.luggage;

public abstract class Suitcase extends Luggage{
	private double bagWeight;
	private double maxWeight;
	
	public Suitcase(double bagWeight, double maxWeight){
		this.bagWeight = bagWeight;
		this.maxWeight = maxWeight;
	}

	public double getBagWeight() {
		return bagWeight;
	}

	public double getMaxWeight() {
		return maxWeight;
	}
	
}
