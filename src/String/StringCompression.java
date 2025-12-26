package String;

public class StringCompression {
//    Leetcode 443
    public static void main(String[] args) {
        String s = "aaaaaabbbbccdeeeff";
        char[] arr = s.toCharArray();
        String ans = ""; //StringBulder ans = new StringBulder("");
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == arr[i]) j++;
            else {
                ans += arr[i];   //ans.append(arr[i]);
                int len = j - i;
                if (len > 1) ans += len; //ans.append(len);
                i = j;

            }
        }
//        because loop exit when the j>lengh without counting last element
        ans += arr[i]; //ans.append(arr[i]);
        int len = j-i;
        if(len>1) ans += len; //ans.append(len);

        System.out.println(ans);
    }
}
