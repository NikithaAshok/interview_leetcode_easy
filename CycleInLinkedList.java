package leetcode;
import java.util.*;

public class CycleInLinkedList {
	
	public boolean hasCycle(LiNode head) {
		/*HashSet<ListNode> list = new HashSet<ListNode>();
		
		while(head!=null) {
			
			if(list.contains(head)) {
				return true;
			}
			
			list.add(head);
			
			head = head.next;
		}
		
		return false;*/
		
		//Floyd's cycle detection to find loop in singly linked list
		return true;
		
	}

	public static void main(String[] args) {
		
	}

}
class LiNode{
	int val;
	LiNode next;
	LiNode(int x){
		val = x;
		next = null;
	}
}