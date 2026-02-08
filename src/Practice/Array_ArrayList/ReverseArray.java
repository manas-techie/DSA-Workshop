package Practice.Array_ArrayList;

//Time complexity is O(n) and Space Complexity is O(1)
public class ReverseArray {
    public static void arrayEleSwap(int[] arr, int i, int j) { //Normal Swap like C not work in java because unlike c here pointer not exist and the element are pass by value not reference means any changes in swap function will discard after the function end.
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length, i = 0, j = n - 1; 
        while (j > i) {
            arrayEleSwap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {87, 45, 67, 23, 78};
        int[] result = reverseArray(arr);
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
