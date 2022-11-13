package pattern;

import java.util.Scanner;

public class triangle {
    public static void print_triangle(int n,int c){
        if(n==0){
            return;
        }
        if(c==n) {
            System.out.println();
            print_triangle(n - 1, 0);
            return;
        }
        System.out.print("* ");
        print_triangle(n,++c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_triangle(n,0);
    }
}
