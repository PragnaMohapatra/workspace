package com.amazon.interview.lastHuddle;

public class PictureRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void rotate(int[][] matrix) {
		if (matrix == null) {
			return;
		}

		int m = matrix.length;
		int n = matrix[0].length;

		int[][] temp = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				temp[j][n - 1 - i] = matrix[i][j];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = temp[i][j];
			}
		}
	}

}
