package Subset;

import java.util.ArrayList;
import java.util.Scanner;

public class string_subsequence02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> l=printSubsequence(str,"");
        System.out.println(l);
    }
    public  static ArrayList<String> printSubsequence(String str,String ans){
        if(str.isEmpty()){
            ArrayList<String> l=new ArrayList<>();
            l.add(ans);
            return l;
        }
        char ch=str.charAt(0);
        ArrayList<String> p=printSubsequence(str.substring(1),ans+ch);
        ArrayList<String> q=printSubsequence(str.substring(1),ans);
        p.addAll(q);
        return p;
    }
}
