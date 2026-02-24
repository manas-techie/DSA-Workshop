package Hashmaps_Hashset;

import java.util.HashSet;

public class FindMaximumNumberOfStringPair {
    public static void main(String[] args) {
        String[] words = {"cd", "ac", "dc", "ca", "dc", "zz"};
        int count = maximumNumberOfStringPairsBrute( words);
        System.out.println(count);
    }

//    Brute Force Approach
//    Time Complexity O(n*n*l) where n is no of element in array and l is average length of word , which is not depend on n so Time Complexity = O(n^2)
//    Space Complexity O(l) , where l is average length of word Auxiliary Space O(l)
    public static int maximumNumberOfStringPairsBrute(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String revEle = reverse(words[i]);
                if (words[j].equals(revEle)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

//    Optimized approach using HashSet
//    Time complexity O(n*l) , Where n is no of elements in array and l is average string length, l is not depend on n and 1<l<5000 so Time Complexity O(n)
//    Space Complexity O(n*l) Auxiliary Space O(n*l)
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            String revWord = reverse(words[i]);
            if(set.contains(revWord)){
                count++;
                //Even though this question say array has distinct element but it the array is contained duplicate elements, then we have to remove the revElement after we find a pair thats way if later any duplicate element appear , its can't find it's pair element
                set.remove(revWord);
            }
            else{
                set.add(words[i]);
            }
        }
        return count;
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

}
