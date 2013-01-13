/*
 *Given an array of integers, find two numbers such that they add up to a specific target number.
 *The function twoSum should return indices of the two numbers such that they add up to the target, 
 *where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 */
package LeetCode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] results = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++)
            hm.put(target-numbers[i], i+1);
        for(int i=0;i<numbers.length;i++)
            if(hm.get(numbers[i])!=null)
            {
                results[1] = hm.get(numbers[i]); 
                results[0] = i+1;
                return results;
            } 
        return null;
    }
}
