package Practice.String;

public class Paliindrome {
    //    leetcode 125
    public static void main(String[] args) {

    }

//    method 1
//    Time complexity O(n) Space complexity O(n) Auxiliary Space O(n)
//    public static boolean isPalindrome(String str) {
//        if(str.trim().isEmpty()) return true;
//
//        str = str.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","");
//
//
//
//        int i=0,j=str.length()-1;
//        while(i<j){
//            if(str.charAt(i)!= str.charAt(j)) return false;
//            i++;
//            j--;
//        }
//
//        return true;
//
//    }


//    Method 2
//    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) j--;

            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) return false;

            i++;
            j--;
        }

        return true;

    }
}
