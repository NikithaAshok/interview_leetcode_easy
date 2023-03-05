package leetcode;

public class BestTimeToBuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0;i<prices.length;i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i]-minPrice);
		}
		return maxProfit;
    }
	
	public static int indexOfSmallest(int[] array){

	    // add this
	    if (array.length == 0)
	        return -1;

	    int index = 0;
	    int min = array[index];

	    for (int i = 1; i < array.length; i++){
	        if (array[i] <= min){
	       min = array[i];
	        index = i;
	        }
	    }
	    return index;
	}

	public static void main(String[] args) {
		int[] input = {7,1,5,3,6,4};
		maxProfit(input);
	}

}
