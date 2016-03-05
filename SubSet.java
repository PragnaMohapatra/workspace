package com.amazon.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {

		int[] input = new int[] { 1, 2, 3};
		int window = 3;
		List<List<Integer>> result = findSubSet(input);
		System.out.println("hello");

	}

	public static List<List<Integer>> findSubSet(int[] nums) {
		if (nums == null)
			return null;
	 
		Arrays.sort(nums);
	 
		List<List<Integer>> result = new ArrayList<>();
	 
		for (int i = 0; i < nums.length; i++) {
		   List<List<Integer>> temp = new ArrayList<>();
	 
			//get sets that are already in result
			for (List<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			//add S[i] to existing sets
			for (List<Integer> a : temp) {
				a.add(nums[i]);
			}
	 
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(nums[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}
}
