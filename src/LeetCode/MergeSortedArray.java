/*
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 */
package LeetCode;

public class MergeSortedArray {
  
    public void merge(int A[], int m, int B[], int n) {
        if(n==0)
            return;
        if(m==0)
        {
            for(int i=0;i<B.length;i++)
                A[i] = B[i];
            return;
        }
        
        int total = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0)
        {
            if(A[i] >= B[j])
            {
                A[total] = A[i];
                i--;
            }
            else
            {
                A[total] = B[j];
                j--;
            }
            total--;
        }
        if(i < 0)
            for(int k=total;k>=0;k--)
                A[k] = B[j--];
    }
}

