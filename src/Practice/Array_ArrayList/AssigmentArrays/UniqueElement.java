package Practice.Array_ArrayList.AssigmentArrays;

import java.util.Arrays;

public class UniqueElement {
    //    Leetcode 136
    //Not optimal time complexity O(nlogn) space complexity O(1)
    public static int FindUniqueEle(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1])
                i += 2;
            else return arr[i];
        }
        return arr[arr.length - 1]; //if the largest element is unique loop will skip it ,thats why this condition
    }

    //Optimal Approach with time complexity O(n)
    public static int FindUniqueWithXOR(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            // xor is commutative order does not matter all the duplicate pairs eventually cencel each other out only unque one remain
            result = result ^ arr[i]; //XOR of same number is zero and XOR of Zero and number x equal to the smae number x
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 5, 2, 5, 4, 6};
        int result = FindUniqueEle(arr);
        System.out.println(result);
        int result2 = FindUniqueWithXOR(arr);
        System.out.println(result2);
    }
}
