package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    //    Time And Space Complexity O(n)
    public static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        print2(1, n);


    }

    //    parameterized
    public static void print2(int x, int n) {
        if (x > n) return;
        System.out.println(x);
        print2(x + 1, n);
    }
}
