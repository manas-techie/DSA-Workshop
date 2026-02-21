package Practice.Array_ArrayList;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int value = missingNum(arr);
        System.out.println(value);
    }

//    method -> 1
//    Time Complexity O(n) Space Complexity O(1)
    public static int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        long expectedSum = n * (n + 1) / 2;

        return (int) (expectedSum - actualSum);
    }

//    method -> 2
    public static int missingNum1(int arr[]) {
        // code here
        int n = arr.length+1;
        int xor1 =0, xor2=0;
        //xor of 1 to n number
        for(int i=1; i<=n;i++){
            xor1 ^= i;
        }

        //xor of all array elements
        for(int i=0; i<arr.length;i++){
            xor2 ^= arr[i];
        }

        return xor1^xor2;
    }
}
