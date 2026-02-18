package Practice.BasicSorting.Assignment;

//Assignment Question 10
//Time Complexity O(n^2 * m) , Where n = no of array element and m = average length of string elements
//Space Complexity O(1)
public class SortStringArrayUsingBubbleSort {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swaped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
//            The Array is Already sorted
            if (!swaped) break;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry", "date", "blueberry"};

        System.out.println("Before sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nAfter sorting:");
        printArray(arr);
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
