/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 */
package LeetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s==null)
            return 0;
        int count = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                count ++;
                continue;
            }
            if(count == 0)
                continue;
            break;
        }
        return count;
    }
}
