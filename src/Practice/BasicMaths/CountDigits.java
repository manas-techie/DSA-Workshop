package Practice.BasicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(countDigit(n));
    }

    //    Time Complexity O(log(base 10)x) , Space Complexity O(1), Auxiliary Space O(1)
    public static int countDigit(int n) {
        int count = 0;
        int quotient = n;
        while(quotient > 0){
            quotient /= 10;
            count++;
        }

        return count;
    }
}
