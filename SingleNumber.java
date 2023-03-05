package leetcode;

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
		if(nums.length==1) return nums[0];
		
		
		for(int i=0;i<nums.length;i++) {
			int count =0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			
			if(count ==1) {
				return nums[i];
			}
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		int[] input = {1};
		System.out.println(singleNumber(input));
	}

}
