package lms;

public class UseCar {
	public static void main(String[] args) {
		
		String[] word = args[0].split(",");
		
		Car c1 = new Car();
		c1.brand = word[0];
		c1.price = Integer.parseInt(word[1]);
		c1.isAirBag = Boolean.parseBoolean(word[2]);
		c1.color = word[3];
				
		String[] value = args[1].split(",");
		
		Car c2 = new Car();
		c2.brand = value[0];
		c2.price = Integer.parseInt(value[1]);
		c2.isAirBag = Boolean.parseBoolean(value[2]);
		c2.color = value[3];
	
	System.out.println("Brand = "+c1.brand+" , "+c2.brand);
	System.out.println("Price = "+c1.price+" , "+c2.price);
	System.out.println("Colour = "+c1.color+" , "+c2.color);
	}

}
