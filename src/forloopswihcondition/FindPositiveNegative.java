package forloopswihcondition;

public class FindPositiveNegative {
  public static void main(String[] args) {
	  int[] nums = {50,-24,-56,78,-92,53,-24,79,-21};
	  int count1 = 0;
	  int count2 = 0;
	  for(int i=0; i<nums.length; i++) {
		  if(nums[i]>0) {
			  count1++;
		  }
		  else if(nums[i]<0) {
			  count2++;
		  }
	  }
	  System.out.println("POSITIVE NUMBERS ARE "+count1+" IN THE GIVEN");
	  System.out.println("NEGATIVE NUMBERS ARE "+count2);
  }
}
