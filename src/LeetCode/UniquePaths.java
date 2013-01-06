/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *The robot can only move either down or right at any point in time. The robot is 
 *trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *How many possible unique paths are there?
 */
package LeetCode;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
       return uniquePaths(0,0,m,n);
    }
    //calculate the unique paths from (i,j) to (m,n)
    private int uniquePaths(int i, int j, int m, int n)
    {
        if(m*n == 0)
            return 0;
        if(m == 1 || n== 1)
            return 1;        
        if(i==m-1 || j==n-1)
            return 1;
        return uniquePaths(i+1,j,m,n) + uniquePaths(i,j+1,m,n);
    }
}
