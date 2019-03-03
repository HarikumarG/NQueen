package com.example.harikumarg.utility;

public class Utility {
    public static boolean checkattack(int board[][],int n,int row,int col)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            if(board[row][i]==1)
                return false;
        }
        for(i=0;i<n;i++)
        {
            if(board[i][col]==1)
                return false;
        }
        for(i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=col;i<n && j<n;i++,j++)
        {
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=col;i<n && j>=0;i++,j--)
        {
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=col;i>=0 && j<n;i--,j++)
        {
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
    public static void initializeboard(int board[][])
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                board[i][j]=0;
            }
        }
    }
}
