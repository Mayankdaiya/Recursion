package Questions;

import java.util.Scanner;

public class target_no_combination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        getTheCombination(num,"");
    }
    public static void getTheCombination(int num,String ans){
        if(num==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=1;i<=num;i++){
            if(num-i>=0) getTheCombination(num-i,ans+i);
        }
    }
}
