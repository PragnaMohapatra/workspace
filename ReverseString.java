package com.amazon.interview;

public class ReverseString {
	public static void main(String... args) {
		String input = "   ";
		System.out.println(reverseString(input));
	}

	public static String reverseString(String input) {
		if (input == null) {
			return input;
		}
		if (input.equalsIgnoreCase("")) {
			return input;
		}
		input = input.trim();
		String[] strArr = input.split(" ");
		StringBuffer result = new StringBuffer();
		for (int i = strArr.length - 1; i >= 0; i--) {
			if (!"".equalsIgnoreCase(strArr[i])) {
				result.append(strArr[i].trim());
				result.append(' ');
			}
		}
		return result.toString();
	}
}
