package forloopswihcondition;

public class PrintMarks {
  public static void main(String[] args) {
	  int[] marks = {65,73,26,35,65,46,82,3,56,76,26};
	  int count1 = 0;
	  int count2 = 0;
	  
	  for(int i=0; i<marks.length; i++) {
		  if(marks[i]>=0 && marks[i]<=50) {
			  count1 = count1+1;
		  }
		  else if(marks[i]>=51 && marks[i]<=100) {
			  count2 = count2+1;
		  }
	  }
	  System.out.println("MARKS IS FROM 1 to 50 = "+count1);
	  System.out.println("MARKS IS FROM 51 to 100 = "+count2);
  }
}
