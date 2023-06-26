package studyingoops2;

public class UseAndroidMobile {
   public static void main(String[] args) {
//	   AndroidMobile am = new AndroidMobile ("realme",true,"realme XR23",30000,"black",6.7f,8);
//	   System.out.println("BRAND = "+am.brand+
//			              ", QUALITY = "+am.isQuality+
//			              ", MODEL = "+am.model+
//			              ", PRICE = "+am.price+
//			              ", COLOUR = "+am.color+
//			              ", OS = "+am.os+
//			              ", RAM = "+am.ram);
	   
	   
	   AndroidMobile mob = new AndroidMobile ();
	   mob.brand = "Realme";
	   mob.isQuality = true;
	   mob.model = "Realme X20";
	   mob.price = 35000;
	   mob.color = "blue";
	   mob.os = 10.7f;
	   mob.ram = 8;
	   
	   System.out.println(mob);
   }
}
