package Practice.BinarySearch;

public class SearchInsertedPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int index = searchInsert(arr, 2);
        System.out.println(index);
    }

//    Time Complexity O(logn) Space Complexity O(1)
    public static int searchInsert(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int hb = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2; //if array element is available return the index
            if (arr[mid] == target) return mid; //if target is not present return the higher bound
            else if (arr[mid] > target) {
                hb = Math.min(mid, hb);
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }

//        if target is greater than the greatest array element
        if (hb == Integer.MAX_VALUE) {
            return arr.length;
        }

        return hb;
    }
}
