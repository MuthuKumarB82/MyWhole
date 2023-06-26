package forwithobject;

public class CelingFan extends Fan {
   String color;
   boolean isFansWings;
   
   public CelingFan(String brand,int price,boolean isQuality,String color,boolean isFansWings) {
	   super(brand,price,isQuality);
	   this.color = color;
	   this.isFansWings= isFansWings;
   }
   public String toStiring() {
	   return brand+price+isQuality+color+isFansWings;
   }
}
