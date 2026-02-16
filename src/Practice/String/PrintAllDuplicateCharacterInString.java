package Practice.String;

import java.util.Arrays;

public class PrintAllDuplicateCharacterInString {
    public static void main(String[] args) {
        String str = "hellohellohello";
        printDuplicates(str);

    }

    public static void printDuplicates(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);

        int n = charArr.length;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (charArr[i] == charArr[j]) j++;
            else {
                int length = j - i;
                if (length > 2) {
                    System.out.print("[" + charArr[i] + " " + length + "] ");
                }
                i = j;
            }

        }
//        its because the loop will exit before the else or calculation part of the last element
        int length = j - i;
        if (length > 2) {
            System.out.print("[" + charArr[i] + " " + length + "] ");
        }
    }
}
