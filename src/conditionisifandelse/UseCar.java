package conditionisifandelse;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car ();
		c1.brand = "BMW";
		c1.color = "red";
		c1.price = 2000000;
		
		Car c2 = new Car();
		c2.brand = "audi";
		c2.color = "black";
		c2.price = 3000000;
		
		if(c2.price>c1.price) {
			System.out.println(c2.brand.toUpperCase().charAt(0));
		}
		else {
			System.out.println(c1.brand.charAt(0));
		}
	}

}
