package Practice.BasicMaths;

public class ReverseInteger {
    public static void main(String[] args) {

    }

//    method 1
//    Leetcode 7
    //    Time Complexity O(log(base 10)x) , Space Complexity O(1), Auxiliary Space O(1)

//    public static int reverse(int x) {
//        double LL = Math.pow(2, 31);
//        double HL = Math.pow(2, 31);
//
//        double reverseNum = 0;
//
//        while (x != 0) {
//            int digit = x % 10;
//            reverseNum = reverseNum * 10 + digit;
//            x /= 10;
//        }
//
//        if (reverseNum < LL * -1 || reverseNum > HL - 1) {
//            return 0;
//        }
//
//        return (int) reverseNum;
//    }


//    method - 2
public static int reverse(int x) {
    int revNum = 0;
    while(x != 0){
        int digit = x % 10;

        if(revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE/10){
            return 0;
        }

        revNum = revNum * 10 + digit;

        x /= 10;
    }

    return revNum;
}
}
