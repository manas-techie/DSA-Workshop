package Stack_DS;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class PushElementIntoBottom {
    public static void main(String[] args) {
        // Time Complexity O(N) Space Complexity O(N) Auxiliary Space O(N)
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st_original = new Stack<>();

        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);

        Stack<Integer> st_temp = new Stack<>();
        while (st_original.size() > 0) {
            st_temp.push(st_original.pop());
        }

        System.out.print("Enter the element: ");
        int ele = sc.nextInt();

        st_original.push(ele);
        while (st_temp.size() > 0) {
            st_original.push(st_temp.pop());
        }

        System.out.println("Stack After Insertion is: " + st_original);
    }
}
