package String;

import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] ch_s = s.toCharArray();
        char[] ch_t = t.toCharArray();
        Arrays.sort(ch_s);
        Arrays.sort(ch_t);

        for (int i = 0; i < ch_t.length; i++) {
            if (ch_s[i] != ch_t[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "manas";
        String t = "saman";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
}
