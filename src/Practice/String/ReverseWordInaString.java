package Practice.String;

public class ReverseWordInaString {
    public static void main(String[] args) {
        String s = "a good   example";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

//    Leetcode  151
//    Method 1
//    Time Complexity O(n) Space Complexity (n) Auxiliary Space O(1)
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");

        StringBuilder ans = new StringBuilder();
        for(int i = words.length -1;i>=0;i--){
            if(words[i]=="") continue;
            ans.append(words[i]);
            ans.append(" ");
        }

        ans.deleteCharAt(ans.length()-1); //extra " "

        return ans.toString();
    }

    //follow up incomplete
    public static String reverseWords2(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int start = 0, end = 0;
        int len = sb.length();
        while (end < len) {
            if (sb.charAt(end) != ' ') {
                end++;
            } else {
                reverseWord(sb, start, end-1);
                start = end + 1;
                while (sb.charAt(start) == ' ') start++;
                end = start;
            }
        }
        reverseWord(sb, start, end-1);
        return sb.toString();
    }

    public static void reverseWord(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
