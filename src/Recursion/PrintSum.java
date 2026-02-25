package Recursion;

public class PrintSum {
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum2(5, 0));
    }

    //    Time and Space complexity O(n)
    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    //    parameterized
    public static int sum2(int n, int s) {
        if (n == 0) {
            return s;
        }
        return sum2(n - 1, s + n);
    }
}
