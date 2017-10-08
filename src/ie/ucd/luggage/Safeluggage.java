package ie.ucd.luggage;

import java.util.List;

public class safeLuggage extends Luggage  {
	int Code;
	double bagWeight;
	double maxWeight;
	public boolean Lock;
	
	
	safeLuggage(double bagWeight, double maxWeight, int Code) {
		this.bagWeight = bagWeight;
		this.maxWeight = maxWeight;
		this.Code = Code;
		Lock=false;
	}
	
	public void setCode(int newCode) {
		if (Lock) {
			Code = newCode;
			System.out.println("The new code is "+newCode);
		}
		else {
			System.out.println("Bag must be unlocked to change Code");
		}
	}
		
	public void lockLuggage() {
		if (Lock) {
			Lock=false;
			System.out.println("Bag is now locked");
		}
		else System.out.println("Bag is already locked");
	}
	
	
	public void inputCode(int tryCode) {
		if (tryCode==Code) {
			Lock = true;
			System.out.println("Correct Code");
		}
		else {
			Lock=false;
			System.out.println("Incorrect Code");
		}
	}

	public double getBagWeight() {
		return bagWeight;
	}

	public double getMaxWeight() {
		return maxWeight;
	}
	
	public void add(Item item){		
		if (Lock) super.add(item);
		else System.out.println("Luggage Locked");
	}
	
	public void removeItem(int index) {
		if (Lock) super.removeItem(index);
		else System.out.println("Luggage Locked");
	}
	
	public List<Item> getContents(){
		if (Lock) 	return super.getContents();
		else			return null;
	}
	
		
}
