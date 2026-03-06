package AdvanceSorting;

public class MergeTwoSortedArray {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
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
        int[] a = {10, 30, 50, 60, 80};
        int[] b = {20, 40, 70, 75};

        int[] c = new int[a.length + b.length];
        merge(a, b, c);

        printArr(c);
    }
}
