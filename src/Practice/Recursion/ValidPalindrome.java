package Practice.Recursion;

public class ValidPalindrome {
    static boolean flag;

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str) {
        if (str.trim() == "") return true;
        str = str.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");

        flag = true;
        helper(str, 0, str.length() - 1);

        return flag;
    }

    public static void helper(String str, int i, int j) {
        if (i >= j) return;

        if (str.charAt(i) != str.charAt(j)) {
            flag = false;
            return;
        }

        helper(str, i + 1, j - 1);
    }
}
