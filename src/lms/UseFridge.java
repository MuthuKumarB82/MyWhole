package lms;

public class UseFridge {
   public static void main(String[] args) {
	   
	   String[] value1 = args[0].split("@");
	   
	   Fridge fridge1 = new Fridge();
	   fridge1.brand = value1[0];
	   fridge1.price = Integer.parseInt(value1[1]);
	   fridge1.color = value1[2];
	   fridge1.taxAmount = Integer.parseInt(value1[3]);
	   fridge1.netPrice = fridge1.price+fridge1.taxAmount;
	   
	   String[] value2 = args[1].split("@");
	   
	   Fridge fridge2 = new Fridge();
	   fridge2.brand = value2[0];
	   fridge2.price = Integer.parseInt(value2[1]);
	   fridge2.color = value2[2];
	   fridge2.taxAmount =Integer.parseInt(value2[3]);
	   fridge2.netPrice = fridge2.price+fridge2.taxAmount;
	   
	   System.out.println("Brand = "+fridge1.brand.toUpperCase()+" , "+fridge2.brand.toUpperCase()+" "+
			               "Color = "+fridge1.color.toLowerCase()+" , "+fridge2.color.toLowerCase()+" "+
			                "NetPrice = "+fridge1.netPrice+" , "+fridge2.netPrice);
   }
}
