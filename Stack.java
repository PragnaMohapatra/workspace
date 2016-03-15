
public class Stack {
	int size=0;
	int capacity;
	int[] storage;

	public Stack(int capacity) {
		this.capacity = capacity;
		storage = new int[capacity];
	}

	public boolean put(int num) {
		System.out.println("Size :: "+(size));
		System.out.println("Capacity :: "+ capacity);
		if(size==capacity){
			System.out.println("The Stack is full");
			return false;
		}
		storage[size]=num;
		size++;
		return true;
	}
	
	public int pop(){
		int value=0;
		if(size==0){
			System.out.println("The statck is empty");
			return -1;
		}
		size--;
		value = storage[size];
		return value;
	}
	
	public int peek(){
		if(size==0){
			System.out.println("The statck is empty");
		}
		return storage[size];
	}
	
	public static void main(String... args){
		Stack stack = new Stack(10);
		stack.put(0);
		stack.put(1);
		stack.put(2);
		stack.put(3);
		stack.put(4);
		stack.put(5);
		stack.put(6);
		stack.put(7);
		stack.put(8);
		stack.put(9);
		stack.put(10);
		
		System.out.println(stack);
		
		for(int i=0;i<11;i++){
			
			System.out.println(stack.pop());
		}
		
	}
}
