package leetcode;
import java.util.*;

public class IntersectionOfTwoArrays {
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		
		List<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> hash1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hash2 = new HashMap<Integer, Integer>();
		int i;
		
		//A hashmap of first array with frequency of each element 
		for(i=0;i<nums1.length;i++) {
			if(hash1.containsKey(nums1[i])) {
				hash1.put(nums1[i],hash1.get(nums1[i])+1);
			}
			else {
				hash1.put(nums1[i], 1);
			}
		}
		
		//A hashmap of second array with frequency of each element 
		for(i=0;i<nums2.length;i++) {
			if(hash2.containsKey(nums2[i])) {
				hash2.put(nums2[i],hash2.get(nums2[i])+1);
			}
			else {
				hash2.put(nums2[i], 1);
			}
		}
		
		//to check for the intersecting elements
		for(Integer key: hash1.keySet()) {
			if(hash2.containsKey(key)) {
				int x = Math.min(hash2.get(key),hash1.get(key));
				while(x--> 0) {
					result.add(key);
				}
			}
		}
		
		int[] res = new int[result.size()];
		for(i=0;i<result.size();i++) {
			res[i] = result.get(i);
		}
		return res;
			
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,3,3,1};
		int[] result = IntersectionOfTwoArrays.intersect(arr1, arr2);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
