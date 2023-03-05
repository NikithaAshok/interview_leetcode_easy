package leetcode;
import java.util.*;

public class MissingNumber {
	
	public static int missingNumber(int[] nums) {
        
		HashSet<Integer> elements = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			elements.add(nums[i]);
		}
		
		int size = nums.length;
		
		for(int i=0;i<=size;i++) {
			if(!elements.contains(i)) {
				return i;
			}
		}
		return 0;
    }

	public static void main(String[] args) {
		int[] input = {0,1};
		System.out.println(MissingNumber.missingNumber(input));
	}

}
