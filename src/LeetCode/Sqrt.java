/*
 * Implement int sqrt(int x)
 */
package LeetCode;

public class Sqrt {
    public int sqrt(int x) 
    {
       if(x <= 1) 
           return x;
           
    	int low = 0;
    	int high = x;
    	int mid;
    	while(low <= high)
        {
            mid = low + (high - low)/2;
            if(x/mid == mid)
                return mid;
            else if(x/mid > mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
    	return high;
    }
}

