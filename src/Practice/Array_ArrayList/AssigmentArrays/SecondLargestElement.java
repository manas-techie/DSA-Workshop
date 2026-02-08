package Practice.Array_ArrayList.AssigmentArrays;

public class SecondLargestElement {
    //    Time complexity O(n) Space comlexity O(1)
    public static int SecondLargest(int[] arr) {
        int Max_Ele = Integer.MIN_VALUE;
        int SecondLarget = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max_Ele) {
                SecondLarget = Max_Ele;
                Max_Ele = arr[i];
            } else if (arr[i] > SecondLarget && arr[i] != Max_Ele) {
                SecondLarget = arr[i];
            }
        }
        return SecondLarget;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 3, 5, 10, 56, 100};
        int result = SecondLargest(arr);
        System.out.println(result);
    }
}
