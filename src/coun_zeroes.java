//import java.util.Scanner;
////code to count number of zeroes in a user inputted number
//
//public class coun_zeroes {
//    public static int countZeroes(int n,int c){
//        if(n==0) return c;
//        if(n%10==0) countZeroes(n/10,c+1);
//        else countZeroes(n/10,c);
//        return c;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(countZeroes(n,0));
//    }
//}
import java.util.Scanner;
//code to count number of zeroes in a user inputted number

public class coun_zeroes {
    public static int countZeroes(int n,int c){
        if(n==0) return c;
        if(n%10==0) return countZeroes(n/10,c+1);
        return countZeroes(n/10,c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countZeroes(n,0));
    }
}
