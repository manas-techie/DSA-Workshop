package Practice.String;

public class LargestOddNummberInAString {
    public static void main(String[] args) {
        String num = "52";
        String ans = largestOddNumber(num);
        System.out.println(ans);
    }

//    Leetcode 1903
//    Time Complexity O(n) , Space Complexity O(1)
    public static String largestOddNumber(String num) {
        int len = num.length();
        if ((int) num.charAt(len - 1) % 2 == 1) return num;

        int i = len - 1;
        while (i >= 0) {
            if (num.charAt(i) % 2 == 1) {
                return num.substring(0, i + 1);
            }
            i--;
        }
        return "";
    }
}
