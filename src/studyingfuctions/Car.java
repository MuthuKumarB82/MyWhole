package studyingfuctions;

public class Car {
	String brand;
	String color;
	int price;
	public String findMaxPriceCar(Car a,Car b) {
		if(a.price>b.price) {
			return a.brand;
		}
		else {
			return b.brand;
		}
	}
}
