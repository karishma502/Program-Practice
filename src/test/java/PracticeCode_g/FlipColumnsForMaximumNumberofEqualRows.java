package PracticeCode_g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class FlipColumnsForMaximumNumberofEqualRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = {{0,1},{1,1}};
		System.out.println(maxEqualRowsAfterFlips(mat));
	}
	public static int maxEqualRowsAfterFlips(int[][] mat) {
		Map<String, Integer> patFreq = new HashMap<>();

		for (int[] row : mat) {
			StringBuilder pattern = new StringBuilder();
			if (row[0] == 0) {
				for (int bit : row) pattern.append(bit);
			} else {
				for (int bit : row) pattern.append(bit ^ 1);
			}
			patFreq.merge(pattern.toString(), 1, Integer::sum);
		}

		return Collections.max(patFreq.values());
	}


}
