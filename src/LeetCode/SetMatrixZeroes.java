/*
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. 
 * Do it in place.
 */
package LeetCode;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = 0;
        if(m != 0)
            n = matrix[0].length;
        if(m *n == 0)
            return;
        //flag to indicate whether the first row/column is to be set to zeroes
        boolean row_flag = false, column_flag = false;
        for(int i=0;i<n;i++)
            if(matrix[0][i] == 0)
            {    row_flag = true; 
                 break;
            }
           
        for(int i=0;i<m;i++)
            if(matrix[i][0] == 0)
            {
                column_flag = true;
                break;
            }
            
        //scan the matrix, and use the first row/column to record if to be set to zeroes    
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        //set to zeroes based on the first row/column
        for(int i=1;i<n;i++)
        {
            if(matrix[0][i] == 0)
                for(int j=1;j<m;j++)
                    matrix[j][i] = 0;
        }
        for(int i=1;i<m;i++)
        {
            if(matrix[i][0] == 0)
                for(int j=1;j<n;j++)
                    matrix[i][j] = 0;
        }
        //set first row/column to proper value
        if(row_flag == true)
            for(int i=0;i<n;i++)
                matrix[0][i] = 0;
        if(column_flag == true)
            for(int i=0;i<m;i++)
                matrix[i][0] = 0;
    }
}
