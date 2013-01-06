/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *The robot can only move either down or right at any point in time. The robot is 
 *trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *How many possible unique paths are there?
 */
package LeetCode;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
       //return uniquePathsR(0,0,m,n);
       return uniquePathsDP(m,n);
    }
    //Solution 1: calculate the unique paths from (i,j) to (m,n), in a recursive way
    private int uniquePathsR(int i, int j, int m, int n)
    {
        if(m*n == 0)
            return 0;
        if(m == 1 || n== 1)
            return 1;        
        if(i==m-1 || j==n-1)
            return 1;
        return uniquePathsR(i+1,j,m,n) + uniquePathsR(i,j+1,m,n);
    }
    //Solution 2: dynamic programming 
    private int uniquePathsDP(int m, int n)
    {
        if(m*n == 0)
            return 0;
        if(m == 1 || n== 1)
            return 1;
        int[] values = new int[m];
        for(int i=0;i<m;i++)
            values[i] = 1;
        for(int i=n-2;i>=0;i--)
            for(int j=m-2;j>=0;j--)
            {
                values[j] = values[j+1] + values[j];
            }
        
        return values[0];
    }
}
