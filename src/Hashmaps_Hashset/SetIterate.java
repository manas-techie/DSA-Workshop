package Hashmaps_Hashset;

import java.util.HashSet;

public class SetIterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);

//        we can't add or remove element in set using loop
        for (Object ele: set){
            System.out.print(ele + " ");
        }

        set.clear();
        System.out.print(set);
    }
}
