package studyingoops1;

public class UseBike {
  public static void main(String[] args) {
	  
	  Engine engine = new Engine();
	  engine.brand = "TVS";
	  engine.enginecc = 250;
	 
	  Bike bike = new Bike();
	  bike.brand = "TVS";
	  bike.price = 200000;
	  bike.color = "Blue+Black";
	  bike.engine = engine;
	  
	  System.out.println("PRICE = "+bike.price);
	  System.out.println("COLOUR = "+bike.color);
	  System.out.println("ENGINE CC = "+bike.engine.enginecc);
	  
  }
}
