package Practice.Array_ArrayList.AssigmentArrays;

import java.util.Arrays;

public class LargestThreeElement {
    public static void main(String[] args) {
        // Not Optimal is having time complexity O(nlogn)
        int[] arr = {2, 3, 1, 4, 7, 8, 10, 9, 5, 6};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n - 3] + " " + arr[n - 2] + " " + arr[n - 1]);
        LargestThreeEle(arr);
    }

    //Optimal Single Pass Solution With time complexity O(n)
    public static void LargestThreeEle(int[] arr) {
        int n = arr.length;
        int FirstMax = Integer.MIN_VALUE, SecondMax = Integer.MIN_VALUE, ThirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > FirstMax) {
                ThirdMax = SecondMax;
                SecondMax = FirstMax;
                FirstMax = arr[i];
            } else if (arr[i] > SecondMax && arr[i] != FirstMax) {
                ThirdMax = SecondMax;
                SecondMax = arr[i];
            } else if (arr[i] > ThirdMax && arr[i] != SecondMax) {
                ThirdMax = arr[i];
            }
        }
        System.out.println(FirstMax + " " + SecondMax + " " + ThirdMax);
    }
}
