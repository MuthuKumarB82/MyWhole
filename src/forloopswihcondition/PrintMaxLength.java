package forloopswihcondition;

public class PrintMaxLength {
  public static void main(String[] args) {
	  String[] vegs = {"onion","potato","tomato","cabbage","ladiesfinger"};
	  int max = 0;
	  String temp = "";
	  
	  for(int i=0; i<vegs.length; i++) {
		  if(vegs[i].length()>max) {
			  max = vegs[i].length();
			  temp = vegs[i];
		  }
	  }
	  System.out.println(temp.toUpperCase());
	  System.out.println(max);
	  
	  String newtemp = vegs[0];
	  for(int i=0; i<vegs.length; i++) {
		  if(vegs[i].length()<newtemp.length()) {
			  newtemp = vegs[i];
		  }
	  }
	  System.out.println(newtemp.toUpperCase());
  }
}
