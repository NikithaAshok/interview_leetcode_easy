package leetcode;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		
		if(nums.length==1) return false;
		
		
		for(int i=0;i<nums.length;i++) {
			int count =0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			
			if(count ==2) {
				return true;
			}
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		
	}

}
