package factorialprogram;

import java.util.stream.LongStream;

public class FactorialUsingLamda {
	
	  public static long factorialStreams(long n) {	        
	        return LongStream.rangeClosed(2,n).reduce(1,(long x,long y) -> x*y);	        
	    }
	    
	     public static void main(String[] args) {
	        long n = 5;  
	        long fact;  
	           fact  = factorialStreams(n);
	      System.out.println("The Factorial[using For Lambda Expression] of "+n+" is "+fact); 
	     }
}
