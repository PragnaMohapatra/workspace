package com.amazon.interview1;

import java.util.HashSet;
import java.util.Set;

public class UglyNumber {

	public static void main(String[] args) {

		int i = 10000;
		while (i > 0) {
			System.out.println(isUgly(i) + "::" + i);
			i--;
		}

		//System.out.println(isUgly(-2147483647));
	}

	public static boolean isUgly(int num) {
		if (num <= 0 ) {
			return false;
		}
		if(num==1){
			return true;
		}
		Set<Integer> maps = new HashSet<Integer>();
		maps.add(2);
		maps.add(3);
		maps.add(5);
		for (int i = 2; i * i <= Math.abs(num); i++) {
			if (num % i == 0) {
				if (isPrime(i)) {
					if (maps.add(i)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
