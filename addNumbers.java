package com.amazon.interview1;

public class addNumbers {

	public static void main(String[] args) {
		System.out.println(addDigits(12345));
	}

	public static int addDigits(int num) {
		if (num < 10) {
			return num;
		}

		String val = String.valueOf(num);
		int sum = 0;
		for (int i = 0; i < val.length(); i++) {
			sum = sum + Integer.parseInt(String.valueOf(val.charAt(i)));
		}
		sum=addDigits(sum);
		return sum;
	}
}
