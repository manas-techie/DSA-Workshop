package Recursion;

import java.util.Scanner;

public class GenerateBinaryStringWithoutConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printBinaryString(n, "");
    }

    public static void printBinaryString(int n, String ans) {
        int len = ans.length();
        if (len == n) {
            System.out.println(ans);
            return;
        }
        if (len == 0 || ans.charAt(len - 1) == '0') {
            printBinaryString(n, ans + 0);
            printBinaryString(n, ans + 1);
        } else {
            printBinaryString(n, ans + 0);
        }
    }
}
