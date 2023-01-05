package BackTracking;

import java.util.Scanner;

public class MazeSequence03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean grid[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        printSubsequence(grid,0,0,"");
    }
    public static void printSubsequence(boolean[][] board, int i,int j,String ans){
        if(i==board.length-1 && j==board[0].length-1){
            System.out.print(ans+" ");
            return;
        }
        if(!board[i][j]) return;
        board[i][j]=false;
        if(j<board[0].length-1) printSubsequence(board,i,j+1,ans+'R');   // R for right movement in grid
        if(i<board.length-1) printSubsequence(board,i+1,j,ans+'D');   // D for down movement in grid
        if(j>0) printSubsequence(board,i,j-1,ans+'L');   // L for left movement in grid
        if(i>0) printSubsequence(board,i-1,j,ans+'U');   // U for up movement in grid

        //this line is where the functions will be over
        //so before the functions gets removed, also removed the changes that were made by the function
        board[i][j]=true;
    }
}
