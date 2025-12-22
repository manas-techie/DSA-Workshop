package String;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        String s = "manas";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele: ch){
            System.out.print(ele);
        }
    }
}

