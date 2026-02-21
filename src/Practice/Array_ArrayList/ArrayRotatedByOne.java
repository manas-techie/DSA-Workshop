package Practice.Array_ArrayList;

public class ArrayRotatedByOne {
    public static void rotateArrayByOne(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n - 1) {
            swap(arr, i, i + 1);
            i++;
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArrayByOne(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
