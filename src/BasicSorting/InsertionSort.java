package BasicSorting;

public class InsertionSort {
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swapArrEle(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //    time complexity = O(n^2) and space complexity = O(1)
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 5, 7, 2};
        int n = arr.length;
        for (int i = 1; i < n; i++) { //n-1 pass
//            using for loop m-1
//            for (int j = i; j >= 1; j--) {
//                if (arr[j] < arr[j - 1])
//                    swapArrEle(arr, j, j - 1);
//                else break; //because the left part of the array is sorted
//            }

//            using for loop m-2
            for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--)
                swapArrEle(arr, j, j-1);


//            using while loop
//            int j = i;
//            while( j >= 1 && arr[j]<arr[j-1]){
//                swapArrEle(arr, j, j-1);
//                j--;
//            }
        }
        printArr(arr);
    }
}
