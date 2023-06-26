package studyingoops2;

public class Calculator {
   public int addition(int a) {
	   return a;
   }
   public int addition(int a,int b) {
	   return a+b;
   }
   public int addition(int a,int b,int c) {
	   return a*b*c;
   }
   public static void main(String[] args) {
	   Calculator cal = new Calculator();
	   System.out.println(cal.addition(2,3,4));
   }
}
