/*
 * Given a triangle, find the minimum path sum from top to bottom. 
 * Each step you may move to adjacent numbers on the row below.
 */
package LeetCode;

import java.util.ArrayList;

public class Triangle {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int level = triangle.size();
        if(level== 0)
            return 0;
        if(level == 1)
            return triangle.get(0).get(0);
        int[] temp_sum = new int[level];
        for(int i=0;i<level;i++)
            temp_sum[i] = 0;
        for(int i=level-1;i>0;i--)
            for(int j=0;j<i;j++)
            {
                temp_sum[j] = Math.min(  triangle.get(i).get(j)+ temp_sum[j], 
                                         triangle.get(i).get(j+1)+ temp_sum[j+1] );
            }
        return triangle.get(0).get(0) + temp_sum[0];
    }
}
