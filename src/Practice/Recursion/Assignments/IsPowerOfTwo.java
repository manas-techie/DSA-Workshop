package Practice.Recursion.Assignments;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPower(8));
    }
//    Assignment question 3
//    Time and Space Complexity O(logn)
    public static boolean isPower(int n){
        if (n <= 0) return false;

//        base case
        if(n==1) return true;

//        if n is odd
        if(n % 2 != 0) return false;

        return isPower(n/2);
    }
}
