package com.amazon.interview;

public class twoSum {

	public static void main(String[] args) {
		int[] input = new int[]{0,4,3,0};
		int target =0;
		int[] result = twoSum(input, target);
		System.out.println(result[0]+"::"+result[1]);

	}
	public static int[] twoSum(int[] input, int target){
		if(input==null){
			return input;
		}
		int[] result = new int[2];
		for(int i=0;i<input.length;i++){
			int count=0;
			for(int j=i+1; j<input.length;j++){
				count++;
				if(input[i]+input[j]==target){
					System.out.println(input[i]+"::"+input[j]);
					result[0]=i;
					result[1]=j;
				}
			}
		}
		return result;
	}

}
