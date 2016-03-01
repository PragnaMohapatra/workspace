
public class Solution {

	public ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode1 p1 = l1;
		ListNode1 p2 = l2;
		ListNode1 merged = new ListNode1(0);
		ListNode1 mergedPointer = merged;

		while (l1 != null & l2 != null) {
			if (l1.val <= l2.val) {
				mergedPointer.next = l1;
				l1 = l1.next;
			} else {
				mergedPointer.next = l2;
				l2 = l2.next;
			}
			mergedPointer = mergedPointer.next;
		}

		if (l1!= null) {
			mergedPointer.next = l1;
		} 
		if(l2!=null){
			mergedPointer.next = l2;
		}
		return merged.next;
	}

	public static void main(String[] args) {
		ListNode1 listNode1 = new ListNode1(1);
		ListNode1 listNode12 = new ListNode1(3);
		ListNode1 listNode13 = new ListNode1(5);
		ListNode1 listNode14 = new ListNode1(7);
		ListNode1 listNode15 = new ListNode1(9);
		ListNode1 listNode2 = new ListNode1(2);
		ListNode1 listNode21 = new ListNode1(4);
		ListNode1 listNode22 = new ListNode1(8);
		ListNode1 listNode23 = new ListNode1(10);

		listNode1.next = listNode12;
		listNode12.next = listNode13;
		listNode13.next = listNode14;
		listNode14.next = listNode15;

		listNode2.next = listNode21;
		listNode21.next = listNode22;
		listNode22.next = listNode23;
		Solution solution = new Solution();
		ListNode1 merged = solution.mergeTwoLists(listNode1, listNode2);
		System.out.println(merged);

	}
}
