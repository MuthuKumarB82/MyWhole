package studyingoops1;

public class UseMobile {
   public static void main(String[] args) {
	   
	   Battery bat = new Battery ();
	   bat.setType("Lithium");
	   bat.setPower(5000);
	   
	   Mobile mob = new Mobile();
	   mob.setBrand("realme");
	   mob.setPrice(20000);
	   mob.setColor("Blue");
	   mob.setBattery(bat);
	   
	   System.out.println(mob.getBrand()+":"+mob.getPrice());
	   System.out.println(bat.getType()+bat.getPower());
	   
   }
}
