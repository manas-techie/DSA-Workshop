package AdvanceSorting;

public class InversionCount {
    static int count;

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void inversion(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
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


    public static void main(String[] args) {
        count = 0;
        int[] arr = {8, 2, 5, 3, 1, 4};
        mergeSort(arr);
        System.out.println(count);


//        Brute Force
//        Time Complexity O(n^2)  Space Complexity O(1)
//        int count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) count++;
//            }
//        }
//        System.out.println(count);
    }
}
