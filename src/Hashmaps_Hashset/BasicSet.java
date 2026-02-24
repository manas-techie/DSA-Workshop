package Hashmaps_Hashset;

import java.util.HashSet;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        insert : O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.println(set);
        System.out.println(set.size());

//        search -> true or false : O(1)
        System.out.println(set.contains(100));
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println(set.contains(50));


//        Remove : O(1)
        set.remove(100);
        System.out.println(set);

        set.remove(100); //no error occur
        System.out.println(set);

//        toArray()
        Object[] arr = set.toArray();
        for(Object ele: arr){
            System.out.print(ele + " ");
        }

//        Add same value is set not add any value and the size is also remain same as the previous
        System.out.println(set);
        System.out.println(set.size());
        set.add(200);
        System.out.println(set);
        System.out.println(set.size());
    }
}
