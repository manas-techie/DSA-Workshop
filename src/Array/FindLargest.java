package Array;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,7,9,10};
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
