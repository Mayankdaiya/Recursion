package BackTracking;

import java.util.Scanner;

public class MazeSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int grid=sc.nextInt();
        System.out.println("\n"+printSubsequence(grid,grid,""));
    }
    public static int printSubsequence(int i,int j,String ans){
        if(i==1 && j==1){
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;   //for counting the sequence
        if(i>1) count+=printSubsequence(i-1,j,ans+'D');   // D for down movement in grid
        if(j>1) count+=printSubsequence(i,j-1,ans+'R');   // R for right movement in grid
        if(j>1 && i>1) count+=printSubsequence(i-1,j-1,ans+'V');   // V for diagonally movement in grid
        return count;
    }
}
