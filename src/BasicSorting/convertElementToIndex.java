package BasicSorting;

public class convertElementToIndex {
    public static void main(String[] args) {
        int[] arr = {54, 11, 28, 47, 91, 63};
        int n = arr.length;
        int x = 0;
//        use Selection sort for finding the minimum element
        for (int i = 0; i < n; i++) {
            int minEle = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < minEle && arr[j] > 0) {
                    minEle = arr[j];
                    minIdx = j;
                }
            }
//            Concept of negative Indexing
            arr[minIdx] = x;
            x--;
        }

//        multiply with -1 for get the positive indexes
        for (int i = 0; i < n; i++) {
            arr[i] *= -1;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
