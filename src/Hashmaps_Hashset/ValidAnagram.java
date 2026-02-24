package Hashmaps_Hashset;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean isAnagram = isAnagram(s, t);
        System.out.println(isAnagram);
    }

//    Leetcode 242
//    Time Complexity O(n+m) where n is no of element in array and m is no of keys in Hashmap Space complxity O(n)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sKey = s.charAt(i);
            char tKey = t.charAt(i);
            if (sMap.containsKey(sKey)) {
                int freq = sMap.get(sKey);
                sMap.put(sKey, freq + 1);
            } else {
                sMap.put(sKey, 1);
            }

            if (tMap.containsKey(tKey)) {
                int freq = tMap.get(tKey);
                tMap.put(tKey, freq + 1);
            } else {
                tMap.put(tKey, 1);
            }
        }

        for (char key : sMap.keySet()) {
            int sValue = sMap.get(key);
            if (!tMap.containsKey(key)) {
                return false;
            }
            int tValue = tMap.get(key);
            if (sValue != tValue) {
                return false;
            }
        }
        return true;
    }
}
