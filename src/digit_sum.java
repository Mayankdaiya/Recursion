import java.util.Scanner;

public class digit_sum {
    public  static int getDigitSum(int n){
        if(n==0) return 0;
        int res=n%10+getDigitSum(n/10);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=getDigitSum(n);
        System.out.println(res);
    }
}
