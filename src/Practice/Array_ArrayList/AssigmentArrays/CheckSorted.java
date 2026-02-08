package Practice.Array_ArrayList.AssigmentArrays;

public class CheckSorted {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 9};
        boolean result = isSorted(arr);
        if (result == true)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}
