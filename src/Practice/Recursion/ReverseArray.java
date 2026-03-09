package Practice.Recursion;

public class ReverseArray {
    public static void reverseArr(int[] arr, int i, int j) {
        if (i >= j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverseArr(arr, i + 1, j - 1);
    }

    public static void reverse(int[] arr, int n) {
        reverseArr(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverse(arr, arr.length);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}

