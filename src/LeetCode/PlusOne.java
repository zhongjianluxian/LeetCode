/*
 * Given a number represented as an array of digits, plus one to the number.
 */
package LeetCode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i] == 9)
            {
                digits[i] = 0;
                carry = 1;
                continue;
            }
            else
            {
                digits[i] += 1;
                carry = 0;
                break;
            }
        }
        if(carry == 1)
            return this.pad_carry(digits);
        return digits;
    }
    private int[] pad_carry(int[] digits)
    {
        int[] new_digits = new int[digits.length+1];
        new_digits[0] = 1;
        for(int i=0;i<digits.length;i++)
            new_digits[i+1] = digits[i];
        return new_digits;
    }
}
