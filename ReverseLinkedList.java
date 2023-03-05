package leetcode;

public class ReverseLinkedList {
	
	public LisNode reverseList(LisNode head) {
		
		LisNode prev = null;
		LisNode current = head;
		LisNode next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	public static LisNode reverse(LisNode head) {
		if(head==null || head.next == null) {
			return head;
		}
		
		LisNode rest = reverse(head.next);
		head.next.next = head;
		
		head.next = null;
		
		return rest;
	}

	public static void main(String[] args) {
		
	}

}
class LisNode {
     int val;
     LisNode next;
     LisNode() {}
     LisNode(int val) { this.val = val; }
     LisNode(int val, LisNode next) { this.val = val; this.next = next; }
}