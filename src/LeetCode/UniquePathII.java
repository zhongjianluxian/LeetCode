/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

public class UniquePathII {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(m*n==0 || obstacleGrid[m-1][n-1] == 1)
            return 0;
        if(m==1)
        {
            for(int k=0;k<n;k++)
            {
                if(obstacleGrid[0][k]==1)
                    return 0;
            }
            return 1;
        }
        if(n==1)
        {
            for(int k=0;k<m;k++)
            {
                if(obstacleGrid[k][0]==1)
                    return 0;
            }
            return 1;
        }
        //initialization
        int[] temp_column = new int[m];
        int[] temp_row = new int[n];
        for(int i=m-1;i>=0;i--)
        {
            if(obstacleGrid[i][n-1]==1)
            {
                for(int j=i;j>=0;j--)
                    temp_column[j] = 0;
                break;
            }
            else
                temp_column[i] = 1;
        }
        for(int i=n-1;i>=0;i--)
        {
            if(obstacleGrid[m-1][i]==1)
            {
                for(int j=i;j>=0;j--)
                    temp_row[j] = 0;
                break;
            }
            else
                temp_row[i] = 1;
        }
        temp_column[m-1] = obstacleGrid[m-1][n-2] ^1;
        //scan all the grids
        for(int i=n-2;i>=0;i--)
        {
            for(int j=m-2;j>=0;j--)
            {
                if(obstacleGrid[j][i] == 0)
                    temp_column[j] = temp_column[j] + temp_column[j+1];
                else
                    temp_column[j] = 0;
            }
            if(i!=0)
                temp_column[m-1] = temp_row[i-1];
        }
        return temp_column[0];   
            
    }
}
