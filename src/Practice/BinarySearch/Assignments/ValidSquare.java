package Practice.BinarySearch.Assignments;

public class ValidSquare {
    public static void main(String[] args) {
        System.out.println(perfectSquare(36));
        System.out.println(perfectSquare(45));
    }

//    Assignment Question 5 || leetcode 367
//    Time Complexity O(logn) Space Complexity O(1)
    public static boolean perfectSquare(int n) {
        if (n == 1){
            return true;
        }
        int low = 1, high = n/2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midSquare = (long) mid * mid ;
            if (midSquare == n) return true;
//            if (n / mid == mid) return true; //Find square root of a number
            else if (midSquare < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
