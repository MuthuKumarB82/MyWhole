package forwithobject;

public class UsePen {
   public static void main(String[] args) {
	   Pen pen1 = new Pen();
	   pen1.brand = "Forito";
	   pen1.price = 20;
	   pen1.tipSize = 0.5f;
	   
	   Pen pen2 = new Pen ();
	   pen2.brand = "Cello";
	   pen2.price = 35;
	   pen2.tipSize = 0.7f;
	   
	   Pen pen3 = new Pen ();
	   pen3.brand = "Faber";
	   pen3.price = 40;
	   pen3.tipSize = 0.55f;
	   
	   Pen pen4 = new Pen ();
	   pen4.brand = "Hero";
	   pen4.price = 30;
	   pen4.tipSize = 0.6f;
	   
	   Pen[] pens = {pen1,pen2,pen3,pen4};
	   for(Pen p : pens) {
		   System.out.println("BRAND "+p.brand+" : "+
	                          "PRICE "+p.price+" : "+
                              "TIP SIZE "+p.tipSize);
	   }
	   
	   int minprice = pen4.price;
	   String minBrand = "";
	   for(Pen p1 : pens) {
		   if(p1.price<=minprice) {
			   minprice = p1.price;
			   minBrand = p1.brand;
		   }
	   }
	   System.out.println("MINIMUM PRICE : "+minprice);
	   System.out.println("MINIMUM BRAND : "+minBrand);
   }
}