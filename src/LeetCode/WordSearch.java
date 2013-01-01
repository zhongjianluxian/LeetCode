/*
 *Given a 2D board and a word, find if the word exists in the grid.
 *The word can be constructed from letters of sequentially adjacent cell, 
 *where "adjacent" cells are those horizontally or vertically neighboring. 
 *The same letter cell may not be used more than once.
 */
package LeetCode;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if(word == null)
            return false;
        if(board.length==0 || board[0].length==0)
            return false;
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(dfs(i,j,board,word,0))
                    return true;
        return false;
    }
    private boolean dfs(int i, int j, char[][] board, String word, int position)
    {
        //System.out.println(i+" "+j+" "+position);
        if(board[i][j]!=word.charAt(position))
            return false;
        if(position+1 ==word.length())	
            return true;
                
        int n = board.length;
        int m = board[0].length;
        //placeholder, assume '#' never appear in the array
        char temp = board[i][j];
        board[i][j] = '#';
        position += 1;
        
        if (i > 0  && dfs(i-1, j, board, word, position))
            return true;
        if (i < n-1 && dfs(i+1, j, board, word, position))
            return true;
        if (j > 0  && dfs(i, j-1, board, word, position))
            return true;
        if (j < m-1 && dfs(i, j+1, board, word, position))
            return true;
        board[i][j] = temp;    
        
       
        return false;
    }
}
