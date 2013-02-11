/*
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
package LeetCode;
import java.util.ArrayList;

public class PascalsTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            if(i==0)
            { 
                temp.add(1);
                list.add(temp);
                continue;
            }
            temp.add(1);
            for(int j=1;j<i;j++)
                temp.add(list.get(i-1).get(j-1)+ list.get(i-1).get(j));
            temp.add(1);
            list.add(temp);
        }
        return list;
    }
}
