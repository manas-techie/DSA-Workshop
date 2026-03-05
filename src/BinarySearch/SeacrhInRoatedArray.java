package BinarySearch;

public class SeacrhInRoatedArray {

//    Leetcode 33
    //Method 1
//    Time Complexity O(logn) Space Complexity O(1)
    public static int search(int[] arr, int target) {
        int n = arr.length;

        //if arr length is less or equal than 2
        if(n <= 2){
            for(int i =0;i<n;i++){
                if(arr[i]==target) return i;
            }
            return -1;
        }

        int low = 1, high = n-2;
        int p = -1;
        while(low<=high){
            int m = low + (high- low)/2;
            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]) {
                p = m;
                break;
            }
            else if(arr[m]<arr[m-1]&&arr[m]<arr[m+1]){
                p = m-1;
                break;
            }
            else if(arr[m]>arr[m-1]&&arr[m]<arr[m+1]){
                if(arr[m]>arr[n-1]) low = m + 1;
                else if(arr[m]<arr[n-1]) high = m - 1;
            }
        }

        if(p == -1){
            //The array is not rotated
            return BinarySearch(arr,0,n-1,target);

        }
        int left = BinarySearch(arr,0,p,target);
        if(left != -1) return left;

        int right = BinarySearch(arr,p+1,n-1,target);
        return right;
    }
    public static int BinarySearch(int[] arr, int low, int high, int target){
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }


//    Method 2
//    public static int search(int[] arr, int target) {
//        int n = arr.length;
//        int low = 0, high = n-1;
//        while(low<=high){
//            int mid = low + (high-low)/2;
//            if(target==arr[mid]) return mid;
//            else if(arr[mid]<=arr[high]){//Mid to high everything is sorted
//                if(target<=arr[high] && target>arr[mid]){
//                    low = mid+1; //Element is in the right side of the pivoted index
//                }
//                else{
//                    high = mid - 1; //Element is in the left side of the pivoted index
//                }
//            }
//            else{  //low to mid Everything is sorted
//                if(target>=arr[low] && target<arr[mid]){
//                    high = mid - 1; //Element is in the left side of the pivoted index
//                }
//                else{
//                    low = mid + 1; // Element is in the right side of the pivoted index
//                }
//
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int IDX = search(arr, 1);
        System.out.println(IDX);
    }

}
