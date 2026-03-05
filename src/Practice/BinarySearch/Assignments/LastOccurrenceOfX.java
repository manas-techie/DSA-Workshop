package Practice.BinarySearch.Assignments;

public class LastOccurrenceOfX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 4, 5};
        int lastOccur = lastOccurrence(arr, 4);
        System.out.println(lastOccur);

    }

    //    Assignment question 1
//    Time Complexity O(logn) Space Complexity O(1)
    public static int lastOccurrence(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int lastOccur = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                lastOccur = mid;
                low = mid + 1; //if we find the element , try to find it's last occurrence
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastOccur;
    }
}
