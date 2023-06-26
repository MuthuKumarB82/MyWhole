package studyingoops3;

public abstract class Shirt implements Cloth {
	public String fading(String clothType) {
	   if(clothType.equalsIgnoreCase("Cotton")) {
		   return "IT CAN BE FADED";
	   }
	   else if(clothType.equalsIgnoreCase("Lyca")) {
		   return "IT CANNOT BE FADED ONE";
	   }
	   else {
		   return "NOT DEFINED";
	   }
   }
	 public String findBrand(int price) {
		 if(price>1000) {
			 return "BRANDED ONE";
		 }
		 else {
			 return "NOT BRANDED";
		 }
	 }
	 public abstract String checked(boolean isChecked);
}