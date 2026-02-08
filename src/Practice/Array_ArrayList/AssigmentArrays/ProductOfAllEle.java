package Practice.Array_ArrayList.AssigmentArrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductOfAllEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(), sum = 0;
        int[] arr = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        for (int ele : arr)
            sum += ele;
        System.out.println("The sum of elements in array is: " + sum);
    }
}
