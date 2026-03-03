package Recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(HCF(30, 96));
    }

    public static int HCF(int a, int b) {
        if (b % a == 0) return a;
        return HCF(b % a, a);
    }
}
