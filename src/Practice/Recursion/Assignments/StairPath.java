package Practice.Recursion.Assignments;

public class StairPath {
    public static void main(String[] args) {
        System.out.println(noOfWays(5));
    }


//    Assignment Question 2
    //    1,2,3 steps are allowed
//    Time Complexity O(3^n) Space Complexity O(n)
    public static int noOfWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        return noOfWays(n - 1) + noOfWays(n - 2) + noOfWays(n - 3);
    }
}
