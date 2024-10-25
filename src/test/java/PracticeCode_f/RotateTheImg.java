package PracticeCode_f;

public class RotateTheImg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix1);
		printMatrix(matrix1);
	}
	public static void rotate(int[][] matrix) {
		int edgeLength = matrix.length;

		int top = 0;
		int bottom = edgeLength - 1;

		while (top < bottom) {
			for (int col = 0; col < edgeLength; col++) {
				int temp = matrix[top][col];
				matrix[top][col] = matrix[bottom][col];
				matrix[bottom][col] = temp;
			}
			top++;
			bottom--;
		}

		for (int row = 0; row < edgeLength; row++) {
			for (int col = row + 1; col < edgeLength; col++) {
				int temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}
		}        
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int elem : row) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
	}


}
