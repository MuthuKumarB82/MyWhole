package forloopprogram;

public class SkipNumbers {
  public static void main(String[] args) {
	  for(int i=1; i<=10; i++ ) {
		  if(i==5) {
			  System.out.println(i);
			  break;
		  }
		  System.out.println(i);
	  }
	  for(int i=1; i<=10; i++) {
		  if(i==4) {
			  continue;
		  }
		  System.out.println(i);
	  }
	  for(int i=1; i<=10; i++) {
		  if(i==3) {
			  System.out.println(i);
			  continue;
		  }
		  System.out.println(i);
	  }
  }
}