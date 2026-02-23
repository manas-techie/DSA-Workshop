package BasicSorting;

public class SelectionSort {
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swapArrEle(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //    time complexity = O(n^2) and space complexity = O(1)
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 5, 7, 2};
        selectionSort(arr);
        printArr(arr);
        System.out.println();
        int[] arr1 = {7, 4, 1, 5, 3};
        selectionSort(arr1);
        printArr(arr1);
        System.out.println();
        int[] arr2 = {5, 4, 4, 1, 1};
        selectionSort(arr2);
        printArr(arr2);
        System.out.println();
        int[] arr3 = {4, 2, 8, 6, 9};
        selectionSort(arr3);
        printArr(arr3);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
//            Find the minimum element and index of minimum element
            int min = Integer.MAX_VALUE;
            int minIDX = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIDX = j;
                }
            }
//            swap the i and minimum element of unsorted part
            if (minIDX != i) {
                swapArrEle(arr, i, minIDX);
            }
        }
    }
}
