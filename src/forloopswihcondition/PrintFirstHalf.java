package forloopswihcondition;

public class PrintFirstHalf {
  public static void main(String[] args) {
	  int[] nums = {24,42,62,78,88,98};
	  
	  for(int i=0; i<nums.length/2; i++) {
		  System.out.println(nums[i]);
	  }
	  for(int i=nums.length/2; i<nums.length; i++) {
		  System.out.println(nums[i]);
	  }
  }
}