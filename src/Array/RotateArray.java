package Array;

public class RotateArray {
    public static void main(String[] args) {
//        method -> using extra Array





        // method -> without using extra array
        int[] arr = {2,3,4,5,6,7,7,9};
        rotate(arr,4);
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
    static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[], int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }

}
