package String;

import java.util.Arrays;

public class isAnagram {
//    method 1
//    Time Complexity O(nlogn) Space Complexity O(n) Auxiliary Space O(n)
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
        String str1 = "manas";
        String str2 = "saman";
//        boolean result = isAnagram(str1,str2);
//        System.out.println(result);


//        optimal approach
        //        method 2 using frequency array
//        Time Complexity O(n) Space Complexity(1) Auxiliary Space O(1)
        int flag = -1;

        if (str1.length() != str2.length()) {
            flag++;
        } else {

            int[] freqArr = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                int index = (int) str1.charAt(i) - 'a';
                freqArr[index]++;
                index = (int) str2.charAt(i) - 'a';
                freqArr[index]--;
            }

            for (int i = 0; i < freqArr.length; i++) {
                if (freqArr[i] != 0) {
                    flag++;
                    break;
                }
            }

            if (flag == -1) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}
