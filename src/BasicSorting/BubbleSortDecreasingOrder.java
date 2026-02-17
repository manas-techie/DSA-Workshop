package BasicSorting;

public class BubbleSortDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1, 5, 3, 7, 8};
        bubbleSorDecreasing(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void bubbleSorDecreasing(int[] arr) {
        int n = arr.length;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            flag = checkIfSorted(arr);
            if (flag == true) break;
        }
    }

    public static boolean checkIfSorted(int[] arr) {
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false; //flase -> unsorted
                break;
            }
        }
        return flag;
    }
}
