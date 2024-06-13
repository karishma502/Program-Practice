package PracticeCode;

public class CanPlaceFlower {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Flowerbed1 = {1,0,0,0,1};
		int n1 = 1;
		System.out.println(canPlaceFlowers(Flowerbed1, n1));
		
		int[] Flowerbed2 = {1,0,0,0,1};
		int n2 = 2;
		System.out.println(canPlaceFlowers(Flowerbed2, n2));

	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		int i = 0;
		while (i < flowerbed.length) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1;
				count++;
			}
			i++;
		}
		return count >= n;  
	}

}
