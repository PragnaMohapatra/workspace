package com.amazon.interview.lastHuddle;

public class removeElement {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 3, 3,3,3 };
		System.out.println(removeElement(nums, 3));
	}

	public static int removeElement(int[] nums, int val) {
		if (nums == null) {
			return 0;
		}
		if (nums.length == 1 && nums[0] == val) {
			return 0;
		} else if (nums.length == 1 && nums[0] != val) {
			return 1;
		}
		int length = 0;
		int current = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				continue;
			} else {
				length++;
				swap(nums, current, i);
				current++;
			}
		}
		return length;
	}
	private static void swap(int[] nums, int current, int i) {
		int temp = nums[current];
		nums[current] = nums[i];
		nums[i] = temp;

	}
}