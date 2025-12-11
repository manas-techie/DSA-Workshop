package Array;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // initialize -> 1
        int[] arr = new int[5];

        // initialize -> 2
        int[] arr1 = {2, 3, 4, 5, 6, 7, 8};
        System.out.println("arr2 length = " + arr1.length);

        // input -> for loop
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // input -> for loop
        System.out.print("The array elements are : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}