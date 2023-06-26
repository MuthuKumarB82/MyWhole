package aggregationinoops;

public class Laptop {
   private String brand;
   private int price;
   private Battery battery;
   private Processor processor;
   private Display display;
   
   public void setBrand(String brand) {
	   this.brand = brand;
   }
   public String getBrand() {
	   return brand;
   }
   public void setPrice(int price) {
	   this.price = price;
   }
   public int getPrice() {
	   return price;
   }
   public void setBattery(Battery battery) {
	   this.battery = battery;
   }
   public Battery getBattery() {
	   return battery;
   }
   public void setProcessor(Processor processor) {
	   this.processor = processor;
   }
   public Processor getProcessor() {
	   return processor;
   }
   public void setDisplay(Display display) {
	   this.display = display;
   }
   public Display getDisplay() {
	   return display;
   }
      public Laptop(String brand,int price,Battery battery,Processor processor,Display display) {
    	  this.brand = brand;
    	  this.price = price;
    	  this.battery = battery;
    	  this.processor = processor;
    	  this.display = display;
      }
         public String toString() {
        	 return brand+" "+price+" "+battery+" "+processor+" "+display;
      }
}
