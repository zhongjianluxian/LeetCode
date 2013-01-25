/*
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
package LeetCode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n < 0)
            return 0;
        if(n < 3)
            return n;
            
        int step_a = 1;
        int step_b = 2;
        int result = 0;
        for(int i=3;i<=n;i++)
        {
            result = step_a + step_b;
            step_a = step_b;
            step_b = result;
        }
        return result;
    }
}
