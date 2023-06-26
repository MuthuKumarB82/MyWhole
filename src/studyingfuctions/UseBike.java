package studyingfuctions;

public class UseBike {
   public static void main(String[] args) {
	   Bike bike1 = new Bike ();
	   bike1.brand = "Pulsar250";
	   bike1.price = 175000;
	   bike1.color = "Black+Red";
	   
	   Bike bike2 = new Bike();
	   bike2.brand = "KTM";
	   bike2.price = 250000;
	   bike2.color =  "Orange+black";
	   
	   Bike bike3 = new Bike();
	   bike3.brand = "Apache";
	   bike3.price = 200000;
	   bike2.color ="White+black";
	   
	   Bike bike4 = new Bike();
	   bike4.brand = "FZs";
	   bike4.price = 200000;
	   bike4.color = "Red";
	   
	   Bike[] bikes = {bike1,bike2,bike3,bike4};
	   System.out.println(bike1.findMax(bikes));
   }
}
