package PracticeCode_d;
import java.util.Arrays;

public class SpiralMatrix_III {

	public static void main(String[] args) {
		int rows = 5;
		int cols = 6;
		int rStart = 1;
		int cStart = 4;
		int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);
		for (int[] row : result) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
		int[][] result = new int[rows * cols][2]; // Array to store the coordinates
		int[] directions = {0, 1, 0, -1, 0}; // Directions for right, down, left, up
		int r = rStart, c = cStart, d = 0, steps = 1, index = 0;

		result[index++] = new int[]{r, c}; // Start position

		while (index < rows * cols) {
			for (int i = 0; i < 2; i++) { // Each direction is repeated twice
				for (int j = 0; j < steps; j++) { // Move 'steps' times in the current direction
					r += directions[d];
					c += directions[d + 1];
					if (r >= 0 && r < rows && c >= 0 && c < cols) {
						result[index++] = new int[]{r, c}; // Store the coordinate
					}
				}
				d = (d + 1) % 4; // Change direction
			}
			steps++; // Increase the number of steps after two directions
		}

		return result;
	}
}


