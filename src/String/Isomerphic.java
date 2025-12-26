package String;

import java.util.Scanner;

public class Isomerphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean result = checkIsomerphic(s, t);
        System.out.println(result);


    }
//    Leetcode 205

//    Method 1
//    Time Complexity O(n) and Space Complexity O(1)
//
//    public static boolean checkIsomerphic(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        char[] freArr = new char[128]; //'\0'
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            char dh = t.charAt(i);
//            int idx = (int) ch;
//            if (freArr[idx] == '\0') {
//                freArr[idx] = dh;
//            } else {
//                if (freArr[idx] != dh) return false;
//            }
//        }
//
//        for (int i = 0; i < 128; i++)
//            freArr[i] = '\0';
//
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            char dh = s.charAt(i);
//            int idx = (int) ch;
//            if (freArr[idx] == '\0') {
//                freArr[idx] = dh;
//            } else {
//                if (freArr[idx] != dh) return false;
//            }
//        }
//
//        return true;
//    }

    //    Method 2
    public static boolean checkIsomerphic(String s, String t) {
        if (s.length() != t.length()) return false;
//        128 character and 128 special character
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int idx1 = (int) s.charAt(i);
            int idx2 = (int) t.charAt(i);

            if (map1[idx1] != map2[idx2]) return false;

            map1[idx1] = i + 1;
            map2[idx2] = i + 1;
        }
        return true;
    }
}

