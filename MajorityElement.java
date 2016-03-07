package com.amazon.interview1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = new int[]{1,1,1,1,1,1,4,5,6,7,3,3,3,3,3,6,7,8,};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		if (nums == null) {
			return 0;
		}
		Map<Integer, Integer> maps = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (maps.get(nums[i]) != null) {
				maps.put(nums[i],  maps.get(nums[i]) + 1);
			} else {
				maps.put(nums[i], 1);
			}
		}
		int baseLine = Integer.MIN_VALUE;
		int majorityElementKey=0;
		for (Map.Entry<Integer, Integer> key : maps.entrySet()) {
			if (key.getValue() > baseLine) {
				baseLine = key.getValue();
				majorityElementKey = key.getKey();
			}
		}
		return majorityElementKey;
	}
}
