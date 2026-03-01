package Recursion;

public class StringTraversal {
    public static void main(String[] args) {
        String str = "Manas Sidh";
        printStr(str, 0);
    }

    public static void printStr(String str, int i) {
        if (i == str.length()) return;
        System.out.println(str.charAt(i));
        printStr(str, i + 1);
    }
}
