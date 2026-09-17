class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for( int i = 0; i<prices.length;i++){
            for(int j = i +1;j <prices.length;j++){
                int nums = prices[j]-prices[i];
                if (nums>max){
                    max =nums;
                }
            }
        }
        return max;
    }
}
