package BinarySearch;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class KClosestElements {

//    Method 1 using Binary Search - Lowerbound and Two Pointer
//    Time Complexity O(klogk) space complexity O(k)
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }

        if (x >= arr[n - 1]) {
            for (int i = n - k; i < n; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }


        int low = 0, high = arr.length - 1;
        int lb = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                lb = Math.min(lb, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        int j = lb, i = lb - 1;
        while (k > 0 && i >= 0 && j < n) {
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);
            if (di <= dj) {
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }

        while (k > 0 && i < 0) {
            ans.add(arr[j]);
            j++;
            k--;
        }
        while (k > 0 && j == n) {
            ans.add(arr[i]);
            i--;
            k--;
        }

        Collections.sort(ans);
        return ans;

    }

//    Method 2 Binary search and Sliding Window
//    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//        List<Integer>ans=new ArrayList<>();
//        int n=arr.length;
//        int low=0,high=n-k;
//        while(low<high){
//            int mid=(low+high)/2;
//            if(x-arr[mid]>arr[mid+k]-x){
//                low=mid+1;
//            }else{
//                high=mid;
//            }
//        }
//        for(int i=low;i<low+k;i++){
//            ans.add(arr[i]);
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> ans = findClosestElements(arr, 3, 5);
        System.out.println(ans);
    }
}
