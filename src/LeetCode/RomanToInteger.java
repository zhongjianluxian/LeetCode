/*
 * Given a roman numeral, convert it to an integer
 * Input is guaranteed to be within the range from 1 to 3999.
 */
package LeetCode;
import java.util.HashMap;

public class RomanToInteger {
    final HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
    public RomanToInteger()
    {
        this.init(hs);
    }
    
    public int romanToInt(String s) {
        if(s == null || s.equals("") == true)
            return 0;
        
        int current_level = 0, sum = 0;
        int length = s.length();
        for(int i=length-1;i>=0;i--)
        {
            int item = hs.get(s.charAt(i));
            if(current_level <= item)
            {
                current_level = item;
                sum += item;
            }
            else
                sum -= item;
        }
        return sum;
    }
    public void init(HashMap<Character, Integer> hs) {
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
    }
}
