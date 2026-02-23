package Practice.BasicMaths;

import java.util.*;

public class DivisorOfNumbers {
    public static void main(String[] args) {
        int[] ans = divisors(36);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }


//    method 1
//    Time Complexity O(n) Space Complexity O(n) Auxiliary Space O(1)
//    public static int[] divisors(int n) {
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                ans.add(i);
//            }
//        }
//        return ans.stream().mapToInt(x -> x).toArray();
//    }

    //    method 2
//    optimized approach
//    Time Complexity O(Sqrt(n))  Space Complxity O(2*sqrt(n)), Auxiliary Space O(1)
    public static int[] divisors(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
                if (i != n / i) {
                    ans.add(n / i);
                }
            }
        }

        Collections.sort(ans);
        return ans.stream().mapToInt(x -> x).toArray();
    }
}

