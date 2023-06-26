package studyingfuctions;

public class Calculator {
  public String Addition (int a,int b) {
	  return "Addition = "+(a+b);
  }
  public String Subtraction(int a, int b) {
	  return "Subtraction = "+(a-b);
  }
  public static void main(String[] args) {
	  Calculator cal=new Calculator();
	  
	  System.out.println(cal.Addition(12,25));
	  System.out.println(cal.Subtraction(87,24));
  }
}
