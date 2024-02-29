import java.util.*;
import java.io.*;
public class Maxsubarray{
    public static int MaxsubarraySum(int arr[])
    {
        int n = arr.length;
        int a =arr[0];int b=arr[0];
        for(int i=1;i<n-1;i++)
        {   a = Math.max(arr[i],a+arr[i]);
            b = Math.max(b,a);
        }
        return b;
    }
    public static void main(String[] args)
    {
        int n,i;
        int arr[];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(MaxsubarraySum(arr));
    }
}