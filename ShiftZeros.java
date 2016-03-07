package com.amazon.interview1;

import java.util.Arrays;

public class ShiftZeros {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void moveZeroes(int[] nums) {
		if (nums == null) {
			return;
		}
		int current = 0;
		while (current < nums.length) {
			if (nums[current] == 0) {
				for (int i = current + 1; i < nums.length; i++) {
					if (nums[i] != 0) {
						nums[current] = nums[i];
						nums[i] = 0;
						break;
					}
				}
			}
			current++;
		}
	}
}
