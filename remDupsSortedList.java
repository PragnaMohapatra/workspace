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
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode iterator = new ListNode(0);
		iterator = head;
		ListNode current = new ListNode(0);
		current=head;
		while (iterator != null) {
			if (iterator.val == iterator.next.val) {
				iterator = iterator.next;
				continue;
			} else {
				current.next = iterator.next;
				current = current.next;
				iterator = iterator.next;
			}
		}
		current.next=null;
		return current;
	}
}
