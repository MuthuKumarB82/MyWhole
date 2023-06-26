package aggregationinoops;

public class Display {
     private int size;
     private String type;
       public void setSize(int size) {
    	   this.size = size;
       }
       public int getSize() {
    	   return size;
       }
       public void setType(String type) {
    	   this.type = type;
       }
       public String getType() {
    	   return type;
       }
       public Display(int size,String type) {
    	   this.size = size;
    	   this.type = type;
       }
       public String toString() {
    	   return size+" "+type;
       }
}
