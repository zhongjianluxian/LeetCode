/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * P   A   H   N
   A P L S I I G
   Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 */
package LeetCode;

public class ZigzagConversion {
    public String convert(String s, int nRows) {
        if(nRows == 0)
            return null;
        if(nRows == 1 || s.length() < nRows)
            return s;
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int i=0;i<nRows;i++)
        {    
            flag = true;
            int j = i;
            while(j<s.length())
            {
                sb.append(s.charAt(j));
                if(i==0||i==(nRows-1))
                    j = j+ 2*(nRows-1);
                else
                {
                   if(flag == true)
                   {
                       j = j+ 2*(nRows-i-1);
                       flag = false;
                   }
                   else
                   {
                       j = j+ 2*(i);
                       flag = true;
                   }
                }
                
            }
        }
        return sb.toString();
    }

    
}
