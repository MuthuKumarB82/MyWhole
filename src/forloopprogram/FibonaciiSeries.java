package forloopprogram;

public class FibonaciiSeries {
   public static void main(String[] args) {
	   int a = 0;
	   int b = 1;
	   int c = 0;
//	   int add = 0;
	 for(int i=0; i<=5; i++) {
	System.out.println(a);
//		 add = add+a;
		   c = a+b;
		    a = b;
		    b = c;
	 }
//	 System.out.println(add);
   }
}