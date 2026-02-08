package Practice.Array_ArrayList.AssigmentArrays;

public class StrictlyGreaterElement {
    //Time Complexity O(n) space Complexity O(1)
    public static void main(String[] args) {
        int count = 0, x = 4;
        int[] arr = {3, 4, 1, 2, 34, 56, 77};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x)
                count++;
        }
        System.out.println(count);
    }
}
