package forloopprogram;

public class PrintStringReverse {
  public static void main(String[] args) {
	  String val = "Lucifer".toUpperCase();
	  String temp = "";
	  for(int i=val.length()-1; i>=0; i--) {
		  temp = temp+val.charAt(i);
		  System.out.println(temp);
	  }
	  System.out.println(temp);
  }
}