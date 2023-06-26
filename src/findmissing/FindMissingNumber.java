package findmissing;

public class FindMissingNumber {
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,5,7,8};
    	int maxNum = 8;
    	int exactNum = maxNum*(maxNum+1)/2;
    	int temp = 0;
    	for(int i:nums) {
    		temp = temp+i;
    	}
    	System.out.println(exactNum-temp);
    }
}
