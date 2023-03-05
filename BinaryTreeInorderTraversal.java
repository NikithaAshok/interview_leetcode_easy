package leetcode;

import java.util.*;

public class BinaryTreeInorderTraversal {
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		/*
		 * Stack<TreeNode> stack = new Stack<TreeNode>(); List<Integer> nodes = new
		 * ArrayList<Integer>();
		 * 
		 * if(root == null) { return nodes; }
		 * 
		 * TreeNode current = root; while(current!= null || !stack.isEmpty()) {
		 * while(current!=null) { stack.push(current); current = current.left; }
		 * 
		 * current = stack.pop(); nodes.add(current.val); current = current.right; }
		 * return nodes;
		 */	
		
		List<Integer> list = new ArrayList<Integer>();
		
		helper(root,list);
		return list;
	}
	public static void helper(TreeNode node, List list) {
		
		if(node==null) return;
		
		helper(node.left,list);
		list.add(node.val);
		helper(node.right,list);
		
	}

	public static void main(String[] args) {
		
	}

}


class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode() {}
	 TreeNode(int val) { 
		 this.val = val; 
	 }
	 TreeNode(int val, TreeNode left, TreeNode right) {
		 this.val = val;
		 this.left = left;
		 this.right = right;
	 }
}

/*
 * 
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * */
