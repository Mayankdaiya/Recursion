package BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class MazeSequence02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int grid=sc.nextInt();
        System.out.println(printSubsequence(grid,grid,""));
    }
    public static ArrayList<String> printSubsequence(int i, int j, String ans){
        if(i==1 && j==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();  //for storing the sequence in arraylist
        if(i>1) list.addAll(printSubsequence(i-1,j,ans+'D'));   // D for down movement in grid
        if(j>1) list.addAll(printSubsequence(i,j-1,ans+'R'));   // R for right movement in grid
        if(j>1 && i>1) list.addAll(printSubsequence(i-1,j-1,ans+'V'));   // V for diagonally movement in grid
        return list;
    }
}
