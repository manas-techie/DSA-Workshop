package Practice.Array_ArrayList;

public class MergeTwoArrayWithOutSpace {
    //    Leetcode 88
//    Time Complexity O(n+m) Space Complextiy O(1)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
//    This part is not needed in this type of question
//    while(i>=0){
//        nums1[k] = nums1[i];
//        i--;
//        k--;
//    }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 4, 5};
        int m = 3, n = 3;
        merge(arr1, m, arr2, n);
        for (int ele : arr1) {
            System.out.print(ele + " ");
        }
    }

}

