package Practice.Array_ArrayList.AssigmentArrays;

public class FirstNonRepeatingElement {
    //Time Complexity O(n^2) and Space Complxity O(1)
//    This not Optimized approach its brute force approach
//    optimized approach needs hashmap
    public static int FirstNonRepeatingElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) count++;
            }
            if (count == 0) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int result = FirstNonRepeatingElement(arr);
        System.out.println(result);
    }
}
