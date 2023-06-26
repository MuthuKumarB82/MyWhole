package forloopswihcondition;

public class PrintStringForward {
  public static void main(String[] args) {
	  String[] animals = new String[5];
	     animals[0] = "cheetah".toUpperCase();
	     animals[1] = "wolf".toUpperCase();
	     animals[2] = "tiger".toUpperCase();
	     animals[3] = "lion".toUpperCase();
	     animals[4] = "elephant".toUpperCase();
	     
	   for(int i=0; i<animals.length; i++) {
		   System.out.println("ANIMAL : "+animals[i]);
	   }
  }
}
