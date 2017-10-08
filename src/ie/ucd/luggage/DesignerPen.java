package ie.ucd.luggage;

public class DesignerPen extends Pen implements Item{
	private String brand;
		
	public DesignerPen(String brand, String type, double weight ) {
		super(type, weight);
		this.brand = brand;
	}
	
	public String getType () {
		return brand;		
	}

}
