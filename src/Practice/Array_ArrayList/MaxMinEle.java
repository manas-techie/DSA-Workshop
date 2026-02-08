package Practice.Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class MaxMinEle {
    // Naive Approach
    //Time Complexity is O(nlogn) Space complexity is O(1)
    public static ArrayList<Integer> FindMaxMIN(int[] arr) {
        Arrays.sort(arr); //Arrays.sort is a pivot Quick sort algorithm time complexity O(nlogn)
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        result.add(arr[arr.length - 1]);
        return result;
    }

    //Iterative Approach
    // Time Complexity is O(n) and Space Complexity O(1)
    public static ArrayList<Integer> FindMaxMin2(int[] arr) {
        int Max = arr[0], Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) Max = arr[i];
            if (arr[i] < Min) Min = arr[i];
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0, Min);
        result.add(1, Max);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {23, 5, 1, 56, 99};
        ArrayList<Integer> result = FindMaxMIN(arr);
        ArrayList<Integer> result2 = FindMaxMin2(arr);
        System.out.println(result);
        System.out.println(result2);


    }
}
