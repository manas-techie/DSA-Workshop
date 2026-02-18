package Practice.BasicSorting.Assignment;

import java.util.Arrays;

//Assignment Question 9
//Time complexity O(nlogn)  Space Complexity O(1) Auxiliary Space O(1)
public class FromTwoNumberUsingAllArrayEleForMinSum {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 1, 3, 8, 7};
//        First Step Sort the array
        Arrays.sort(arr); //O(nlogn)
//        Second form element using the alternate elements in the array
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                num1 = 10 * num1 + arr[i];
            } else {
                num2 = 10 * num2 + arr[i];
            }
        }

//        Third step sum the two number
        System.out.println("The elements are : " + num1 + " " + num2 + " sum : " + (num1 + num2));
    }

}
