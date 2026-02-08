package Array2D;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> Arr = generate(5);
        for (int i = 0; i < Arr.size(); i++) {
            System.out.println(Arr.get(i));
        }
    }

    //    Time Complexity O(n^2) Space complexity O(n^2) Auxiliary Space O(1)
//    Leetcode 118 Easy

//    public static List<List<Integer>> generate(int n) {
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            List<Integer> l = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                l.add(1);
//            }
//            ans.add(l);
//        }
//        for (int i = 2; i < n; i++) {
//            for (int j = 1; j <= i - 1; j++) {
//                ans.get(i).set(j, ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
//            }
//        }
//        return ans;
//    }

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    l.add(1);
                else {
                    l.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
            }
            ans.add(l);
        }
        return ans;
    }
}

//Pascal's Triangle

//       j 0 1 2 3 4
//    i 0 [1]
//      1 [1,1]
//      2 [1,2,1]
//      3 [1,3,3,1]
//      4 [1,4,6,4,1]

//if j == 0 then l[0][j] = 1
//and if j == i then l[i][j] = 1

//l[2][1] = l[1][0] + l[1][1]  2 = 1 + 1
//l[3][1] = l[2][0] + l[2][1]  3 = 1 + 2
//l[3][2] = l[2][1] + l[2][2]  3 = 2 + 1

//l[i][j] = l[i-1][j-1] + l[i-1][j]
