package studyingswitch;

public class Calculator {
   public static void main(String[] args) {
	   int num1 = 20;
	   int num2 = 40;
	  String cal = "multiply".toLowerCase();
	  switch(cal) {
	  case "subraction":
		  System.out.println(num1-num2);
		  break;
	  case "multiply":
		  System.out.println(num1*num2);
		  break;
	  case "division":
		  System.out.println(num1/num2);
		  break;
	  case "addition":
		  System.out.println(num1+num2);
		  break;
	  default:
		  System.out.println("No value");
	  }
   }
}
