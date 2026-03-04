package Recursion;

public class CountAndSay {
    public static void main(String[] args) {
        String ans = countAndSay(4);
        System.out.println(ans);
    }

    //    Time ComplexityO(L^2) and Space Complexity O(L) And Auxiliary Space O(L)  where L is the length of the String
    public static String countAndSay(int n) {
        if (n == 1) return "1"; //base case
        String s = countAndSay(n - 1) + "@";
        // now we have to modify s

        String ans = "";
        int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int len = j - i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        // int  len = j-i;
        // ans += len;
        // ans += s.charAt(i);
        return ans;
    }
}
