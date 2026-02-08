package Practice.Array_ArrayList.AssigmentArrays;

import java.util.Arrays;

public class FindTripletesEqualToSum {
    // Brute Force approach Time complexity = O(n^3)
    public static int BruteForceThreeSum(int[] arr, int sum) {
        if (arr.length < 3) return -1;
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (sum == arr[i] + arr[j] + arr[k]) count++;
                }
            }

        }
        return count;
    }

    //Optimized approach Time Complexity O(n^2)
    public static int ThreeSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            // In case of duplicated always skip the second occurrence of the number not the first
            if (i > 0 && arr[i] == arr[i - 1]) continue; //Skip the duplicates
            int temp = sum - arr[i];
            int j = i + 1, k = arr.length - 1;
            while (j < k) {
                if (temp == arr[j] + arr[k]) {
                    count++;
                    // Move pointers first, THEN skip duplicates
                    // This ensures we don't get stuck on the current values
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1]) j++;//Skips next Duplicates
                    while (k > j && arr[k] == arr[k + 1]) k--;//Skips next Duplicates


                } else if (temp > arr[j] + arr[k])
                    j++;
                else if (temp < arr[j] + arr[k])
                    k--;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int count = BruteForceThreeSum(arr, 9);
        System.out.println(count);
        int result = ThreeSum(arr, 9);
        System.out.println(result);
    }
}
