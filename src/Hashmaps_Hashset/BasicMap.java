package Hashmaps_Hashset;

import java.util.HashMap;

public class BasicMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//        insert: O(1)
        map.put("Manas", 6016);
        map.put("Suman", 1021);
        map.put("Ram", 1022);

        System.out.println(map);

//        search: O(1)
        System.out.println(map.containsKey("Manas"));
        System.out.println(map.containsValue(6016));


//        Replace: if i use duplicate key it overwrite my existing value
        map.put("Manas", 1000);
        System.out.println(map);
//        Same value can exist but keys must unique
        map.put("Sam", 1000);
        System.out.println(map);


        System.out.println(map.containsValue(1000));

//        size
        System.out.println(map.size());

//        remove
        map.remove("Manas");
        System.out.println(map);

        map.remove("Manas"); //Not give Error

//        get - gives value
        System.out.println(map.get("Suman"));

    }

}
