package Recursion;

public class RemoveAllOccurrence {
    public static void main(String[] args) {
        String s = "Manas Sidh";
        skipA(s, "", 0);
        System.out.println("");
    }

    public static void skipA(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
//        if (s.charAt(i) != 'a' && s.charAt(i) != 'A') ans += s.charAt(i);
//        skipA(s, ans, i + 1);
        if (s.charAt(i) != 'a' && s.charAt(i) != 'A') skipA(s, ans + s.charAt(i), i + 1);
        else skipA(s, ans, i + 1);
    }
}
