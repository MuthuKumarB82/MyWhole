package java8features;

public class ForFunctionalIn {
  public static void main(String[] args) {
	  ForFunctional ff =  (int a,int b) -> {return (a+b+122);};
	          System.out.println(ff.add(10,20));
  }
}