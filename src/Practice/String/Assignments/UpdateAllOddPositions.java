package Practice.String.Assignments;

import java.util.Scanner;

//Assignment Question 1
public class UpdateAllOddPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                ans += str.charAt(i);
            } else {
                ans += '#';
            }
        }

        System.out.println(ans);
    }
}
