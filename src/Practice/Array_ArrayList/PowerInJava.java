package Practice.Array_ArrayList;

public class PowerInJava {
    //    Leetcode 50
//    Naive Approach With time complexity O(n) space complexity O(1)
    public static double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;

        double pow = 1;
        int num = Math.abs(n);
        for (int i = 0; i < num; i++) {
            if (n < 0) {
                pow /= x;
            } else {
                pow *= x;
            }
        }
        return pow;
    }
}
