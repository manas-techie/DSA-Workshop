package Practice.Array_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoShortedArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 7, 9, 9};
        int[] arr2 = {1, 5, 7, 8, 8};

        int[] ans = findUnion(arr1, arr2);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }

//    Union of two shorted array
//    Timne Complexity O((m+n)^2)  Space and Auxiliary Space O(m+n)
//    public static int[] unionArray(int[] arr1, int[] arr2) {
//        List<Integer> union = new ArrayList<>();
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//        int i = 0, j = 0, x = 0;
//
//        while (i < n1 && j < n2) { //O(m+n)
//            if (arr1[i] == arr2[j]) {
//                if (isUnique(union, arr1[i])) {
//                    union.add(x, arr1[i]); //For adding to a speific index in arrayList have traverse O(m+n)
//                    x++;
//                    i++;
//                    j++;
//                } else {
//                    i++;
//                    j++;
//                }
//            } else if (arr1[i] < arr2[j]) {
//                if (isUnique(union, arr1[i])) {
//                    union.add(x, arr1[i]);
//                    x++;
//                    i++;
//                } else {
//                    i++;
//                }
//            } else if (arr1[i] > arr2[j]) {
//                if (isUnique(union, arr2[j])) {
//                    union.add(x, arr2[j]);
//                    x++;
//                    j++;
//                } else {
//                    j++;
//                }
//            }
//        }
//        while (i < n1) {
//            if (isUnique(union, arr1[i])) {
//                union.add(x, arr1[i]);
//                x++;
//                i++;
//            } else {
//                i++;
//            }
//        }
//        while (j < n2) {
//            if (isUnique(union, arr2[j])) {
//                union.add(x, arr2[j]);
//                x++;
//                j++;
//            } else {
//                j++;
//            }
//        }
//
//        return union.stream().mapToInt(element -> element).toArray();
//    }

    public static boolean isUnique(List<Integer> list, int ele) {
        int n = list.size() - 1;
        if (list.isEmpty() || list.get(n) != ele) return true;
        return false;
    }


//    Optimal Approach
//Timne Complexity O((m+n))  Space and Auxiliary Space O(m+n)

    public static int[] findUnion(int[] nums1, int[] nums2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int m = nums1.length, n = nums2.length;

        // Merge using two pointers
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                // Add nums1[i] if not duplicate
                addIfNotDuplicate(union, nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                // Add nums2[j] if not duplicate
                addIfNotDuplicate(union, nums2[j]);
                j++;
            } else {
                // Both elements are equal, add once and advance both pointers
                addIfNotDuplicate(union, nums1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from nums1
        while (i < m) {
            addIfNotDuplicate(union, nums1[i]);
            i++;
        }

        // Add remaining elements from nums2
        while (j < n) {
            addIfNotDuplicate(union, nums2[j]);
            j++;
        }

        // Convert ArrayList to array
        return union.stream().mapToInt(x -> x).toArray();
    }

//       Helper method to add element only if it's not a duplicate

    private static void addIfNotDuplicate(List<Integer> list, int element) {
        if (list.isEmpty() || list.get(list.size() - 1) != element) {
            list.add(element);
        }
    }

}
