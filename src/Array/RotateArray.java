package Array;

public class RotateArray {
    public static void main(String[] args) {
        // method -> without using extra array
        int[] arr = {2, 3, 4, 5, 6, 7, 7, 9};
        rotate(arr, 4);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    //    Leetcode 189
//    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static void rotate(int[] arr, int k) {
        //length of the array
        int n = arr.length;
        k = k % n;

        //reverse first half from 0 to n-k-1
        reverse(arr, 0, n - k - 1);
        //reverse second half from n-k to n-1
        reverse(arr, n - k, n - 1);
        //reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        int n = arr.length;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //    method -> using extra Array
//Time Complexity O(n) Space Complexity O(n) Auxiliary Space O(n)
    public static void rotate2(int[] arr, int k) {
        int n = arr.length;
        int[] newArr = new int[n];
        k = k % n;
        int j = 0;
        for (int i = n - k; i < n; i++) {
            newArr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n - k; i++) {
            newArr[j] = arr[i];
            j++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }
    }

}
