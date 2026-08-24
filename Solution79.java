/*
ClassName:Solution79
@Author Zhou
@Create 2026/8/24 16:06
*/
public class Solution79 {
    public boolean exist(char[][] board, String word) {

        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[i].length;j++)
            {
                if(backtrace(board,i,j,word,0))return true;
            }

        return false;
    }
    private boolean backtrace(char[][] board,int i, int j,String word,int index)
    {
        if(i<0||i>=board.length||j<0||j>=board[i].length)return false;
        char temp=board[i][j];
        boolean bound=false;
        if(word.charAt(index)==board[i][j]) {
           if(index==word.length()-1)return true;
           board[i][j]='#';
           bound=backtrace(board, i+1,j, word, index + 1)||backtrace(board, i-1,j, word, index + 1)||backtrace(board, i,j+1, word, index + 1)||backtrace(board, i,j-1, word, index + 1);
        }
        board[i][j]=temp;
        return bound;
    }
}
