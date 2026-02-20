package Practice.String.Assignments;

import java.util.Arrays;

//Assignment Question 9
public class IsAnangram {
    public static void main(String[] args) {

//        Method 1
//        Time Complexity O(nlong) Space Complexity O(n) Auxiliary Space O(n)
        String str1 = "hello";
        String str2 = "lolhe";

//        if (str1.length() != str2.length()) {
//            System.out.println("The String are not anagram.");
//        } else {
//
// //            complexity O(n)
//            char[] char1 = str1.toCharArray();
//            char[] char2 = str2.toCharArray();
//
// //            complexity O(nlogn)
//            Arrays.sort(char1);
//            Arrays.sort(char2);
//
//            int flag = -1;
//            for (int i = 0; i < char1.length; i++) {
//                if (char1[i] != char2[i]) {
//                    flag++;
//                    System.out.println("The Strings are not anagram");
//                    break;
//                }
//            }
//
//            if (flag == -1) {
//                System.out.println("The Strings are anagram.");
//            }
//        }

//        method 2 using frequency array
//        Time Complexity O(n) Space Complexity(1) Auxiliary Space O(1)
        int flag = -1;

        if (str1.length() != str2.length()) {
            flag++;
        } else {

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

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
