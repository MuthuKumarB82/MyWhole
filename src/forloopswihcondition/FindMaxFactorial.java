package forloopswihcondition;

public class FindMaxFactorial {
  public static void main(String[] args) {
	  int[] nums = {2,8,6,7,5,10};
	  int max = 0;
	  for(int i=0; i<nums.length; i++) {
		  if(nums[i]>max) {
			  max = nums[i];
		  }
	  }
	  
	  int fact = max;
	  for(int i=1; i<max; i++) {
		  fact = fact*i;
	  }
	  System.out.println(fact);
  }
}
