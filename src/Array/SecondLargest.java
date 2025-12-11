package Array;


import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 3, 4};
        Arrays.sort(arr);

        // for each loop
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // method -> 1
//        int mx = Integer.MIN_VALUE;
//        for(int i = 0 ; i < arr.length ; i++){
//            mx = Math.max(mx,arr[i]);
//        }
//        System.out.println(mx);
//        int smx = Integer.MIN_VALUE;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] != mx) {
//                smx = Math.max(smx, arr[i]);
//            }
//        }
//        System.out.println(smx);

        //method-> 2
//        int mx = Integer.MIN_VALUE;
//        int maxIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > mx) {
//                mx = Math.max(mx, arr[i]);
//                maxIndex = i;
//            }
//        }
//        System.out.println(mx);
//        int smx = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != mx && i != maxIndex) {
//                smx = Math.max(smx, arr[i]);
//            }
//        }
//        System.out.println(smx);

//        method-> 3
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstmax) {
                secondmax = firstmax;
                firstmax = arr[i];
            } else if (arr[i] > secondmax && arr[i] != firstmax) {
                secondmax = arr[i];
            }
        }
        System.out.println("The Second Largest Element in the array is :" + secondmax);
    }
}
