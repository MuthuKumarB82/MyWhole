package usingwhilleloop;

public class FindDivisible {
   public static void main(String[] args) {
	   int[] a = {20,30,60,100};
	    for(int i=0; i<a.length;i++) {
	    	if(a[i]%3==0) {
	    		System.out.println(a[i]+" div by 6");
	    	}
	    	if(a[i]%2==0) {
	    		System.out.println(a[i]+" div by 2");
	    	}
	    	if(a[i]%3==0 && a[i]%2==0 ) {
	    		System.out.println(a[i]+" div by 3");
	    	}
	    }
   }
}
