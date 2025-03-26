package code300BaiThieuNhi;

public class BestTimeBuyAndSellSTock_ThoiGianTotNhatDeMuaCoPhieu {

	public static void main(String[] args) {
		// Test case mẫu
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1: " + maxProfit(prices1)); // Expected: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2: " + maxProfit(prices2)); // Expected: 0

        int[] prices3 = {2, 4, 1, 7, 5, 9, 3};
        System.out.println("Test 3: " + maxProfit(prices3)); // Expected: 8

        int[] prices4 = {1, 2, 3, 4, 5};
        System.out.println("Test 4: " + maxProfit(prices4)); // Expected: 4

        int[] prices5 = {5, 4, 3, 2, 1};
        System.out.println("Test 5: " + maxProfit(prices5)); // Expected: 0
	}
	
	public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min)
                min = prices[i];
            else 
                max = Math.max(max, prices[i] - min);
        }
        return max;
    }

}
