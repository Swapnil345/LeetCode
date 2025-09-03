class Solution {
    public int maxProfit(int[] prices) {
        // int minPrice=Integer.MAX_VALUE;
        // int maxProfit=0;

        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<minPrice){
        //         minPrice=prices[i];
        //     }
        //     else{
        //         int profit=prices[i]-minPrice;
        //         if(profit>maxProfit){
        //             maxProfit=profit;
        //         }
        //     }
        // }
        // return maxProfit;

        // int minPrice=Integer.MAX_VALUE;
        // int maxProfit=0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<minPrice){
        //         minPrice=prices[i];
        //     }
        //     else{
        //         int profit=prices[i]-minPrice;
        //         if(profit>maxProfit){
        //             maxProfit=profit;
        //         }
        //     }
        // }
        // return maxProfit;

        int left=0;
        int right=1;
        int maxProfit=0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                int profit=prices[right]-prices[left];
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                left=right;
            }
            right++;
        }
        return maxProfit;
    }
}