package com.amazon.interview1;

public class remDupsSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode firstChild = new ListNode(1);
		ListNode secondChild = new ListNode(2);
		ListNode thirdChild = new ListNode(3);
		ListNode fourthChild = new ListNode(3);

		head.next = firstChild;
		firstChild.next = secondChild;
		secondChild.next = thirdChild;
		thirdChild.next = fourthChild;
		deleteDuplicates(head);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		if (head.next == null) {
			return head;
		}
		
		ListNode p = new ListNode(0);
		p=head;
		
		while(p!=null && p.next!=null)
			if(p.val==p.next.val){
				p.next=p.next.next;
			}else{
				p = p.next;
			}
		
		return head;
	}
}
