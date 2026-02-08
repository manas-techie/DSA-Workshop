package Practice.Array_ArrayList.AssigmentArrays;

public class CheckPalindrome {
    public static boolean checkPalindrome(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if (arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1};
        boolean result = checkPalindrome(arr);
        System.out.println(result);

    }
}
