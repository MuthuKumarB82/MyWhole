package stringmethods;

public class PrintSplit {
  public static void main(String[] args) {
	  
	  String fruits = "apple,mango,orange";
	  String[] values = fruits.split(",");
	  System.out.println(values[1]);
	  
	  System.out.println(values[0]);
  }
}
