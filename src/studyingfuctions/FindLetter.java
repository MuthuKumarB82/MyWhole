package studyingfuctions;

public class FindLetter {
  public void Values(String a) {
	  if(a.length()%2!=0) {
		  System.out.println(a.charAt(a.length()/2));
	  }
	  else if(a.length()%2==0){
		  System.out.println(a.substring(a.length()/2,(a.length()/2)+1));
				                         
	  }
	 }
  public static void main(String[] args) {
	  FindLetter n = new FindLetter ();
	          n.Values("abcdef");
  }
}