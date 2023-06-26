package forwithobject;

public class UseLaptop {
  public static void main(String[] args) {
      Laptop lap1 = new Laptop();
      lap1.brand = "Lenovo";
      lap1.price = 25000;
      lap1.color = "Blue";
      lap1.ram  = 2;
      lap1.screenType = "LED";
	  
      Laptop lap2 = new Laptop();
      lap2.brand = "Dell";
      lap2.price = 40000;
      lap2.color = "Black";
      lap2.ram  = 6;
      lap2.screenType = "LED";
      
      Laptop lap3 = new Laptop();
      lap3.brand = "Mk";
      lap3.price = 28000;
      lap3.color = "red";
      lap3.ram  = 4;
      lap3.screenType = "LED";
      
      Laptop[] laps = {lap1,lap2,lap3,};
      
      for(int i=0; i<laps.length; i++) {
    	  System.out.println("Brand = "+laps[i].brand+" : "+
                             "Price = "+laps[i].price+" : "+
    			             "color = "+laps[i].color+" : "+
                             "Ram = "+laps[i].ram+" : "+
    			             "Screen Type = "+laps[i].screenType);
      }
      int max = laps[0].price;
      String maxbrand = "";
      for(int i=0; i<laps.length; i++) {
    	  if(laps[i].price>max) {
    	  max = laps[i].price;
    	  maxbrand = laps[i].brand;
      }
  }
      System.out.println(max);
      System.out.println(maxbrand);
}
}