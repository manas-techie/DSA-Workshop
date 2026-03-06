package AdvanceSorting;

public class MergeSort {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;

//        Base case
        if (n == 1) return;

//        divide the array into two equal part for even no element and case  of odd divide like (e.g 3 and 4)
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n - n / 2; i++) {
            b[i] = arr[i + n / 2];
        }

//        recursion
        mergeSort(a);
        mergeSort(b);

//        after thiis we will merge these a and b
        merge(a, b, arr);

//        remove both arrays
        a = null;
        b = null;
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        // now takes elements from b only
        while (j < b.length) {
            c[k++] = b[j++];
        }
        // now takes elements from a only
        while (i < a.length) {
            c[k++] = a[i++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {80, 30, 70, 30, 60, 40, 50, 20};
        mergeSort(arr);
        printArr(arr);
    }
}
