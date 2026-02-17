package BasicSorting;

public class InsertionSortDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 5, 7, 9};
        insertionSortDecreasingOrder(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSortDecreasingOrder(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                } else {
                    break; //because the right side of the loop is already sorted
                }
            }
        }
    }
}
