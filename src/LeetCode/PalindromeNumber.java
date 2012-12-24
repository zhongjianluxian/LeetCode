/*Palindrome number:
 *Determine whether an integer is a palindrome. Do this without extra space.
*/
 
package LeetCode;

public class PalindromeNumber {
    boolean isPalindrome(int x) 
    {
        if (x < 0) 
            return false;
        int div = 1;
        while (x / div >= 10)
            div *= 10;
        
        while(div>1)
        {
            int l = x/div;
            int r = x%10;
            if(l!=r)
                return false;
            //eliminate the first and last digits
            //subtle while the second digit is '0'
            x = (x%div)/10;
            div /= 100;
        }

        return true;
    }
}

