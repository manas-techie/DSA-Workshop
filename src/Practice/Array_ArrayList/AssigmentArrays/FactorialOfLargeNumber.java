package Practice.Array_ArrayList.AssigmentArrays;

public class FactorialOfLargeNumber {
    //    Time Complexity O(n^2) Space Complexity O(n)
    public static void FactorialOfLargeNumber(int num) {
        int[] result = new int[500];
        result[0] = 1;
        int size = 1;
        for (int i = 2; i <= num; i++) {
            int carry = 0;
            for (int j = 0; j < size; j++) {
                int product = (result[j] * i) + carry;
                result[j] = product % 10;
                carry = product / 10;
            }
            while (carry > 0) {
                result[size] = carry % 10;
                size++;
                carry = carry / 10;
            }

        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        FactorialOfLargeNumber(num);
    }
}
