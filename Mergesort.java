import java.util.*;
import java.io.*;
public class Mergesort{
    public static void mergesort(int arr[])
    {
      int n = arr.length;
      if(n<2)
      {
        return;
      }
      int mid = n/2;
      int lefthalf[]  = new int[mid];
      int righthalf[] = new int[n-mid];
      for(int i=0;i<mid;i++)
      {
        lefthalf[i] = arr[i];
      }
      for(int i=mid;i<n;i++)
      {
        righthalf[i-mid]=arr[i];
      }
      mergesort(lefthalf);
      mergesort(righthalf);
      Merge(arr,lefthalf,righthalf);
    }
    private static void Merge(int [] arr, int [] lefthalf, int []righthalf){
        int i=0, j=0,k=0;
        int leftsize = lefthalf.length;
        int rightsize = righthalf.length;
        while(i<leftsize && j<rightsize)
        {
            if(lefthalf[i]<=righthalf[j])
            {
                arr[k]=lefthalf[i];
                i++;
            }
            else
            {
                arr[k]=righthalf[j];
                j++;
            }
            k++;
        }
        while(i<leftsize)
        {
            arr[k]=lefthalf[i];
            i++;
            k++;
        }
        while(j<rightsize)
        {
            arr[k]=righthalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        int arr[],i,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(arr);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        
    }
}