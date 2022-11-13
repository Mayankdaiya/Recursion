import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sortArr(arr,n-1,1,0);
        for(int i=0;i<n;i++) System.out.print(arr[i]);
    }
    public static void sortArr(int[] arr,int n,int in,int maxi){
        if(n==0) return;
        if(in<=n) {
            if (arr[in] > arr[maxi]) sortArr(arr, n, ++in, in);
            else sortArr(arr,n,++in,maxi);
        }
        else{
            int t=arr[maxi];
            arr[maxi]=arr[n];
            arr[n]=t;
            sortArr(arr,n-1,1,0);
        }
    }
}

