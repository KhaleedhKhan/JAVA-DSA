import java.util.*;

public class Rotatearray {
    public static void rotateArray(int arr[], int n, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    
    public static void reverse(int arr[], int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    public static void main(String[] args) {
        int n, i;
        int arr[];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt(); 
        rotateArray(arr, n, k);
        
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
