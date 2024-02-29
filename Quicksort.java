import java.util.*;
import java.io.*;
import java.lang.*;
public class Quicksort{
    public static void Quick(int[] arr, int lowIndex , int highIndex)
    {
        if(lowIndex>=highIndex)
        {
            return;
        }
        int pivot = arr[highIndex];
        int leftpointer = lowIndex;
        int rightpointer = highIndex-1;
        while(leftpointer<=rightpointer)
        {
            while(arr[leftpointer]<=pivot && leftpointer<=rightpointer)
            {
                leftpointer++;
            }
            while(arr[rightpointer]>=pivot && rightpointer>=leftpointer)
            {
                rightpointer--;
            }
            if(leftpointer<rightpointer)
            {
            swap(arr,leftpointer,rightpointer);
            }
        }
        swap(arr,leftpointer,highIndex);
        Quick(arr,lowIndex,leftpointer-1);
        Quick(arr,leftpointer+1,highIndex);
    }
    private static void swap(int arr[], int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
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
        Quick(arr,0,n-1);
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

}    
}