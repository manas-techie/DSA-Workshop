package Practice.String;

public class RemoveOutmostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        String ans = removeOuterParentheses(s);
        System.out.println(ans);
    }

    //    method 2
//    Time Complexity O(n) Space Complexity O(n)
    public static String removeOuterParentheses2(String s) {
        StringBuilder ans = new StringBuilder();
        int len = s.length();
        int start = 0, end = 0, count = 0;
        while (end < len) {
            if (s.charAt(end) == '(') count++;
            else count--;

            if (count == 0) {
                ans.append(s.substring(start + 1, end));
                start = end + 1;
            }
            end++;
        }

        return ans.toString();
    }

    //    Leetcode 1021
//    Method 1
//    Time Complexity O(n) Space Complexity O(N) Auxiliary Space O(1)
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) {
                    ans.append(s.charAt(i));
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }
}
