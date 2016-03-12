package com.amazon.interview.lastHuddle;

public class PalindromeNumber {

	public static void main(String[] args) {
     isPalindrome(2147483647);
	}
	public static boolean isPalindrome(int x) {
		if (x < 0 || x == 0) {
			return true;
		}

		double length = 0;
		int temp = x;
		int sum = 0;
		while (temp / 10 > 0) {
			length++;
			temp = temp / 10;
		}
		int temp2 = x;
		while (length >= 0) {
			sum = (int) (sum + (temp2 % 10) * Math.pow(10, length ));
			temp2 = temp2 / 10;
			length--;
		}
		if (x - sum == 0) {
			return true;
		}
		return false;
	}
}
