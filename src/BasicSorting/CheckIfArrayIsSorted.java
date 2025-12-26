package BasicSorting;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 9, 4, 2};
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n -1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false; //flase -> unsorted
                break;
            }
        }

        if (flag == true) {
            System.out.println("Arr is sorted");
        } else {
            System.out.println("Arr is not sorted");
        }
    }
}
