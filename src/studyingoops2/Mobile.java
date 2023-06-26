package studyingoops2;

public class Mobile extends Electronics {
	String model;
	int price;
	String color;
	
//	public Mobile(String brand,Boolean isQuality,String model,int price,String color) {
//	  super(brand,isQuality);
//       this.model = model;
//       this.price = price;
//       this.color = color;
//	}
	public String toString() {
		return super.toString()+model+price+color;
	}
}
