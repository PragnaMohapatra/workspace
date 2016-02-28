
public class ReversingLinkedList {
	int val;
	ReversingLinkedList next;

	public ReversingLinkedList(int x) {
		val = x;
	}

	public static void main(String[] args) {
		ReversingLinkedList head = new ReversingLinkedList(0);
		ReversingLinkedList firstChild = new ReversingLinkedList(10);
		ReversingLinkedList secondChild = new ReversingLinkedList(20);
		ReversingLinkedList thirdChild = new ReversingLinkedList(30);
		ReversingLinkedList fourthChild = new ReversingLinkedList(40);

		head.next = firstChild;
		firstChild.next = secondChild;
		secondChild.next = thirdChild;
		thirdChild.next = fourthChild;

		reverseList(head);

	}

	public static ReversingLinkedList reverseList(ReversingLinkedList head) {
		java.util.Stack<ReversingLinkedList> stack = new java.util.Stack<ReversingLinkedList>();
		ReversingLinkedList focus = head;

		while (focus.next != null) {
			stack.push(focus.next);
			focus = focus.next;
		}
		ReversingLinkedList temp = new ReversingLinkedList(0);
		temp = stack.peek();
		head.next = temp;
		stack.pop();
		ReversingLinkedList holder = new ReversingLinkedList(0);
		while (stack.isEmpty()) {
			holder = stack.peek();
			temp.next = holder;
			stack.pop();
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}

}
