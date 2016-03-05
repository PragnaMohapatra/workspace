package com.amazon.interview;

public class RotateArray {
	public static void main(String... args){
		int[] input = new int[] {1,2,3,4,5,6,7,8,9};
		int[] result = rotateArray(input,3);
	}
	
	public static int[] rotateArray(int[] input, int window){
		
		for(int i =0;i<window;i++){
			input=swap(input);
		}
		
		return input;
	}
	
	public static int[] swap(int[] input){
		int temp = input[input.length-1];
		for(int i=input.length-1;i>0;i--){
			input[i]=input[i-1];
		}
		input[0]=temp;
		return input;
		
	}
	

}
