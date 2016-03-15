package com.amazon.interview.lastHuddle;

public class nthRowFromEnd {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode two = new ListNode(2);
		/*ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six= new ListNode(6);
		*/
		head.next=two;
		/*two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;*/
		removeNthFromEnd(head, 2);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		 if(head==null){
				return head;
			}
			int count=0;
			ListNode counter = head;
			ListNode counter1 = head;
			while(counter!=null){
				counter=counter.next;
				count++;
			}
			if(count==n){
			    head=head.next;
			    return head;
			}
			int deleteIndex=count-n-1;
			if(deleteIndex<0){
				return head=null;
			}
			while(deleteIndex>0){
				deleteIndex--;
				counter1=counter1.next;
			}
			counter1.next=counter1.next.next;
			return head;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
