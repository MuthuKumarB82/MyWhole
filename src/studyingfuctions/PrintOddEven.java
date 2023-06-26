package studyingfuctions;

public class PrintOddEven {
  public String findLetter(String x) {
		  if(x.length()%2!=0) {
			  System.out.println(x.charAt(x.length()/2)) ;
		  }
		  else if(x.length()%2==0) {
			  System.out.println(x.substring(x.length()/2,(x.length()/2)+1));
		  }
	  return "";  
  }
  public static void main(String[] args) {
	  PrintOddEven y = new PrintOddEven ();
	  System.out.println(y.findLetter("Apples"));
  }
}