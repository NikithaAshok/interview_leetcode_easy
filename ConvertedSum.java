package leetcode;
import java.util.*;

public class ConvertedSum {

	public static int convertedSum(int[] nums,int n) {
		Arrays.sort(nums);
		List<Integer> l1 = new ArrayList<Integer>();
		for(int ne:nums) {
			l1.add(ne);
		}
		for(int i=0;i<n;i++) {
			if(nums[i]<0) {
					if(ConvertedSum.checkPositive(nums[i],l1)) {
					nums[i] = -(nums[i]);
				}
			}
		}
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum + nums[i];
			
		}
		
		return sum;
		
	}
	public static boolean checkPositive(int number,List<Integer> numbers) {
		for(int i=0;i<numbers.size();i++) {
			if(numbers.contains(number)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {-1,-1,-1,1};
		int result = ConvertedSum.convertedSum(arr,arr.length);
		System.out.println(result);
		
		
	}
	
}
