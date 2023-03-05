package leetcode;
import java.util.*;

public class SymmetricTree {
	
	public boolean isSymmetric(TreeNode root) {
		
		/*
		 * Stack<TreeNode> stack1 = new Stack<TreeNode>(); Stack<TreeNode> stack2 = new
		 * Stack<TreeNode>();
		 * 
		 * if(root == null) { return false; }
		 * 
		 * TreeNode current = root; while(current!=null || !stack1.isEmpty()) {
		 * while(current!=null) { stack1.push(current); current = current.left; } }
		 * while(current!=null || !stack1.isEmpty()) { while(current!=null) {
		 * stack1.push(current); current = current.right; } }
		 */
		
		return isMirror(root,root);
	}
	
	public boolean isMirror(TreeNode t1, TreeNode t2) {
		if(t1==null && t2==null) return true;
		if(t1==null || t2==null) return false;
		
		
		return (t1.val == t2.val) && isMirror(t1.left,t2.right);
	}

	public static void helperL(TreeNode node, List list) {
		
		if(node==null) return;
		
		helperL(node.left,list);
		list.add(node.val);
	}
	public static void helperR(TreeNode node, List list) {
		
		if(node==null) return;
		
		helperR(node.right,list);
		list.add(node.val);
	}
	public static void main(String[] args) {
		
	}

}

