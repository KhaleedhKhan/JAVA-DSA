import java.util.*;
import java.io.*;
public class Insertionsort
{
    public static void Sort(int arr[])
    {
        int n =arr.length;
        int i,j,value;
        for(i=1;i<n;i++)
        {
            value = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>value)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=value;
            
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