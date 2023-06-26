package exceptionclass;

public class CheckVoterAge {
   public static void main(String[] args) throws CheckAgeException,Exception {
	   int age = 21;
	   try {
		   if(age>=18) {
			   throw new CheckAgeException("Eligible");
		   }
		   else {
			   System.out.println("Not Eligible");
		   }
	   } catch(Exception b) {
	          b.printStackTrace();
	   }
   }
}
