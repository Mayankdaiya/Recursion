package BackTracking;

import java.util.Scanner;

public class MazeSequence03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean grid[][]={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println("\n"+printSubsequence(grid,0,0,""));
    }
    public static int printSubsequence(boolean[][] board, int i,int j,String ans){
        if(i==board.length-1 && j==board[0].length-1){
            System.out.print(ans+" ");
            return 1;
        }
        if(!board[i][j]) return 0;
        int count=0;   //for counting the sequence
        if(i<board.length-1) count+=printSubsequence(board,i+1,j,ans+'D');   // D for down movement in grid
        if(j<board[0].length-1) count+=printSubsequence(board,i,j+1,ans+'R');   // R for right movement in grid
        return count;
    }
}
