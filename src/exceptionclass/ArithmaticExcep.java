package exceptionclass;

public class ArithmaticExcep {
   public static void main(String[] args) {
	   try {
		   int a = 1;
		   int b = 0;
		   int c = a/b;
		   System.out.println(c);
	   }
		   catch(ArithmeticException a) {                // we can use exception here also
		   System.out.println(a);                      // o/p is arithmeticException / by zero & invalid
		   a.printStackTrace();
		   
	   } catch(Exception b) {
		   b.printStackTrace();
	   }
	   finally {
		   System.out.println("Enter is Invalid");
	   }
	   
   }
}