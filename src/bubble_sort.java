import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sortArr(arr,n-1,0);
        for(int i=0;i<n;i++) System.out.print(arr[i]);
    }
    public static void sortArr(int[] arr,int n,int in){
        if(n==0) return;
        if(in<n){
            if(arr[in]>arr[in+1]){
                int t=arr[in];
                arr[in]=arr[in+1];
                arr[in+1]=t;
                sortArr(arr,n,++in);
            }
        }
        else sortArr(arr,n-1,0);
    }
}

