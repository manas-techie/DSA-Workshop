package Practice.BasicMaths;

public class Isprime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
        System.out.println(isPrime(17));
        System.out.println(isPrime(12));
    }

//    Time Complexity O(sqrt(n)) Space Complexity O(1)
    public static boolean isPrime(int n) {
        //your code goes here
        if (n <= 1) return false; // 0 and 1 are not primt
        if (n <= 3) return true; // 2 and 3 are prime
        if (n > 2 && n % 2 == 0) return false; //even numbers greater than 2 are not prime

        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
