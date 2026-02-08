package Practice.Array_ArrayList.AssigmentArrays;

public class MergeTwoNonDecreasingArrays {
    // Time Complexity O(n+m) space complexity O(n+m)
    public static int[] MergetwoArrays(int[] nums1, int[] nums2, int m, int n) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
            } else if (nums2[j] < nums1[i]) { // also can use else statement
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {2, 4, 5, 6, 7, 8};
        int[] result = MergetwoArrays(nums1, nums2, nums1.length, nums2.length);
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
