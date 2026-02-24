package Hashmaps_Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountNoOfDistinctIntegerAfterReverse {
    public static void main(String[] args) {
        int[] arr = {1,13,10,12,31};
        int n = countDistinctIntegers(arr);
        System.out.println(n);
    }


//    Optimized Approach using Hashset
    // Time Complexity should be = O(n*k) where n = no of element in array and k = O(log(base10)(maxValue)) is no of digit in elements , but k is <= 6 not depend  on n , that's why time complexity O(n)
    // Space Complexity O(n) Auxiliary Space O(n)
    public static int countDistinctIntegers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length; i++){
            set.add(arr[i]); //O(1)
            set.add(reverse(arr[i]));
        }
        return set.size(); //O(1)
    }
    public static int reverse(int num){
        int reverse = 0;
        while(num != 0){  //O(k)
            int digit = num % 10;
            reverse  = reverse * 10  + digit;
            num /= 10;
        }

        return reverse;
    }

//    Brute force approch
//    Time complexity O(n^2) , Space Complexity O(n) Auxiliary space O(n)
    public int countDistinctIntegersBrute(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){ //O(n)
            if(!list.contains(arr[i])){ //O(n)
                list.add(arr[i]);
                count++;
            }
            if(!list.contains(reverse(arr[i]))){ //O(n)
                list.add(reverse(arr[i]));
                count++;
            }
        }

        return count;
    }
}
