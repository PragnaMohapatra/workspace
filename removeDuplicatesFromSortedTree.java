package com.amazon.interview.lastHuddle;

import java.util.Arrays;

public class removeDuplicatesFromSortedTree {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 1, 1, 1,1,1,1,1,1};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));

	}

	public static int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int count = nums.length;
		int current =0;
		int currentValue=nums[0];
		for(int i=1;i<nums.length;i++){
			if(currentValue!=nums[i]){
				currentValue=nums[i];
				current++;
				nums[current]=currentValue;
			}else{
				count--;
			}
			
		}
		return count;
	}
}