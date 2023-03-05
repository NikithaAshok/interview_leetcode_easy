package leetcode;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {
		//creating a hashmap object with elements of input array
		HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
		//traversing every element of array
		for(int i : nums) {
			if(elements.containsKey(i)) {
				// if key is present increment the count
				elements.put(i, elements.get(i)+1);
			}
			else {
				//if key is not present put new element
				elements.put(i, 1);
			}
		}
		
		int val=0;
		for(int i:elements.keySet()) {
			nums[val] = i;
			val++;
		}
		return elements.size();
	}
	
	public static void main(String[] args) {
		int[] numbers = {0,0,1,1,1,2,2,3,3,4};
		
		int k = removeDuplicates(numbers);
		System.out.println(k);
	}

	public static int removingDuplicates(int[] nums) {
		int count =1;
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) {
				nums[count] = nums[i+1];
				count++;
			}
		}
		return count;
	}
}
