package Permutation;

import java.util.Scanner;

public class permutation_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(getThePermutationCount(str,""));
    }
    public static int getThePermutationCount(String str1,String str2){
        if(str1.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=str1.charAt(0);
        for(int i=0;i<=str2.length();i++){
            String t1=str2.substring(0,i);
            String t2=str2.substring(i,str2.length());
            count+=getThePermutationCount(str1.substring(1),t1+ch+t2);
        }
        return count;
    }
}
