/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 */
package LeetCode;

public class BestTimeToBuyAndSellStock {
   public int maxProfit(int[] prices) {
       int min = 0;
       int diff = 0;
       for(int i=0;i<prices.length;i++)
       {
           if(prices[i] < prices[min])
               min = i;
           int local_diff = prices[i] - prices[min];
           if(local_diff > diff)
               diff = local_diff;
       }
       return diff;
    }
}
