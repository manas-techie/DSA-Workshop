package Practice.BinarySearch.Assignments;

public class FIndAnArrayINInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 190, 200, 210, 250, 300};
        int target = 160;

        System.out.println(BinarySearch(arr, target));

    }

    //    Assignment Question 8
//    Time Complexity O(logp) Where p is the index of the target
//    Space Complexity O(1)
    public static int BinarySearch(int[] arr, int target) {
//        Exponential Search
        int low = 0;
        int high = 1;

        while (high < arr.length && arr[high] < target) {
            low = high; //increase the lower limit  because the element is greater than current high
            high = high * 2; //double the search space
        }

        high = Math.min(high, arr.length - 1);//if high become larger than the array's last index , cap it to the last valid index

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
