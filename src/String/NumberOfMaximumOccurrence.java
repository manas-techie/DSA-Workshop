package String;

public class NumberOfMaximumOccurrence {
    public static char NumberOfOccurrence(String str) {
        int[] frequencyArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (int) ch - 97;
            frequencyArr[idx]++;
        }

        int maxFreq = -1;
        for (int i = 0; i < frequencyArr.length; i++) {
            maxFreq = Math.max(maxFreq, frequencyArr[i]);
        }

        char maxChar = (char) 97;
        for (int i = 0; i < frequencyArr.length; i++) {
            if (frequencyArr[i] == maxFreq)
                maxChar = (char) (i + 97);
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str = "mmmmmmmmmdjfkdjkhfdskjbnnnnnnnnnnnnnnnnnnndsfsdhfsdkhjkfkkdskhjhbnmfmmknvsfnsfnn";
        char result = NumberOfOccurrence(str);
        System.out.println(result);
    }
}
