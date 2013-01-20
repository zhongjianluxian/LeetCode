/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
package LeetCode;

public class RemoveElement {
    
    public int removeElement(int[] A, int elem) {
        int i=0, j = A.length - 1;
        while(i <= j)
        {
            if(A[i] == elem && A[j] != elem)
            {
                A[i] ^= A[j];
                A[j] ^= A[i];
                A[i] ^= A[j];
                i++;
                j--;
                continue;
            }
            else if(A[j] == elem)
            {
                j--;
                continue;
            }
            i++;
        }
        return j + 1;
    }
}
