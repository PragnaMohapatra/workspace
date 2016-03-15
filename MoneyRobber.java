package com.amazon.interview1;

public class MoneyRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rob(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < nums.length; i = i + 2) {
			sumEven = sumEven + nums[i];
		}

		for (int i = 1; i < nums.length; i = i + 2) {
			sumOdd = sumOdd + nums[i];
		}
		return Math.max(sumEven, sumOdd);
	}

}
