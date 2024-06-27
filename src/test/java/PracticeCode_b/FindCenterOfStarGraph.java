package PracticeCode_b;
/*
 * Time complexity : O(1)
 * Space Complexity : O(1)
 */
public class FindCenterOfStarGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] edge = {{1,2},{2,3},{4,2}};
		System.out.println(findCenter(edge));

		int [][] edge1 = {{1,2},{5,1},{1,3},{1,4}};
		System.out.println(findCenter(edge1));
	}
	public static  int findCenter(int[][] edges) {

		if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
			return edges[0][0];

		} else {
			return edges[0][1];
		}  

	}

}
