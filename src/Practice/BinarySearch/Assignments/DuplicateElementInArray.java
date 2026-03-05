package Practice.BinarySearch.Assignments;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4};
        System.out.println(duplicateElement(arr));
    }

    //    Assignment Question 4
//    Time Complexity O(logn) Space Complexity O(1)
    public static int duplicateElement(int[] arr) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == mid + 1) { //duplicate has not occurred yet
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[low];
    }
}
