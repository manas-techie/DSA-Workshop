package Hashmaps_Hashset;

import java.util.HashMap;

public class MapIterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Manas", 6016);
        map.put("Suman", 1021);
        map.put("Ram", 1022);

//        for each loop
        for (String key : map.keySet()) {
            System.out.print(key + " " + map.get(key));
            System.out.println();
        }

        for (int val : map.values()) {
            System.out.println(val);
        }

        for(Object pair: map.entrySet()){
            System.out.println(pair);
        }

    }
}
