/*
 * Write a function to find the longest common prefix string amongst an array of strings
 */
package LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
            
        int length = strs.length;
        String compare = strs[0];
        for(int i=1;i<length;i++)
            compare = this.compare(compare, strs[i]);
       
        return compare;   
    }
    String compare(String s1, String s2)
    {
        String rst = "";
        int count = 0;
        int a = Math.min(s1.length(), s2.length() );
        for(int i=0;i<a;i++)
        {
            if(s1.charAt(i) == s2.charAt(i))
                count++;
            else
                break;
        }
        if(count!=0)
            return s1.substring(0, count);
        return rst;
    }
}
