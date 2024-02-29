import java.util.*;
import java.io.*;
public class Bubblesort
{
    public static void Sort(int arr[])
    {
        int n = arr.length;
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            for(j =0;j<n-1-i;j++)
            {
               if(arr[j]>arr[j+1])
               {
                temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               }
            }
        }
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
        Sort(arr);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
