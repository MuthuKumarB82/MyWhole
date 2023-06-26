package forwithobject;

public class UseCar {
     public static void main(String[] args) {
    	 Car car1 = new Car();
    	 car1.brand = "BMW";
    	 car1.price = 590000;
    	 car1.color = "Blue";
    	 car1.isAirBag = true;
    	 
    	 Car car2 = new Car();
    	 car2.brand = "Jagguaar";
    	 car2.price = 680308;
    	 car2.color = "red";
    	 car2.isAirBag = true;
    	 
    	 Car car3 = new Car();
    	 car3.brand = "Audi";
    	 car3.price = 788364;
    	 car3.color = "Black";
    	 car3.isAirBag = true;
    	 
    	 Car car4 = new Car();
    	 car4.brand = "Mustang";
    	 car4.price = 985633;
    	 car4.color = "yellow";
    	 car4.isAirBag = true;
    	 
    	 Car[] cars = new Car[4];
    	 cars[0] = car1;
    	 cars[1] = car2;
    	 cars[2] = car3;
    	 cars[3] = car4;
    	 
    	 int max = cars[0].price;
    	 int maxIndex = 0;
    	 for(int i=0; i<cars.length; i++) {
    		 if(cars[i].price>max) {
    			 max = cars[i].price;
    			 maxIndex = i;
    		 }
    	 }
    	 System.out.println(cars[maxIndex].brand+" "+
    	                    cars[maxIndex].price+" "+
    			            cars[maxIndex].color+" "+
   	                        cars[maxIndex].isAirBag);
    	 
    	 int len = cars[1].brand.length();
    	 int maxIndex1 = 0;
    	 for(int i=0; i<cars.length; i++) {
    		 if(cars[i].brand.length()>=len) {
    			 len = cars[i].brand.length();
    			 maxIndex1 = i;
    		 }
    	 }
    	 System.out.println(cars[maxIndex1].brand+" "+
    	                    cars[maxIndex1].price+" "+
    			            cars[maxIndex1].color+" "+
    	                    cars[maxIndex1].isAirBag);
     }
}