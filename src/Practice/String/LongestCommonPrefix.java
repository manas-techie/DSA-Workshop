package Practice.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);

    }

//    Leetcode 14
//    Time Complexity O(S*n*m)  S = length of first string, n = number of strings, m = average string length
//    Space Complexity O(S) for substring creation
    public static String longestCommonPrefix(String[] strs) {

        if(strs==null || strs.length==0) return "";

        String firstString = strs[0];

        for(int prefixLen = firstString.length(); prefixLen>=0;prefixLen--){
            String candidatePrefix = firstString.substring(0,prefixLen);

            boolean iscommonPrefix=true;
            for(int i=0;i<strs.length;i++){
                if(!strs[i].startsWith(candidatePrefix)){
                    iscommonPrefix=false;
                    break;
                }
            }

            if(iscommonPrefix){
                return candidatePrefix;
            }
        }

        return "";
    }
}
