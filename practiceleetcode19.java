/*
Your are given an array of integers prices, for which the i-th element is the price of a given stock on day i; and a non-negative integer fee representing a transaction fee.

You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction. You may not buy more than 1 share of a stock at a time (ie. you must sell the stock share before you buy again.)

Return the maximum profit you can make.
*/
/*
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int size = prices.length;
        
        int[] temp = new int[size];
        int ans=0;
        
        for(int i=1; i<size; i++){
            for(int j=i-1;j>=0;j--){
                int diff = (prices[i]-prices[j])-2;
                if(diff>0){
                    if(j>0){
                        temp[i]=max(temp[i], temp[j-1]+diff);
                    }else{
                        temp[i]=max(temp[i], diff);
                    }
                }else{
                    temp[i]=max(temp[i],ans);
                }
                ans=max(ans, temp[i]);
            }
        }
        return ans;
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}
*/
class Solution 
{
    public int maxProfit(int[] g, int fee) 
    {        
        if (g.length < 2) return 0;
        
        // meaning - buy[i]:
        // what is the max profit that for subarray [0, i] where
        // the operations end with a buy
        int[] buy = new int[g.length];
        buy[0] = 0 - g[0];
        
        // meaning - sell[i]:
        // what is the max profit that for subarray [0, i] where
        // the operations end with a sell
        int[] sell = new int[g.length];
        
        for (int i = 1; i < g.length; ++i)
        {
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + g[i] - fee);
            buy[i] = Math.max(buy[i - 1], 0 - g[i] + sell[i - 1]);        
        }
        
        return sell[g.length - 1];
    }    
}

/*
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int temp = prices.length;
        int[] maxHold = new int[temp+1];
        int[] maxCash = new int[temp+1];
        
        maxHold[0] = Integer.MIN_VALUE;
        maxCash[0] = 0;
        maxCash[1] = 0;
        for(int i=1; i<temp+1; i++){
            maxHold[i] = Math.max(maxCash[i-1] - prices[i-1], maxHold[i-1]);
            if(i>1){
                maxCash[i] = Math.max(maxHold[i-1] + prices[i-1] - fee, maxCash[i-1]);
            }
        }
        
        return maxCash[temp];
    }
}
*/
