package Practice.BinarySearch.Assignments;

public class CountOnesInBinaryArray {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
        int noOfOnes = noOfOnes(arr);
        System.out.println(noOfOnes);
    }

    //    Assignment Question 2
//    Time Complexity O(logn) Space Complexity O(1)
    public static int noOfOnes(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int firstOccur = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                firstOccur = mid;
                high = mid - 1; //try to find the first occurrence
            } else {
                low = mid + 1; //Because this is binary array contain only 0 and 1
            }
        }
        if (firstOccur != -1) {
            return n - firstOccur;
        }
        return -1;
    }
}
