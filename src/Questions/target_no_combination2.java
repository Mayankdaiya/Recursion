package Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class target_no_combination2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(getTheCombination(num,""));
    }
    public static ArrayList<String> getTheCombination(int num, String ans){
        if(num==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num-i>=0) list.addAll(getTheCombination(num-i,ans+i));
        }
        return list;
    }
}
