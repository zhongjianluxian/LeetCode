/*
 * Returns a pointer to the first occurrence of needle in haystack, 
 * or null if needle is not part of haystack
 */
package LeetCode;

public class ImplementStrStr {
    public String strStr(String haystack, String needle) {
        if(haystack == null)
            return null;
        if(needle == null)
            return haystack;
        int len_h = haystack.length(), len_n = needle.length();
        if(haystack.equals(needle) == true || len_n == 0)
            return haystack;
        if(len_h == 0)
            return null;
            
        int i = 0,j = 0;
        while(i < len_h - len_n + 1)
        {
            j = 0;
            while(j < len_n)
            {
                if(haystack.charAt(i+j) != needle.charAt(j))
                {
                    i++;
                    break;
                }
                j++;
                if(j == len_n)
                    return haystack.substring(i);
            }
        }
        return null;    
    }
}
