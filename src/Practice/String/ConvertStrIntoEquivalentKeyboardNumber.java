package Practice.String;

public class ConvertStrIntoEquivalentKeyboardNumber {
    public static void main(String[] args) {
        String S = "GFG";
        String output = printSequence(S);
        System.out.println(output);
    }

//    Geekforgeeks
//Time Complexity O(n*k) Space Complexity O(n) Auxiliary Space O(n)
    public static String printSequence(String s) {
        // code here
        String[] str
                = {"2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999"};

        StringBuilder ans = new StringBuilder();

        int n = s.length();

        for (int i = 0; i < n; i++) {  //O(n)
            if (s.charAt(i) == ' ') {
                ans.append("0");
            } else {
                int index = (int) (s.charAt(i) - 'A');
                ans.append(str[index]);  //O(k) where k is the average length of str[index] elements
            }
        }

        return ans.toString();
    }
}
