import java.util.Scanner;

public class is_array_sorted {
    public static boolean isArraySorted(int arr[],int in){
        if(arr.length==in) return true;
        return arr[in]>arr[in-1] && isArraySorted(arr,in+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(isArraySorted(arr,1));
    }
}
