/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

public class AddBinary {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int local_sum =0;
        int integrate = 0;
        
        int len_a = a.length();
        int len_b = b.length();
        
        //Pad the string to the same length
        if(len_a>len_b)
            b = this.padding(b, len_a - len_b);
        else
            a = this.padding(a, len_b-len_a);
        StringBuilder result = new StringBuilder();
        
        int i = a.length();
        while(i>0)
        {
            if(a.charAt(i-1) == b.charAt(i-1) && a.charAt(i-1)==48)
            {    
                if(integrate == 0)
                    result.append('0'); 
                else
                    result.append('1');
                integrate = 0;
            }
            else if(a.charAt(i-1) == b.charAt(i-1) && a.charAt(i-1)==49)
            {   
                if(integrate ==1)
                    result.append('1');
                else
                    result.append('0');
                integrate= 1;
            }
            else if(a.charAt(i-1) != b.charAt(i-1) )
            {
                if(integrate == 1)
                {
                    result.append('0');
                    integrate = 1;
                }
                else
                    result.append('1');
            }
            i--;
        }
        if(integrate == 1)
            result.append('1');
        result.reverse();
        return result.toString();
    }
    private String padding(String a, int num)
    {
        if(num == 0)
            return a;
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<num;i++)
            temp.append('0');
        return temp.toString() + a;
    }
  
}