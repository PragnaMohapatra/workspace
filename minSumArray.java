package com.amazon.interview.lastHuddle;

import java.util.Arrays;

public class minSumArray {

	public static void main(String[] args) {
		int[][] input = new int[3][5];
		input[0] = new int[] { 1, 2, 3, 4, 5 };
		input[1] = new int[] { 6, 7, 8, 9, 10 };
		input[2] = new int[] { 11, 12, 13, 14, 15 };

		System.out.println(input.length);
		System.out.println(input[0].length);
		System.out.println(minPathSum(input));
	}

	public static int minPathSum(int[][] grid) {
		if(grid==null){
			return 0;
		}
		
		int numOfRows = grid.length;
		int numOfColums = grid[0].length;
		
		for(int i=0;i<numOfRows-1;i++){
			Arrays.toString(grid);
			grid[i+1][0]=grid[i][0]+grid[i+1][0];
			
		}
		
		for(int i=0;i<numOfColums-1;i++){
			Arrays.toString(grid);
			grid[0][i+1]=grid[0][i]+grid[0][i+1];
			
		}
		
		for(int i=1; i<numOfRows;i++){
			for(int j=1;j<numOfColums;j++){
				grid[i][j]=Math.min((grid[i-1][j]),(grid[i][j-1]))+grid[i][j];
			}
			
		}
		return grid[numOfRows-1][numOfColums-1];
	}
}
