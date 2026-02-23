package Practice.BasicMaths;

public class AmstrongNumber {
    public static void main(String[] args) {

    }

//    Time Complexity: O(log10N + 1) where N is the input number. The time complexity is determined by the number of digits in the input integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.

//    Space Complexity: O(1) as only a constant amount of additional memory for the reversed number regardless of size of the input number.
    public static boolean isArmstrong(int n) {
        int realNum = n;
        // int num = n;
        // int digit = 0;
        // while(num != 0){
        //     num /= 10;
        //     digit++;
        // }

        int digit = String.valueOf(n).length();

        int sum =0;
        while(n != 0){
            int index = n % 10;
            sum += Math.pow(index, digit);
            n /= 10;
        }

        return realNum == sum;
    }
}
