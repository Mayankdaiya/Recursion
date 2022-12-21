package Subset;
//import java.util.Scanner;
//
//public class string_subsequence1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        printSubsequence(str,"");
//    }
//    public  static void printSubsequence(String str,String ans){
//        if(str.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//        char ch=str.charAt(0);
//        printSubsequence(str.substring(1),ans+ch);
//        printSubsequence(str.substring(1),ans);
//    }
//}

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Eratosth(n);
    }
    public static void Eratosth(int n){
        int num=1, c=0, i;
        while(c<n){
            num++;
            for(i=2;i<=num;i++){
                if(num%i==0) break;
            }
            if(i==num){
                c++;
            }
        }
        System.out.println(num);
    }
}