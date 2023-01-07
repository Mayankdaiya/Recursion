package Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class target_no_combination02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(getTheCombination(num,""));
    }
    public static ArrayList<String> getTheCombination(int num, String ans){
        if(num==0){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(ans);
            return arr;
        }
        ArrayList<String> arr=new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num-i>=0) arr.addAll(getTheCombination(num-i,ans+i));
        }
        return arr;
    }
}