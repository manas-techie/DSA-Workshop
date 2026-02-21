package Practice.Array_ArrayList;

public class RemoveDuplicateElement {
//    Leetcode 26
//    Time Complexity O(n) Space Complexity O(1)
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] == arr[i - 1]) {
                i++;
            } else {
                j++;
                arr[j] = arr[i];
                i++;
            }
        }
        //j is the index of the the last unique element , means there are j+1 unique element
        return j+1;
    }
}
