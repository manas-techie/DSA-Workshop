package Practice.String.Assignments;

import java.util.Scanner;

//Assignment Question 7
public class SecondLargestNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        int max = -1;
        int secondMax = -1;
        for (int i = 0; i < str.length(); i++) {
            int charInt = charToInt(str.charAt(i));
            if (charInt > max) {
                secondMax = max;
                max = charInt;
            } else if (charInt > secondMax && charInt < max) {
                secondMax = charInt;
            }
        }
        if (secondMax == -1) {
            System.out.println("There is no second largest Element in the String"); //example - 1111
        } else {
            System.out.println(secondMax);
        }
    }

    public static int charToInt(char ch) {
        return (ch - '0');
    }
}

