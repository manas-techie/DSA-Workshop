package Practice.BasicMaths;

public class PalindromeNumber {
    public static void main(String[] args) {

    }

    //    Leetcode 9
//    Time Complexity O(log(base 10)x) , Space Complexity O(1), Auxiliary Space O(1)
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int realNum = x;
        int revNum = 0;
        while (x != 0) {
            int digit = x % 10;
            revNum = revNum * 10 + digit;
            x /= 10;
        }

        if (realNum == revNum) return true;

        return false;
    }
}
