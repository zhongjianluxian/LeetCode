/*
 * Given a string containing just the characters '(', ')','{', '}', '[' and ']', 
 * determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but"(]" and "([)]" are not.
 */
package LeetCode;

import java.util.ArrayList;

public class ValidParentheses {
    public boolean isValid(String s)
    {
        if(s==null)
            return false;
        if(s.length()%2==1)
            return false;
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            char temp = s.charAt(i);
            if(temp== '('||temp=='{'||temp=='[')
                al.add(temp);
            else
            {
                if(al.isEmpty())
                    return false;
                switch(temp)
                {
                    case ')':
                        if(al.get(al.size()-1)!='(')
                            return false;
                        break;
                    case ']':
                        if(al.get(al.size()-1)!='[')
                            return false;
                        break;
                    case '}':
                        if(al.get(al.size()-1)!='{')
                            return false;
                        break;
                }
               al.remove(al.size()-1); 
            }       
        }
        if(al.isEmpty())
            return true;
        return false;
    }
}
