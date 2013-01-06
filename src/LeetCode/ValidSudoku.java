/*
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles – The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character ‘.’.
 */
package LeetCode;

import java.util.HashSet;

public class ValidSudoku {
    static int n = 9;
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs;
        //row
        for(int i=0;i<n;i++)
        {
            hs = new HashSet<Character>();
            for(int j=0;j<n;j++)
            {
                if(board[i][j]!='.' && hs.contains(board[i][j]))
                    return false;
                hs.add(board[i][j]);
            }
        }
        //column
        for(int j=0;j<n;j++)
        {
            hs = new HashSet<Character>();
            for(int i=0;i<n;i++)
            {
                if(board[i][j]!='.' && hs.contains(board[i][j]))
                    return false;
                hs.add(board[i][j]);
            }
        }
        //3X3
        int col_offset ;
        int row_offset ;
        for(int k=0;k<n;k++)
        {
            col_offset = 3*(k/3);
            row_offset = (3*k)%9;
            
            hs = new HashSet<Character>();
            for(int i=row_offset;i<row_offset+3;i++)
            { 
                for(int j=col_offset;j<col_offset+3;j++)
                {
                    if(board[i][j]!='.' && hs.contains(board[i][j]))
                        return false;
                    hs.add(board[i][j]);
                }   
            }

        }
        return true;
    }
}
