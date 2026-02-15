package Practice.String.Assignments;

import java.util.Scanner;

//Assignment question 6
public class ConcatenateWithItsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder sb = new StringBuilder(sc.next());
//        because reverse modify the original string
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.reverse();

        sb.append(sb2);
        System.out.println(sb);
    }
}
