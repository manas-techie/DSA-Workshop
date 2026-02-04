package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] a = {10, 26, 67, 78, 89, 103, 156, 234, 345};
        int target = 25;
        FoundUpperBound(a, target);
    }

    public static void FoundUpperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ub = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ub = Math.min(ub, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ub);
    }
}
