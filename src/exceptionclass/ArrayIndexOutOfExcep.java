package exceptionclass;

public class ArrayIndexOutOfExcep {
  public static void main(String[] args) {
	  int[] a = {20,30,40,555,666,777,888};
	  try {
		 int b = a[8];
         System.out.println(b);	
	  } catch(Exception b) {
		  b.printStackTrace();
	  } finally {
		  System.out.println("Invalid");
	  }
  }
}
