import java.util.*;
import java.io.*;
public class Binarysearch{
    public static int search(int arr[], int val)
    {
        int n =arr.length;
        int mid;
        int low=0;
        int high = n-1;
        while(low <= high)
        {
            mid = low +(high-low) /2;
            if(arr[mid]==val)
            {
                return mid;
            }
            else{
            if(arr[mid]<val)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    }
    return -1;
    }
    public static void main(String[] args)
    {
        int arr[];
        int n,i,z;
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        z=sc.nextInt();
        System.out.print(search(arr,z));
        
    }
}