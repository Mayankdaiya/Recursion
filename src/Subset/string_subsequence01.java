package Subset;
import java.util.Scanner;

public class string_subsequence01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printSubsequence(str,"");
    }
    public  static void printSubsequence(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        printSubsequence(str.substring(1),ans+ch);
        printSubsequence(str.substring(1),ans);
    }
}
