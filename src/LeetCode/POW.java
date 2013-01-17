/*
 * Implement pow(x, n).
 */
package LeetCode;

public class POW {
    public double pow(double x, int n) {
        if(n == 0) return 1;
        boolean rev = false;
        if(n < 0)
        {
            rev = true;
            n = -n;
        }
        if(n == 1)
            if(rev == false)
                return x;
            else
                return 1/(double)x;
            
        double result = pow(x, n>>1);
        result *= result;
        
        if(n%2 == 1)
            result *= x;
        if(rev == true)
            return 1/result;
        return result;
    }
}
