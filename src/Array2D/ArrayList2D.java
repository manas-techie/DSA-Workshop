package Array2D;

import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(30);
        a.add(40);
        List<Integer> b = new ArrayList<>();
        b.add(70);
        b.add(80);
        b.add(90);
        List<List<Integer>> v = new ArrayList<>();
        v.add(a);
        v.add(b);

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.get(i).size(); j++) {
                System.out.print(v.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}