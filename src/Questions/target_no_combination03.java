package Questions;

import java.util.Scanner;

public class target_no_combination03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("\n"+getTheCombination(num,""));
    }
    public static int getTheCombination(int num,String ans){
        if(num==0){
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        for(int i=1;i<=num;i++){
            if(num-i>=0) count+=getTheCombination(num-i,ans+i);
        }
        return count;
    }
}
