package exceptionclass;

public class RetirementAgeException {
   public static void main(String[] args) throws CheckAgeException,Exception {
	   int age = 60;
	   try {
		   if(age>=58) {
			   throw new CheckAgeException("Eligible");
		   }
		   else {
			   System.out.println("Not Eligible");
		   } 
	   }
	   catch(Exception c) {
			   c.printStackTrace();
	   }
   }
}
