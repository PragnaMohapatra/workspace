import java.util.Stack;

public class LinkedListIntersectionAlt {

	
	public static void main(String[] args) {

		ListNode1 head1 = new ListNode1(0);
		ListNode1 head2 = new ListNode1(0);

		ListNode1 head11 = new ListNode1(11);
		head1.next=head11;
		head2.next=head11;
		/*ListNode1 head12 = new ListNode1(12);
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
		head23.next = comm11;*/

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
		
		java.util.Stack<ListNode1> stack1 = new Stack<>();
		java.util.Stack<ListNode1> stack2= new Stack<>();
		

		while(itr1.next !=null){
			stack1.push(itr1.next);
			itr1 = itr1.next;
		}
		while(itr2.next !=null){
			stack2.push(itr2.next);
			itr2 = itr2.next;
		}
		
		while(!stack1.empty() && !stack2.empty()){
			if(stack1.size()==1){
				ListNode1 temp1 = stack1.peek();
				ListNode1 temp2 = stack2.peek();
				if(temp1 == temp2){
					return headA;
				}
			}
			ListNode1 temp1 = stack1.pop();
			ListNode1 temp2 = stack2.pop();
			
			if(temp1 != temp2){
				return temp1.next;
			}
		}
		return null;
	}
}
