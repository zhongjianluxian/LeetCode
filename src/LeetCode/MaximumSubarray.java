/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 */
package LeetCode;

public class MaximumSubarray {
    public int maxSubArray(int[] A) {
        int local_sum = 0;
        int total_sum = Integer.MIN_VALUE;
        int max_non_pos = total_sum;
        for(int i=0;i<A.length;i++)
        {
            if(A[i] > max_non_pos && A[i]<=0)
                max_non_pos = A[i];
            local_sum += A[i];
            if(local_sum < 0)
                local_sum = 0;
            if(local_sum > total_sum)
                total_sum = local_sum;
        }  
        if(total_sum == 0)
            return max_non_pos;
        return total_sum;
    }
}
