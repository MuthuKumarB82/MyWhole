package studyingoops3;

public class AlloyVessel implements Vessel {
   public void lifetime(String material) {
	   
	   if(material.equalsIgnoreCase("Alloy")) {
		   System.out.println(material+" is long lasting");
	   }
	   
	   else {
		   System.out.println(material +" is not long lasting");
	   }
   }
}
