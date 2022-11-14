import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class merge_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        arr=sortArr(arr);
        for(int i=0;i<n;i++) System.out.print(arr[i]);
    }
    public static int[] sortArr(int[] arr){
        if(arr.length==1) return arr;
        int mid=arr.length/2;
        int a1[]= sortArr(Arrays.copyOfRange(arr,0,mid));
        int a2[]= sortArr(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeArr(a1,a2);
    }
    public static int[] mergeArr(int[] a1,int[] a2){
        int i=0, j=0, k=0;
        int mix[]=new int[a1.length+a2.length];
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]) mix[k++]=a1[i++];
            else mix[k++]=a2[j++];
        }
        while(i<a1.length) mix[k++]=a1[i++];
        while(j<a2.length) mix[k++]=a2[j++];
        return mix;
    }
}
