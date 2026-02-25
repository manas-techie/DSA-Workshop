package Recursion;

public class PrintNumberReverse {
    //    Time and Space Complexity O(n)
    public static void print(int n) {
        if (n == 0) return;
        System.out.println(n);
//        if (n > 1) print(n - 1);
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5);
    }
}
