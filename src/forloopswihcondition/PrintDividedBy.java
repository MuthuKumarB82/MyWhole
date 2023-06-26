package forloopswihcondition;

public class PrintDividedBy {
  public static void main(String[] args) {
	  int[] nums = {10,20,30,40,50,60,70,80,90};
	  
	  for(int i=0; i<nums.length; i++) {
		  if(nums[i]%2==0 && nums[i]%3==0) {
			  System.out.println(nums[i]);
		  }
	  }
  }
}
