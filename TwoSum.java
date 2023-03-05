package leetcode;

import java.util.*;

public class TwoSum {
	
	static List<Integer> indices = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int[] numbers = {2,5,5,11};
		int target = 10;
		int[] result = twoSum(numbers,target);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		if(nums!=null) {
			int length = nums.length;
			int sum;
			for(int i=0;i<length;i++) {
				sum=nums[i];
				for(int j=i+1;j<length;j++) {
					if(sum+nums[j] == target)
					{
						addIndex(i);
						addIndex(j);
					}
				}
			}
		}
		
		int[] primitive = indices.stream().mapToInt(Integer::intValue).toArray();
		return primitive;
	}
	
	public static void addIndex(int val) {
		if(indices.size()<2) {
			indices.add(val);	
		}
		else {
			
		}
	}
}
