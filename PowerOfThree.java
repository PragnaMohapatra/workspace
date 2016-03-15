package com.amazon.interview1;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(19682));
	}

	public static boolean isPowerOfThree(int n) {

		if (n == 3 || n == 1) {
			return true;
		}
		if(n%3!=0){
			return false;
		}
		double val = Math.log(n) / Math.log(3);
		double rounded = (double) Math.round(val * 10000) / 10000;
		if (Math.ceil(val) - rounded == 0) {
			return true;
		}
		return false;
	}
}
