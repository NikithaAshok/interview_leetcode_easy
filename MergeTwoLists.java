package leetcode;

public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//head node
		ListNode temp_node = new ListNode(0);
		ListNode current_node = temp_node;
		
		if(l1==null && l2==null) return null;
		
		if(l1!=null && l2==null) {
			current_node.next = l1;
			l1 = l1.next;
		}
		if(l1==null && l2!=null) {
			current_node.next = l2;
			l2 = l2.next;
		}
		while(l1!=null && l2!=null) {
			if(l1.val < l2.val) {
				current_node.next = l1;
				l1 = l1.next;
			}
			else{
				current_node.next = l2;
				l2 = l2.next;
			}
			current_node = current_node.next;
		}
		return temp_node.next;
	}
	
}


class ListNode{
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}