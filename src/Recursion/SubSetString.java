package Recursion;

import java.util.ArrayList;

public class SubSetString {
    static ArrayList<String> arr = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abcd";
        arr = new ArrayList<>();
        subset(s, "", 0);

        System.out.println(arr);
    }

    public static void subset(String s, String ans, int i) {
        if (i == s.length()) {
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);

        subset(s, ans, i + 1); //Skip
        subset(s, ans + ch, i + 1); //Take
    }
}
