/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 */
package LeetCode;

public class RemoveDuplicatesFromSortedArray
{
    public int removeDuplicates(int[] A) 
    {
        if(A == null)
            return 0;
        if(A.length <= 1)
            return A.length;
        int new_length = A.length;
        for(int i=1;i<new_length;i++)
        {
            if(A[i] == A[i-1])
            {
                this.switch_array(A, i, new_length);
                new_length--;
                i--;
            }    
        }
        return new_length;
    }

    private void switch_array(int[] A, int i, int new_length) {
        for(int j=i+1;j<new_length;j++)
            A[j-1] = A[j];
    }   
}
