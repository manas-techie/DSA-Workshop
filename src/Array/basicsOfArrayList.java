package Array;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(6);
//        Adding Elements
        arr.add(0, 10);
        arr.add(1, 50);
        arr.add(2, 70);
        arr.add(3, 50);
        arr.add(4, 30);
        arr.add(5, 90);

//        Updating Elements
        arr.set(2, 14); // Index: 2 and Element: 14

//        Removing Element
        arr.remove(2);

//        Check if element exist
        boolean contain10 = arr.contains(10);

//        Getting the size
        int size = arr.size();


//         check if the arraylist is empty
        boolean inEmpty = arr.isEmpty();


        System.out.println(arr);


//        for-each loop
        for (Integer item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
        arr.add(140); // push back
        System.out.println(arr.size());
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);

//        Clearing the ArrayList
        arr.clear();

    }
}
