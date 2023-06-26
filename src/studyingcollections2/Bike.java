package studyingcollections2;

public class Bike {
   private String brand;
   private int regNo;
   private String color;
   private int price;
   private boolean isPetrol;
   
   public void setBrand(String brand) {
	   this.brand = brand;
   }
   public String getBrand() {
	   return brand;
   }
   public void setRegNo(int regNo) {
	   this.regNo = regNo;
   }
   public int getRegNo() {
	   return regNo;
   }
   public void setColor(String color) {
	   this.color = color;
   }
   public String getColor() {
	   return color;
   }
   public void setIsPetrol(boolean isPetrol) {
	   this.isPetrol = isPetrol;
   }
   public boolean getIsPetrol() {
	   return isPetrol;
   }
   public Bike(String brand,int regNo,String color,int price,boolean isPetrol) {
	   this.brand = brand;
	   this.regNo = regNo;
	   this.color = color;
	   this.price = price;
	   this.isPetrol = isPetrol;
   }
   public String toString() {
	   return brand+" "+regNo+" "+color+" "+price+" "+isPetrol;
   }
}