package com.amazon.interview1;

public class excelColumn {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AZ"));
	}

	public static int titleToNumber(String s) {
		if (s == null) {
			return 0;
		}
		double sum =0;
		for (int i = 0; i < s.length(); i++) {
        int a = (int)s.charAt(i)-64;
        double power = s.length()-i;
        sum = sum+ a* Math.pow(26.0, power);
        
		}
		return (int)sum-25;
	}
}
