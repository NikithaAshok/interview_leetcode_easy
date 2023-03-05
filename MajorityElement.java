package leetcode;

/*
 * find the element that appears number of times =  more than half the size of the array
 */

public class MajorityElement {
	
	public int majorityElement(int[] nums) {
		
		int size = nums.length/2;
		
		if(nums.length==1) return nums[0];
		
		for(int i=0;i<nums.length;i++) {
			int count =0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			
			if(count>size) {
				return nums[i];
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
	}

}
