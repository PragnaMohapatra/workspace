package com.amazon.interview1;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPowerOfThree(45);
	}

	public static boolean isPowerOfThree(int n) {

		if (n == 3 || n == 1) {
			return true;
		}
		boolean result = false;
		if (n != 0 && n % 3 == 0) {
			result = isPowerOfThree(n / 3);
		} else {
			return result;
		}
		return result;
	}
}
