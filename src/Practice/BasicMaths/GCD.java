package Practice.BasicMaths;

public class GCD {
    public static void main(String[] args) {

    }

//    method 1
//    Time Complexity O(min(n1,n2)) , Space Complexity O(1)
//    public static int GCD(int n1, int n2) {
//        int GCD = 1;
//
//        for(int i=Math.min(n1,n2) ; i>0; i--){
//            if(n1 % i == 0 && n2 % i == 0){
//                GCD = i;
//                break;
//            }
//        }
//
//        return GCD;
//    }


//    method -> 2
//    Euclidean Algorithm
    public static int GCD(int n1, int n2) {
        int GCD = 1;

        while (n1 > 0 && n2 > 0) {

            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }

        if (n1 == 0) {
            GCD = n2;
        }

        if (n2 == 0) {
            GCD = n1;
        }
        return GCD;
    }
}
