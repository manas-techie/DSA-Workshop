package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] a = {10, 26, 67, 78, 89, 103, 156, 234, 345};
        int target = 25;
        FoundLowerBound(a, target);
    }

    public static void FoundLowerBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int lb = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(lb);
    }
}
