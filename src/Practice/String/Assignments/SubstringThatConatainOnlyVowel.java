package Practice.String.Assignments;

import java.util.Scanner;

//Assignment Question 8
public class SubstringThatConatainOnlyVowel {
    public static void main(String[] args) {
//        method - 1
//        Brute Force
//        Time Complexity O(n^3) Space Complexity O(n) Auxiliary Space O(1)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
//        int count = 0;
//        int n = str.length();
//        for (int i = 0; i < n-1; i++) {
//            for (int j = i; j < n; j++) {
//                if(isVowel1(str, i, j)){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

//        method 2
//        optimal method Time Complexity O(n) and Space Complexity O(n) and Auxiliary Space O(1)
        int totalCount = 0;
        int i = 0;
        while (i < str.length()) {
//            Skip non-vowel
            if (!isVowel(str.charAt(i))) {
                i++;
                continue;
            }

//            Find the start of the substring and end of the substring
            int startIndex = i;
            while (i < str.length() && isVowel(str.charAt(i))) {
                i++;
            }

//            find the length of the substring
            int n = i - startIndex;
//            Apply the formula
            totalCount += n * (n + 1) / 2;
        }
        System.out.println(totalCount);
    }


//    public static boolean isVowel1(String str, int start, int end) {
//        for (int i = start; i <= end; i++) {
//            char ch = str.charAt(i);
//            if (!(ch == 'a' || ch == 'A' || ch == 'i' || ch == 'I' || ch == 'e' || ch == 'E' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;
        return false;
    }

}
