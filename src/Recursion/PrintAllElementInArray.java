package Recursion;

public class PrintAllElementInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 3, 8, 6, 9, 4};

        print(arr, 0);
    }

    public static void print(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }
}
