package factorialprogram;

public class FactorialUsingRecursive {
	public static int calculateFact(int n){ 
		 if(n==0) {
            return 1; 
        }
        else {
            return n*calculateFact(n-1);  
        }   
    }
   
    public static void main(String []args){
       int n = 4;   
       int fact;  
           fact  =  calculateFact(n); 
       System.out.println("The Factorial[using For Recursion] of "+n+" is "+fact); 
    }
}
