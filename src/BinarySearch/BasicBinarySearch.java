package BinarySearch;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] a = {10, 26, 67, 78, 89, 103, 156, 234, 345};
        int target = 345;
        BinarySearch(a, target);
    }

    public static void BinarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        boolean flag = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found on position " + (mid+1));
                flag = true;
                break;
            } else if (arr[mid] < target) low = mid + 1;
            else if (arr[mid] > target) high = mid - 1;
        }

        if (flag == false) System.out.println("Element not found");
    }
}
