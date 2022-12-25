package Questions;

import java.util.Scanner;

public class keypad_combination_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println("\n"+getTheCombination(str,""));
    }
    public static int getTheCombination(String str1,String str2){
        if(str1.isEmpty()){
            System.out.print(str2+" ");
            return 1;
        }
        int count=0;
        int digit=str1.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count+=getTheCombination(str1.substring(1),str2+ch);
        }
        return count;
    }
}
