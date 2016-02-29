
class MinStack {
	int size = 0;
	int capacity;
	int[] storage;
	java.util.Stack<Integer> stack=new java.util.Stack();

	public MinStack(int capacity) {
		
		this.capacity = capacity;
		storage = new int[capacity];
	}

	public void push(int x) {
		
		if (size == capacity) {
			System.out.println("statck is full");
			return;
		}
		storage[size] = x;
		size++;
		if (stack.isEmpty()) {
			stack.push(x);
		} else {
			if (x <= stack.peek()) {
				stack.push(x);
			}
		}
	}

	public void pop() {
		if (size == 0) {
			System.out.println("nothing to pop");
		}
		if (storage[size - 1] == stack.peek()) {
			stack.pop();
		}
		size--;
	}

	public int top() {
		if (size == 0) {
			System.out.println("Stack is empty nothing to pop");
		}
		return storage[size - 1];
	}

	public int getMin() {
		return stack.peek();
	}
	
	public static void main(String... args){
		MinStack minStack = new MinStack(10);
		minStack.push(2);
		minStack.push(5);
		minStack.push(0);
		minStack.push(100);
		minStack.push(1);
		
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
		
		
	}
}
