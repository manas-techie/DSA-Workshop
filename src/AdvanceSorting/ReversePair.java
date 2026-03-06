package AdvanceSorting;

public class ReversePair {
    //    Leetcode 493
    static int count;

    public static void inversion(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if ((long) a[i] > 2 * (long) b[j]) {
                count += (a.length - i);
                j++;
            } else {
                i++;
            }
        }
    }

    //    Time Complexity O(nlog) Space Complexity O(nlogn)
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

        mergeSort(a);
        mergeSort(b);

        //count inversion
        inversion(a, b);


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
            } else { //a[i] > b[j]
//                count += (a.length - i); //extra line for Inversion count
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

    public static int reversePairs(int[] arr) {
        count = 0;
        mergeSort(arr);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1};
        int count = reversePairs(arr);
        System.out.println(count);
    }

}
