/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. 
 * 
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
package LeetCode;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int diff = 0;
        for(int i=0;i<prices.length-1;i++)
        {
            int local_diff = prices[i+1] - prices[i];
            if(local_diff > 0)
                diff += local_diff;
        }
        return diff;
    }
}
