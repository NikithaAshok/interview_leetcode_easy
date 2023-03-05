package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class PalindromeLinkedList {
	
	public boolean isPalindrome(ListNode head) {
		
		//ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev,temp;
		while(fast!=null && fast.next != null) {
			//list.add(fast.val);
			//fast = fast.next; // going to the next node
			slow = slow.next;
			fast = fast.next.next;
		} 
		prev = slow;
		slow = slow.next;
		prev.next = null;
		while(slow != null) {
			temp = slow.next;
			slow.next = prev;
			prev = slow;
			slow = temp;
		}
		fast = head;
		slow = prev;
		while(slow != null) {
			if(fast.val != slow.val) return false;
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	public static void main(String[] args) {
		
	}

}
