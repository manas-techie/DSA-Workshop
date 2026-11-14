package String;

public class RemoveAllConjecutiveRun {
    public static String removeConsecutiveRuns(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            // Check if the current character is part of a duplicate group
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                // Skip all characters that match this duplicate character
                char ch = s.charAt(i);
                while (i < n && s.charAt(i) == ch) {
                    i++;
                }
            } else {
                // Single unique character: keep it
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveRuns("aaabbbbc"));
    }
}
