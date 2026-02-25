package Practice.BinarySearch;

public class FloorAndCellInSortedArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int[] ans = getFloorAndCeil(arr, 1);
        System.out.print(ans[0] + " " + ans[1]);
    }
//    Time Complexity  O(logn) Space Complexity O(1)
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int[] ans = {-1, -1};
        int low = 0, high = arr.length - 1;
        int floor = Integer.MIN_VALUE, cell = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ans[0] = arr[mid];
                ans[1] = arr[mid];
                break;
            } else if (arr[mid] > x) {
                cell = Math.min(cell, arr[mid]);
                ans[1] = cell;
                high = mid - 1;
            } else {
                floor = Math.max(floor, arr[mid]);
                ans[0] = floor;
                low = mid + 1;
            }
        }
        return ans;
    }
}
