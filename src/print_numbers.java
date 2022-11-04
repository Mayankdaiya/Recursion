import java.util.Scanner;

public class print_numbers {
    public static void printseries(int n){
        if(n==0) return;
        System.out.println(n);
        printseries(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printseries(n);
    }
}
