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
		 if(head==null) return false;
	        LiNode slow = head;
	        LiNode fast = head.next;

	        while(slow!=fast){

	            if(fast == null || fast.next == null){
	                return false;
	            }
	            
	            slow = slow.next;
	            fast = fast.next.next;

	        }
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