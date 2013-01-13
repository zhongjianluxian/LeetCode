/*
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 */
package LeetCode;

public class UniqueBST {
    public int numTrees(int n) {
        int[] numbers = new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            if(i==0)
                numbers[i] = 1;
            else
                numbers[i] = this.calcNumbers(i, numbers);
        }
        return numbers[n];
    }
    private int calcNumbers(int i, int[] numbers)
    {
        int sum=0;
        for(int j=0;j<i;j++)
            sum += numbers[j]*numbers[i-j-1];

        return sum;
    }
}
