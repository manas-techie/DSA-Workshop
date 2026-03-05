package Practice.BinarySearch.Assignments;

public class SearchInARoatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 6, 7, 0, 1, 2, 4, 4};
        System.out.println(BinarySearchInRotatedArray(nums, 4));

    }

    //    Assignment Question 10
//    Time Complexity O(logn) Space Complexity O(1)
    public static int BinarySearchInRotatedArray(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] <= arr[high]) { //mid to high every thing is sorted
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else { //low to mid every thing is sorted
                if (target > arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
