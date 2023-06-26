package studyingfuctions;

public class FindMaximum {
	public int findmax() {
    int[] nums = {10,20,30,40,50,60};
    int max = nums[0];
    for(int i=0; i<nums.length; i++) {
    	if(nums[i]>max) {
    		max = nums[i];
    	}
    }  
    return max;
}
	public static void main(String[] args) {
		FindMaximum a = new FindMaximum ();
		System.out.println(a.findmax());
	}
}
