package com.amazon.interview;

import java.util.HashMap;

public class twoSumAlt {

	public static void main(String[] args) {
		int[] input = new int[]{0,4,3,0,6,7,8,9};
		int target =13;
		int[] result = twoSum(input, target);
		System.out.println(result[0]+"::"+result[1]);


	}

	public static int[] twoSum(int[] sums, int target) {
		if(sums==null){
			return sums;
		}
		HashMap<Integer, Integer> vals = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < sums.length; i++) {
			if (vals.containsKey(sums[i])) {
				result[0] = i;
				result[1] = vals.get(sums[i]);
			} else {
				vals.put(target - sums[i], i);
			}
		}
		return result;
	}

}
