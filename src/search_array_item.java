import java.util.Scanner;

public class search_array_item {
    public static boolean findItem(int arr[],int in,int item){
        if(in==arr.length) return false;
        return arr[in]==item || findItem(arr,in+1,item);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int item=sc.nextInt();
        System.out.println(findItem(arr,0,item));
    }
}
