package BinarySearch;

public class FIndFirstAndLastOccurance {
    public static void main(String[] args) {
        int[] a = {10, 10, 20, 20, 20, 20, 30, 30, 30, 40, 50};
        int target = 20;
        int[] range = searchRange(a, target);
        System.out.println(range[0] +" "+ range[1]);
    }

//    LeetCode 34
//    Method 1
//    Time Complexity O(logn) && Space Complexity O(1)
    public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        int low = 0, high = arr.length - 1;

        boolean flag = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }
            else if (arr[mid] < target) low = mid + 1;
            else if (arr[mid] > target) high = mid - 1;
        }

        if(flag == false) return ans;

        low = 0; high = arr.length - 1;
        int lb = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        ans[0] = lb;

        low = 0; high = arr.length - 1;
        int ub = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ub = Math.min(ub, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        ans[1] = ub - 1;
        return ans;
    }


//    Method 2
//    public int[] searchRange(int[] arr, int target) {
//        int[] ans = new int[2];
//
//        //First Position
//        int fp = -1, low = 0, high = arr.length-1;
//        while(low <= high){
//            int  mid = (low + high)/2;
//            if(arr[mid]==target){
//                if(mid > 0 && arr[mid]== arr[mid-1]){
//                    high = mid -1;
//                }
//                else{
//                    fp = mid;
//                    break;
//                }
//            }
//            else if(arr[mid] < target) low = mid + 1;
//            else if(arr[mid] > target) high = mid -1;
//        }
//        ans[0] = fp;
//
//        //Last Position
//        int lp = -1; low = 0; high = arr.length-1;
//        while(low <= high){
//            int mid = (low + high)/2;
//            if(arr[mid]==target){
//                if(mid < arr.length - 1 && arr[mid]==arr[mid+1]){
//                    low = mid + 1;
//                }
//                else{
//                    lp = mid;
//                    break;
//                }
//            }
//            else if(arr[mid] < target) low = mid + 1;
//            else if(arr[mid] > target) high = mid -1;
//        }
//        ans[1] = lp;
//
//        return ans;
//    }
}
