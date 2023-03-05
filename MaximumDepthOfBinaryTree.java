package leetcode;
import leetcode.TreeNode;

public class MaximumDepthOfBinaryTree {
	
	public static int maxDepth(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int left_depth = maxDepth(root.left);
		int right_depth = maxDepth(root.right);
		
		if(left_depth > right_depth) {
			return left_depth + 1;
		}
		else {
			return right_depth + 1;
		}
	}

	public static void main(String[] args) {
		
	}

}
//class TreeNode {
//    int val;
//    TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
//}