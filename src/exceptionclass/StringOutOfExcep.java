package exceptionclass;

public class StringOutOfExcep {
   public static void main(String[] args) {
	   String a = "Kumar";
	   try {
		   char b = a.charAt(6);
		   System.out.println(b);
	   } catch(Exception c) {
		   c.printStackTrace();
	   } finally {
		   System.out.println("INVALID");
	   }
   }
}
