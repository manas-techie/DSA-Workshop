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