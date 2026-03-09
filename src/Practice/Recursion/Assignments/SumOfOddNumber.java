package Practice.Recursion.Assignments;

public class SumOfOddNumber {
    public static void main(String[] args) {
        int sum = sumOfOddNumber(1, 10);
        System.out.println(sum);
    }

    //    Assignment Question 1
    //    Time and Space Complexity O(b-a)
    public static int sumOfOddNumber(int a, int b) {
        //        base case
        if (a > b) return 0;

        if (a % 2 == 0) {
            //            if a is even make it odd by adding one and return
            return sumOfOddNumber(a + 1, b);
        }
        //        else a is odd than add a to sum and call the function with the next odd number
        return a + sumOfOddNumber(a + 1, b);
    }
}


