package Permutation;

import java.util.Scanner;

public class string_permutation_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        getThePermutation(str,"");
    }
    public static void getThePermutation(String str1,String str2){
        if(str1.isEmpty()){
            System.out.println(str2);
            return;
        }
        char ch=str1.charAt(0);
        for(int i=0;i<=str2.length();i++){
            String t1=str2.substring(0,i);
            String t2=str2.substring(i,str2.length());
            getThePermutation(str1.substring(1),t1+ch+t2);
        }
    }
}
