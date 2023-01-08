package Questions;

import java.util.Scanner;

public class keypad_combination01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        getTheCombination(str,"");
    }
    public static void getTheCombination(String str1,String str2){
        if(str1.isEmpty()){
            System.out.println(str2);
            return;
        }
        int digit=str1.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            getTheCombination(str1.substring(1),str2+ch);
        }
    }
}
