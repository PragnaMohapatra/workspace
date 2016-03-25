import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WiggleSort {
	public static void main(String... args) {
		int[] nums = new int[] { 1, 1, 2, 1, 2, 2, 1 };
		wiggleSort(nums);

	}

	public static void wiggleSort(int[] nums) {
		if (nums == null) {
			return;
		}
		boolean flag = true;
		Queue<Integer> front = new LinkedList<Integer>();
		Queue<Integer> rear = new LinkedList<Integer>();
		Arrays.sort(nums);
		int size = nums.length;

		for (int i = 0; i < size; i++) {
			if(size%2==0){
				if (i < size / 2) {
					front.add(nums[i]);
				} else {
					rear.add(nums[i]);
				}
			}else{
				if (i <= size / 2) {
					front.add(nums[i]);
				} else {
					rear.add(nums[i]);
				}
			}
			
		}
		int count = 0;
		while (flag) {
			if(!front.isEmpty())
			nums[count] = front.poll();
			if(!front.isEmpty())
			nums[++count] = rear.poll();
			if (front.isEmpty() && rear.isEmpty()) {
				flag = false;
			}
			count++;
		}
	}
}
