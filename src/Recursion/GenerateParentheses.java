package Recursion;

public class GenerateParentheses {
    public static void main(String[] args) {
        printParentheses(0, 0, 3, "");
    }

    public static void printParentheses(int noOfOpenPar, int noOfClosePar, int n, String ans) {
        if (ans.length() == 2 * n) {
            System.out.println(ans);
            return;
        }
        if (noOfOpenPar < n) printParentheses(noOfOpenPar + 1, noOfClosePar, n, ans + "(");
        if (noOfClosePar < noOfOpenPar) printParentheses(noOfOpenPar, noOfClosePar + 1, n, ans + ")");
    }
}
