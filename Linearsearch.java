import java.util.*;
import java.io.*;
public class Linearsearch{
    public static int search(int arr[], int val)
    {
        int n =arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==val)
            {
                return 1;
            }
        }
        return -1;
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
        int z = sc.nextInt();
        System.out.println(search(arr,z));
    }
}