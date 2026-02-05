package BinarySearch;

public class PeakIndex {
    //Leetcode 852
//    Time complexity O(logn) Space complexity O(1)
    public static int peakIndexInMountainArray(int[] arr) {
        // The reasone for taking the low = 1 and high = n-1 is avoid the index of of bound error
        int low = 1, high = arr.length - 2;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 20, 10};
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println(peakIndex);
    }
}
