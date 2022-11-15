import java.util.ArrayList;
import java.util.Scanner;

public class str_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(printSubsequences(str,""));
    }
    public static ArrayList<String> printSubsequences(String str, String ans){
        if(str.length()==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String> l1=printSubsequences(str.substring(1),ans+ch);
        ArrayList<String> l2=printSubsequences(str.substring(1),ans);
        l1.addAll(l2);
        return l1;
    }
}
