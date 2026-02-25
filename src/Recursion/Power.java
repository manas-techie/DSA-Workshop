package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
        System.out.println(power2(2, 11));
    }

    //    Time Complexity O(b) Space Complexity O(b)
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    //Time and space Complexity O(log(base2)b)
    public static int power2(int a, int b) {
        if (b == 0) return 1;
        int ans = power2(a, b / 2);
        if (b % 2 == 0) return ans * ans;
        return ans * ans * a;
    }

    //    Leetcode 50
//    solve using Binary Exponentiation
    public static double myPow(double x, int n) {
        if (x == 0) return 0.0;
        if (n == 0) return 1.0;
        if (x == 1) return 1.0;
        if (x == -1 && n % 2 == 0) return 1.0;
        if (x == -1 && n % 2 != 0) return -1.0;

        long binaryNum = n;

        if (n < 0) {
            x = 1 / x;
            binaryNum = -binaryNum;
        }
        double pow = 1;

        while (binaryNum > 0) {
            if (binaryNum % 2 == 1) {
                pow *= x;
            }
            x *= x;
            binaryNum /= 2;
        }
        return pow;
    }


}
