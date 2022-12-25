package Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class keypad_combination_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(getTheCombination(str,""));
    }
    public static ArrayList<String> getTheCombination(String str1, String str2){
        if(str1.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(str2);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=str1.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(getTheCombination(str1.substring(1),str2+ch));
        }
        return ans;
    }
}
