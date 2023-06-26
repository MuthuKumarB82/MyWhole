package forloopswihcondition;

public class PrintArrayNum {
  public static void main(String[] args) {
	  int[] nums = {10,20,34,45,78,89};
	  for(int i=0; i<nums.length; i++) {
		  System.out.println(nums[i]);
	  }
	  for(int i=nums.length-1; i>=0; i--) {
		  System.out.println(nums[i]);
	  }
  }
}