package AdvanceSorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 8, 1, 3, 2, 6, 5};
        quickSort(arr, 0, arr.length - 1);

        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivotIdx = (low + high) / 2;
        int pivot = arr[pivotIdx];
        int smallerCount = 0;
        for (int i = low; i <= high; i++) {
            if (i == pivotIdx) continue;
            if (arr[i] <= pivot) {
                smallerCount++;
            }
        }
        int correctIdx = low + smallerCount;

        //swap(arr[pivotIdx] and arr[correctIdx]
        swap(arr, pivotIdx, correctIdx);

        //partition
        int i = low, j = high;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if(arr[i]>pivot && arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return correctIdx;
    }

    public static void quickSort(int[] arr, int low, int high) {
//        Base case
        if (low >= high) return;

        //placed the pivot to it's right place
        int idx = partition(arr, low, high);
        quickSort(arr, low, idx - 1);
        quickSort(arr, idx + 1, high);
    }
}
