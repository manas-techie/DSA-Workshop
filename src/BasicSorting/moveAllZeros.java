package BasicSorting;

public class moveAllZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,3};
        moveZeroes(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
//    Leetcode 283
//    method 1 => using Bubble sort
//    Time Complexity O(n^2) Space Complexity O(1) Auxiliary Space O(1)

//    public static void moveZeroes(int[] arr) {
//        int n = arr.length;
//        int noz = 0;
//        for(int ele : arr){
//            if(ele == 0) noz++;
//        }
//
//        for (int x = 0;x < noz;x++) {
//            for (int i = 0; i < n-1-x; i++) {
//                if (arr[i] == 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//    }

//    Method 2 => optimized approach
//    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static void moveZeroes(int[] arr) {
        int idx=0, n=arr.length;
        for(int i=0;i<n;i++){
//            copy non-elements to the idx position of the array
            if(arr[i]!= 0){
                arr[idx] = arr[i];
                idx++;
            }
        }
//        Fill remaining elements with zeros
        //Arrays.fill(arr,idx,n,0);
        for(int i=idx;i<n;i++){
            arr[i]=0;
        }
    }
}
