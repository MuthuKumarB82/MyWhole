package studyingfuctions;

public class UseCar {
	public static void main(String[] args) {
		
		Car car1 = new Car ();
		car1.brand = "BMW";
		car1.color = "red";
		car1.price = 2000000;
		
		Car car2 = new Car();
		car2.brand = "ferrari";
		car2.color = "black";
		car2.price = 3000000;
		
		System.out.println(car1.findMaxPriceCar(car1,car2));
    }
}