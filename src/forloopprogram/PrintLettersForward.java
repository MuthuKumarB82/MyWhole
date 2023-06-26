package forloopprogram;

public class PrintLettersForward {
  public static void main(String[] args) {
	  String country = "Denmark".toUpperCase();
	  for(int i=0; i<country.length(); i++) {
		  System.out.println(country.charAt(i));  
	  }
	  for(int i=country.length()-1; i>=0; i--) {
		  System.out.println(country.charAt(i));
	  }
  }
}