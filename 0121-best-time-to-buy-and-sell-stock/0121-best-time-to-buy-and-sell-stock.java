class Solution {
    public int maxProfit(int[] prices) {


        // int max = 0;
       
        // for(int i = 0 ; i < prices.length ; i++){
        //     for(int j = i+1 ; j < prices.length; j++){

        //         int profit = prices[j] - prices[i];
        //         if(max < profit){
        //             max = profit;
        //         }
        //     }
        // }

        // if(max > 0){
        //     return max;
        // }else{
        //     return 0;
        // }

        int min = prices[0];
        int max_profit = -99999;
        for(int i = 0 ; i < prices.length ; i++){
            int profit = prices[i] - min ; 
            if(max_profit < profit){
                max_profit = profit;
            }

            if(prices[i] < min){
                min = prices[i];
            }
        }
        return max_profit;
    }
}