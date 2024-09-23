package PracticeCode_e;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {

		int [] prices1 = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices1));

		int [] prices2 = {7,6,4,3,1};
		System.out.println(maxProfit(prices2));
	}
	public static int maxProfit(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i = 0; i<prices.length;i++){
			if(prices[i] < minPrice){
				minPrice =prices[i];
			}else if(prices[i] - minPrice > maxProfit){
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}
}

