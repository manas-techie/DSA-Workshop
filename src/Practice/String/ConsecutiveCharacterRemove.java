package Practice.String;

public class ConsecutiveCharacterRemove {
    public static void main(String[] args) {
        String str = "aaabbbcddd";
        String ans = removeConsecutiveCharacter(str);
    }

//    Geeksforgeek
//    Time Complexity O(n) Space Complexity O(n)
    public static String removeConsecutiveCharacter(String str) {
        // code here
        if(str==null||str.length()==0) return str;

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        int i=1;
        int n=str.length();
        while(i<n){
            if(str.charAt(i)!=str.charAt(i-1)){
                sb.append(str.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}
