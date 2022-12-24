package Permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class string_permutation_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(getThePermutation(str,""));
    }
    public static ArrayList<String> getThePermutation(String str1, String str2){
        if(str1.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(str2);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=str1.charAt(0);
        for(int i=0;i<=str2.length();i++){
            String t1=str2.substring(0,i);
            String t2=str2.substring(i,str2.length());
            ans.addAll(getThePermutation(str1.substring(1),t1+ch+t2));
        }
        return ans;
    }
}
