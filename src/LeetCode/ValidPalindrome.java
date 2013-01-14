/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */
package LeetCode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) 
    {
        if(s ==null || s.length()<=1 )
            return true;
        int head=0, tail=s.length()-1;
        while(head <= tail)
        {
            if(Character.isLetterOrDigit(s.charAt(head))==false)
            {
                head++;
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(tail)) == false)
            {
                tail--;
                continue;
            }
            if(Character.toUpperCase(s.charAt(head++)) != Character.toUpperCase(s.charAt(tail--)))
                return false;
        }
        return true;
    }
}
