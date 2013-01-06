/*Validate if a given string is numeric.
 */
package LeetCode;

public class ValidNumber {
    public boolean isNumber(String s) {
        //A not well-defined problem is not a good problem
        //Test case driven solution is vulnerable
        //A systematic approach is needed
        
        //Placeholder
        //Reference: https://github.com/jinglundong/Leetcode/blob/master/leetcode/src/_valid_number/Solution.java
        return s.matches("\\s*[-|+]?(\\d+\\.?|\\.?\\d+|\\d+\\.\\d+)(e[-|+]?\\d+)?\\s*");
    }
}
