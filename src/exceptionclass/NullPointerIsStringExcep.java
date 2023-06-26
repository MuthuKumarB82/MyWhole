package exceptionclass;

public class NullPointerIsStringExcep {
   public static void main(String[] args) {
	   try {
		   String a = null;
		   int b = a.length();
		   System.out.println(b);
	   } catch(Exception s) {
		   s.printStackTrace();
	   } finally {
		   System.out.println("Invald");
	   }
	   
   }
}
