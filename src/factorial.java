import java.util.Scanner;

public class factorial {
    public static int getfactorial(int n){
        if(n==0) return 1;
        int res=n*getfactorial(n-1);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=getfactorial(n);
        System.out.println(res);
    }
}
