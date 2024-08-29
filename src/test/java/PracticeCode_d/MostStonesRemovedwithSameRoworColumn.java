package PracticeCode_d;

public class MostStonesRemovedwithSameRoworColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] stonepos1 = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
		System.out.println(removeStones(stonepos1));
		
		int[][] stonepos2 = {{0,0},{0,2},{1,1},{2,0},{2,2}};
		System.out.println(removeStones(stonepos2));
		
		int[][] stonepos3 = {{0,0}};
		System.out.println(removeStones(stonepos3));
	}
	
	private static int connectedComponentCount = 0;

	public static int removeStones(int[][] stonePositions) {
		int[] setRepresentatives = new int[20003];
		for (int[] stonePosition : stonePositions) {
			mergeComponents(stonePosition[0] + 1, stonePosition[1] + 10002, setRepresentatives);
		}
		return stonePositions.length - connectedComponentCount;
	}

	private static int findRepresentative(int element, int[] setRepresentatives) {
		if (setRepresentatives[element] == 0) {
			setRepresentatives[element] = element;
			connectedComponentCount++;
		}
		return setRepresentatives[element] == element ? element : 
			(setRepresentatives[element] = findRepresentative(setRepresentatives[element], setRepresentatives));
	}

	private static void mergeComponents(int elementA, int elementB, int[] setRepresentatives) {
		int repA = findRepresentative(elementA, setRepresentatives);
		int repB = findRepresentative(elementB, setRepresentatives);
		if (repA != repB) {
			setRepresentatives[repB] = repA;
			connectedComponentCount--;
		}
	}




}
