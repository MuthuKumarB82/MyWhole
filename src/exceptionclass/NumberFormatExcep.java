package exceptionclass;

public class NumberFormatExcep {
   public static void main(String[] args) {
	   String a = "Kumar";
	   try {
		   int b = Integer.parseInt(a);
		   System.out.println(b);
	   } catch(Exception c) {
		   c.printStackTrace();
	   } finally {
		   System.out.println("INVALID");
	   }
   }
}
