package Recursion;

public class StairPath {
    public static void main(String[] args) {
        System.out.println(stair(5));
        System.out.println(stair2(5));
    }

//    Time Complexity O(2^n)  Space Complexity O(n)
//    The space complexity is determined by the maximum depth of the recursive call stack
//    if 1 and 2 jumps are allow
    public static int stair(int n) {
        if (n <= 2) return n;
        return stair(n - 1) + stair(n - 2);
    }

    //    if 1 and 3 jump are allowed
    public static int stair2(int n) {
        if (n <= 2) return 1;
        if (n == 3) return 2;

        return stair2(n - 1) + stair2(n - 3);
    }
}
