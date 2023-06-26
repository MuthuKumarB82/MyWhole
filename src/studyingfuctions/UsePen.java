package studyingfuctions;

public class UsePen {
  public static void main(String[] args) {
	  Pen pen1 = new Pen();
	  
	   pen1.brand = "Apsara";
	   pen1.price = 20;
	   pen1.color = "Blue";
	   
	   Pen pen2 = new Pen ();
	   pen2.brand = "Cello";
	   pen2.price = 35;
	   pen2.color = "Black";
	   
	   Pen pen3 = new Pen ();
	   pen3.brand = "Faber";
	   pen3.price = 40;
	   pen3.color = "Green";
	   
	   System.out.println(pen2.findStartsWithA(pen1,pen2,pen3));
  }
}