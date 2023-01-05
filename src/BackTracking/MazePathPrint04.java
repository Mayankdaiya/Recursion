package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class MazePathPrint04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean grid[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int path[][]=new int[grid.length][grid[0].length];
        printSubsequence(grid,0,0,"",path,1);
    }
    public static void printSubsequence(boolean[][] board, int i,int j,String ans,int[][] path,int step){
        if(i==board.length-1 && j==board[0].length-1){
            path[i][j]=step;
            for(int[] a:path) System.out.println(Arrays.toString(a));
            System.out.println(ans+"\n");
            return;
        }
        if(!board[i][j]) return;
        board[i][j]=false;
        path[i][j]=step;
        if(j<board[0].length-1) printSubsequence(board,i,j+1,ans+'R',path,step+1);   // R for right movement in grid
        if(i<board.length-1) printSubsequence(board,i+1,j,ans+'D',path,step+1);   // D for down movement in grid
        if(j>0) printSubsequence(board,i,j-1,ans+'L',path,step+1);   // L for left movement in grid
        if(i>0) printSubsequence(board,i-1,j,ans+'U',path,step+1);   // U for up movement in grid

        //this line is where the functions will be over
        //so before the functions gets removed, also removed the changes that were made by the function
        step=0;
        board[i][j]=true;
    }
}
