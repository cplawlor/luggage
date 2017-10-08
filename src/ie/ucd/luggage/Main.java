package ie.ucd.luggage;

public class Main {

	public static void main(String[] args){
		safeLuggage Bag = new safeLuggage(5, 30, 5678);
		Item Laptop1 = new Laptop("Dell",3);
		Item Laptop2 = new Laptop("Asus",3.5);
		Item Bomb1 = new Bomb("Dynamite",5);
		Item Bomb2 = new Bomb("C4",4);
		Item Pen1 = new Pen("Bic",0.5);
		Item Pen2 = new Pen("Staedtler", 0.4);
		
		Bag.inputCode(1234);
		Bag.add(Pen2);
		Bag.setCode(1234);
		Bag.add(Bomb2);
		Bag.inputCode(5678);
		Bag.setCode(1234);
		
		Bag.add(Laptop1);
		Bag.add(Pen1);		
		System.out.println("The Bag now weights " + Bag.getWeight());
		System.out.println("Is this bag danerous:" + Bag.isDangerous());
		
		Bag.lockLuggage();
		Bag.inputCode(1234);
		
		Bag.add(Laptop2);
		Bag.removeItem(1);
		Bag.add(Bomb1);
		System.out.println("The Bag now weights " +Bag.getWeight());
		System.out.println("Is this bag danerous:" + Bag.isDangerous());
		
		Bag.removeItem(2);
		System.out.println("The Bag now weights " +Bag.getWeight());
			
	}	
}
