package forloopswihcondition;

public class PrintEvenNum {
  public static void main(String[] arg) {
	  int[] nums = new int[6];
	  nums[0] = 10;
	  nums[1] = 21;
	  nums[2] = 22;
	  nums[3] = 44;
	  nums[4] = 48;
	  nums[5] = 81;
	  
	  for(int i=0; i<nums.length; i++) {
		if(nums[i]%2==0) {
			System.out.println(nums[i]);
		}
	  }
  }
}