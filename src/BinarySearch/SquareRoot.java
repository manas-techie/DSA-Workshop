package BinarySearch;

public class SquareRoot {

//    Leetcode 69
//    Time complexity O(logn)  Space Complexity O(1)
    //Method 1 using long
    public static int mySqrt(int x) {
        long low = 0, high = (long) x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x) return (int) mid;
            else if (mid * mid > x) high = mid - 1;
            else low = mid + 1;
        }
        return (int) high;
    }

    //    Method 2
//    public static int mySqrt(int x) {
//        if (x <= 1) return 1;
//        int low = 0, high = x;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            // Same just alter the writting style mid * mid == x and mid == x / mid are the same
//            if (mid == x / mid) return mid;
//            else if (mid  > x / mid) high = mid - 1;
//            else low = mid + 1;
//        }
//        return high;
//    }

    public static void main(String[] args) {
        int squrX = mySqrt(16);
        System.out.println(squrX);
    }
}
