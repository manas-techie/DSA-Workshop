package Practice.BinarySearch.Assignments;

public class BinarySearchOnADecreasingArray {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(BinarySearchDecreasing(arr, 7));
    }

//    Assignment Question 7
//    Time Complexity O(logn) Space Complexity O(1)
    public static int BinarySearchDecreasing(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
