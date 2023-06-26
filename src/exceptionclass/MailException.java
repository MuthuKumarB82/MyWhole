package exceptionclass;

public class MailException  {
       public static void main(String[] args) throws Exception,CheckMailException {
    	   String mail = "mk9876@gmail.com";
    	   try {
    		   if(mail.contains("@gmail.com")) {
    			   throw new CheckMailException("It is Google Mail");
    		   }
    		   else {
    			   System.out.println("It is others");
    		   }
    	   } catch (Exception s) {
    		   s.printStackTrace();
    	   }
       }
}
