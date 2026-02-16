package Practice.String.Assignments;


//Assignment Question 10
public class lexicographicalMaximum {
    public static void main(String[] args) {
        String str = "apple banana cherry date";
        String maxWord = lexicographicalMaximumWord(str);
        System.out.println(maxWord);

    }
//    Time Complexity O(n*m) n=no of words in sentence and m = average size of words, space complexity O(n) Auxiliary Space O(n)
    public static String lexicographicalMaximumWord(String str){
//        Edge case
        if(str==null || str.trim().isEmpty()){
            return "";
        }
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
        }

        String maxWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if(words[i].compareTo(maxWord)>0){
                maxWord = words[i];
            }
        }


        return maxWord;
    }
}
