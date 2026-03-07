package AdvanceSorting;

public class KthLargestElement {
    static int targetEle;

//    Leetcode 215
//    Time Complexity O(nlogn) Space Complexity O(n)
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int index = findKthLargest(arr, 2);
        System.out.println(index);
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

    public static void quickSelect(int[] arr, int low, int high, int kIdx) {
        if (low > high) return;
        if (low == high) {
            if (low == kIdx) targetEle = arr[low];
            return;
        }

        int idx = partition(arr, low, high);

        if (idx == kIdx) {
            targetEle = arr[idx];
        } else if (idx < kIdx) {
            quickSelect(arr, idx + 1, high, kIdx);
        } else {
            quickSelect(arr, low, idx - 1, kIdx);
        }
    }

    public static int findKthLargest(int[] arr, int k) {
        targetEle = 0;
        int kIdx = arr.length - k;
        quickSelect(arr, 0, arr.length - 1, kIdx);
        return targetEle;
    }
}
