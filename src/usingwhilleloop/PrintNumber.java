package usingwhilleloop;

public class PrintNumber {
   public static void main(String[] args) {
//	   int i=0;
//	   while(i<=20) {
//		   System.out.println(i);
//		   i++;
//	   }
	   
//	   int i=10;
//	   while(i>=1) {
//		   System.out.println(i);
//		   i--;
//	   }
	   int[] a = {30,40,50,60};
	   int max = 0;
	   int i=0;
	   while(i>=a.length) {
		   if(a[i]>=max) {
			   max = max+a[i];
		   }
		   i++;
	   }
	   System.out.println(max);
   }
}
