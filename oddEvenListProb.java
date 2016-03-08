package com.amazon.interview1;

import java.util.LinkedList;
import java.util.Queue;

public class oddEvenListProb {
	
	public static void main(String... args){
		ListNode head = new ListNode(1);
		ListNode firstChild = new ListNode(2);
		ListNode secondChild = new ListNode(3);
		ListNode thirdChild = new ListNode(4);
		ListNode fourthChild = new ListNode(5);

		head.next = firstChild;
		firstChild.next = secondChild;
		secondChild.next = thirdChild;
		thirdChild.next = fourthChild;
		
		oddEvenList(head);
	}
	
	public static ListNode oddEvenList(ListNode head){
		
		if(head==null){
			return null;
		}
		if(head.next==null){
			return head;
		}
		if(head.next.next ==null){
			return head;
		}
		Queue<ListNode> odd = new LinkedList<ListNode>();
		Queue<ListNode> even = new LinkedList<ListNode>();
		int count=1;
		ListNode traveller = head;
		while(traveller!=null){
			if(count%2!=0){
				odd.add(traveller);
			}else{
				even.add(traveller);
			}
			traveller = traveller.next;
			count++;
		}
		ListNode result = new ListNode(0);
		ListNode iterator = result;
		ListNode first = new ListNode(0);
		first = odd.poll();
		first.next= null;
		
		iterator.next=first;
		iterator = iterator.next;
		while(!odd.isEmpty()){
			ListNode temp = new ListNode(0);
			temp = odd.poll();
			temp.next= null;
			iterator.next=temp;
			iterator = iterator.next;
		}
		
		while(!even.isEmpty()){
			ListNode temp = new ListNode(0);
			temp = even.poll();
			temp.next= null;
			iterator.next=temp;
			iterator = iterator.next;
		}
		return result.next;
				
	}

}
