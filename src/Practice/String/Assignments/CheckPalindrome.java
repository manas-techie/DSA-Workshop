package Practice.String.Assignments;

import java.util.Scanner;

//Assignment Question 3
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        int i = 0, j = str.length() - 1;
        boolean flag = false;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) flag = true;
            i++;
            j--;
        }

        if (flag) {
            System.out.println("String is not Palindrome");
        } else {
            System.out.println("String is palindrome");
        }
    }
}
