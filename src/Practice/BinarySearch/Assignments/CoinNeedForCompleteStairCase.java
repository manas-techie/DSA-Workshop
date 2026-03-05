package Practice.BinarySearch.Assignments;

public class CoinNeedForCompleteStairCase {
    public static void main(String[] args) {
        System.out.println(completeRow(5));
        System.out.println(completeRow(8));
    }

    //    Assignment Question 6
//    Time Complexity O(logn) Space Complexity O(1)
    public static int completeRow(int n) {
        long low = 1, high = n;
        long row = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long neededCoin = mid * (mid + 1) / 2; // no of coins need to form the mid no of staircases

            if (neededCoin <= n) {
                row = mid;
                low = mid + 1; //try to find the maximum row of stair , we can form using the coins
            } else {
                high = mid - 1;
            }
        }
        return (int)row;
    }
}
