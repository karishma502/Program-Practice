package PracticeCode_c;

import java.util.ArrayList;
import java.util.List;
/*
 * TC - O(m * n)
 * SC - O(m)
 */
public class LuckyNumbersinaMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix1 = {{3, 7, 8},
				{9, 11, 13},
				{15, 16, 17}};
		System.out.println(luckyNumbers(matrix1));

		int[][] matrix2 = {{1,10,4,2},
				{9,3,8,7},
				{15,16,17,12}};
		System.out.println(luckyNumbers(matrix2));

		int[][] matrix3 = {{7, 8},
				{1,2}};
		System.out.println(luckyNumbers(matrix3));


	}
	public static List<Integer> luckyNumbers (int[][] matrix) {

		List<Integer> arr = new ArrayList<>();

		for(int i =0 ;i<matrix.length;i++){
			int minIdx =0;
			int min=999999999;
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]<min){
					min =matrix[i][j];
					minIdx = j;
				}
			}
			boolean isTrue = true;
			for(int j=0; j< matrix.length;j++){
				if(matrix[i][minIdx]<matrix[j][minIdx]){
					isTrue = false;
					break;
				}   
			}
			if(isTrue)
			{
				arr.add(matrix[i][minIdx]);
			}
		}
		return arr;         
	}

}
