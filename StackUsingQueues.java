
public class StackUsingQueues {
	Stack stack1= new Stack(10);
	Stack stack2= new Stack(10);
	
	public void enqeue(int element){
		if(stack1.put(element)){
			System.out.println("Element queued successfully");
		}else{
			System.out.println("queue is full now");
		}
	}
	
	public int deQueue(){
	int value=-1;
	if(stack1.size==0 && stack2.size==0){
		System.out.println("Nothing to be deQueued");
		return -1;
	} 
	
	if(stack2.size==0 && stack1.size>0 ){
		while(stack1.size!=0){
			stack2.put(stack1.pop());
		}
	}
	value =stack2.pop();
	return value;
	}
	
	public static void main(String... args){
		
		StackUsingQueues queues = new StackUsingQueues();
		queues.deQueue();
		queues.enqeue(1);
		queues.enqeue(2);
		queues.enqeue(3);
		System.out.println(queues.deQueue());
		queues.enqeue(4);
		queues.enqeue(5);
		queues.enqeue(6);
		System.out.println(queues.deQueue());
		queues.enqeue(7);
		queues.enqeue(8);
		
		System.out.println(queues.deQueue());
		System.out.println(queues.deQueue());
		System.out.println(queues.deQueue());
		System.out.println(queues.deQueue());
		
		
		
	}
}
