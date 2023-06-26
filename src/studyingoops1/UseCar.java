package studyingoops1;

public class UseCar {
 public static void main(String[] args) {
	 
	 Enggine engine1 = new Enggine("ROLLS ROYCE",250000);
	 Enggine engine2 = new Enggine("BMW",28787);
	 Enggine engine3 = new Enggine("Audi",32415);
	 Enggine engine4 = new Enggine("Ferrari",456789);
	 Enggine engine5 = new Enggine("Buggati",352698);
	 
	 Car car1 = new Car("Rolls Royce",5000000,"White",engine1);
	 Car car2 = new Car("BMW",4568878,"Black",engine2);
	 Car car3 = new Car("Audi",557272,"yellow",engine3);
	 Car car4 = new Car("Ferrari",3098000,"Grey",engine4);
	 Car car5 = new Car("Buggati",3987000,"Red",engine5);
	 
	 Car[] cars = {car1,car2,car3,car4,car5};
	 
	 int max = 0;
	 for(Car c : cars) {
		 if(c.getPrice()>max) {
			 max = c.getPrice();
		 }
	 }
	System.out.println(max);
	
//	 for(Car c : cars) {
//		 System.out.println(c.getBrand());
//	 }
	 
//	 System.out.println(car1);
//	 System.out.println(engine1);
//	 System.out.println(car2);
//	 System.out.println(engine2);
//	 System.out.println(car3);
//	 System.out.println(engine3);
//	 System.out.println(car4);
//	 System.out.println(engine4);
//	 System.out.println(car5);
//	 System.out.println(engine5);
//	 
//	 System.out.println("BRAND = "+car1.getBrand()+" "+
//	                    "PRICE = "+car1.getPrice()+" "+
//			            "COLOR = "+car1.getColor());
//	 System.out.println(engine2.getBrand()+engine2.getPrice());
	 
	 
	 
 }
}