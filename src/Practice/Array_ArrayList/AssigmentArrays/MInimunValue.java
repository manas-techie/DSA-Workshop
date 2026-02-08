package Practice.Array_ArrayList.AssigmentArrays;

public class MInimunValue {
    public static void main(String[] args) {
        int[] arr = {23, 45, 56, 78, 12};
        int n = arr.length;
        int minimum = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < minimum) {
                minimum = ele;
            }
        }
        System.out.println(minimum);
    }
}
