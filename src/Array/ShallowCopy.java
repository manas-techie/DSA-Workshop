package Array;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,7,9,10};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        
        int[] num = arr;// shallow copy // num and arr are the same array
        num[0] = 50;
        System.out.println(arr[0]);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        //deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 100;
        for(int ele : brr){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
