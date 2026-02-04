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
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
//            Find the minimum element and index of minimum element
            int min = Integer.MAX_VALUE;
            int minIDX = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIDX = j;
                }
            }
//            swap the i and minimum element of unsorted part
            swapArrEle(arr, i, minIDX);
        }
        printArr(arr);
    }
}
