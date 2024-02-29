import java.util.*;
import java.io.*;
public class Arraysum
{
    public static int Arraysum(int arr[])
    {
       int n = arr.length;
       int sum =0;
       for(int i=0;i<n;i++)
       {
             sum+= arr[i];
       }
       return sum;
    }
    public static void main(String[] args)
    {
        int arr[];
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(Arraysum(arr));
    }
}