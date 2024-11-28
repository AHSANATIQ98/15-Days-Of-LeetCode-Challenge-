class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) { // Handle edge case for arrays with less than 2 elements
            return 0;
        }

        int least = prices[0];
        int index = 0;
        int diffrence = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < least){
                least = prices[i];

            }

             if (prices[i + 1] - least > diffrence) {
                diffrence = prices[i + 1] - least;
            }
        }

        return diffrence;
    }
}
