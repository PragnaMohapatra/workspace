
public class LinkedListIntersection {

	public static void main(String[] args) {

		ListNode1 head1 = new ListNode1(0);
		ListNode1 head2 = new ListNode1(0);

		ListNode1 head11 = new ListNode1(11);
		ListNode1 head12 = new ListNode1(12);
		ListNode1 head13 = new ListNode1(13);

		ListNode1 head21 = new ListNode1(21);
		ListNode1 head22 = new ListNode1(22);
		ListNode1 head23 = new ListNode1(23);

		ListNode1 comm11 = new ListNode1(111);
		ListNode1 comm12 = new ListNode1(112);
		ListNode1 comm13 = new ListNode1(113);

		head1.next = head11;
		head11.next = head12;
		head12.next = head13;

		head2.next = head21;
		head21.next = head22;
		head22.next = head23;

		comm11.next = comm12;
		comm12.next = comm13;

		head13.next = comm11;
		head23.next = comm11;

		ListNode1 result = getIntersectionNode(head1, head2);
		if (result != null) {
			System.out.println(result.val);
		}
	}

	public static ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {

		if (headA == null || headB == null) {
			return null;
		}

		ListNode1 itr1 = headA;
		ListNode1 itr2 = headB;

		while (itr1.next != null) {
			while (itr2.next != null) {
				if (itr1.next == itr2.next) {
					return itr1.next;
				}
				itr2 = itr2.next;
			}
			itr1 = itr1.next;
			itr2 = headB;
		}
		return null;
	}
}
