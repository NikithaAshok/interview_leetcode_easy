package leetcode;
//whenever there is a sorted array it is binary search
//in recursive methods always track the boundary
public class SortedArrayToBST {
	
	public TreeNode convert(int[] nums) {
		if(nums==null || nums.length==0) return null;
		
		return conversionHelper(nums,0,nums.length-1);
	}
	
	public static TreeNode conversionHelper(int[] nums,int left,int right) {
		
		if(left>right) return null;
		
		int midpoint = (left + (right-left))/2;
		TreeNode node = new TreeNode(nums[midpoint]);
		//node.left=(nums,left,midpoint-1);
		//node.right=(nums,midpoint+1,right);
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
