package Practice.BasicSorting;

import java.util.Arrays;

public class AssignCookies {
    //    Leetcode 455
//    Time Complexity O(nlogn) Space Complexity O(1) Auxiliary Space O(1)
    public static void main(String[] args) {
        int[] g = {2, 3, 4, 5};
        int[] s = {1, 2, 2, 3};
        int content = findContentChildren(g, s);
        System.out.println(content);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int content = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                content++;
                i++;
            }
            j++;
        }
        return content;
    }
}
