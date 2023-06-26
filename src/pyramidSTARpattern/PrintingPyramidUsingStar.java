package pyramidSTARpattern;

public class PrintingPyramidUsingStar {
  public static void main(String args[]) {      
	int row = 6;          
	for (int i=0; i<row; i++)  {                           //This loop will provide space
	  for (int j=row-i; j>1; j--) {    
	System.out.print(" ");     
	  }  
	  
	for (int j=0; j<=i; j++ )  {                           //prints star       
	      System.out.print("* ");     
	}       
	System.out.println();                                     //It will throw the cursor in a new line after printing each line
	}     
  }    
}
