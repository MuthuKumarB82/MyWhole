package forloopswihcondition;

public class PrintNoOfCount {
  public static void main(String[] args) {
	  String[] word = {"laptops","moniters","mouse","cpu","keyboard","printer","webcams"};
	  int count1 = 0; 
	  int count2 = 0;
	  
	  for(int i=0; i<word.length; i++) {
		  if(word[i].endsWith("s")) {
			count1++;
		}
		  else {
			  count2++;
		  }
	  }
	  System.out.println("PLURAL IS "+count1); 
	  System.out.println("SINGULAR IS "+count2);
  }
}

