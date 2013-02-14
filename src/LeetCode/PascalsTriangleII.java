/*
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3,
 * Return [1,3,3,1].
 */
package LeetCode;
import java.util.ArrayList;

public class PascalsTriangleII {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        if(rowIndex <= 0)
            return al;
        for(int i=1;i<rowIndex;i++)
            al.add(this.combination(rowIndex, i));
        al.add(1);
        return al;
    }
    private int combination(int n, int k)
    {
        if(n>>1 < k)
            k = n - k;
	    double mul = 1;
	    for(int i=n+1-k;i<n+1;i++)
		    mul *= i;
	    for(int i=k;i>0;i--)
		    mul /= i;
            //fload division might not be accurate
	    return (int)(mul+0.5);
    }
}
