package BasicSorting;

public class SelectionSortDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 5, 7, 9};
        selectionSortDecreasingOrder(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSortDecreasingOrder(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            int minEle = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j >= 0; j--) {
                if (arr[j] < minEle) {
                    minEle = arr[j];
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }
}
