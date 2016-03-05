package com.amazon.interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RotateArrayAlt {

	public static void main(String[] args) {
		int[] input = new int[] {-1};
		rotate(input,2);
	}
	public static void rotate(int[] nums, int k) {
		if(nums==null){
			return;
		}
		if(nums.length<k){
			return;
		}
		Stack<Integer> rear = new Stack<>();
		int count=0;
		while(k>count){
			rear.push(nums[nums.length-1-count]);
			count++;
		}
		Queue<Integer> front = new LinkedList<>();
		for(int i=0;i<nums.length-k;i++){
			front.add(nums[i]);
		}
		for(int i=0;i<nums.length;i++){
			if(!rear.isEmpty()){
				nums[i]=rear.pop();
			}else{
				nums[i]=front.poll();
			}
		}
	}
}
