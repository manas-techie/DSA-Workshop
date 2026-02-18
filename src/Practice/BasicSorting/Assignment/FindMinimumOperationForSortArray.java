package Practice.BasicSorting.Assignment;

public class FindMinimumOperationForSortArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 2, 3, 4};
        System.out.println("Operations required: " + minimumOperation(arr));
    }

    //    Assignment Question 14
    //    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static int minimumOperation(int[] arr) {
        int n = arr.length;
//        find the boundary
        int boundary = -1;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                boundary = i; //after ith index all element must be zero
            }
        }

//        The array is already Sorted
        if (boundary == -1) return 0;


//        mark all element in the left of the boundary as zeros using marker
        boolean[] zeroMarker = new boolean[10];
        for (int i = 0; i < boundary; i++) {
            zeroMarker[arr[i]] = true;
        }


//        check if any left sided elements are present in the right side and expand the boundary
        int finalBoundary = boundary;
        for (int i = n - 1; i >= boundary; i--) {
            if (zeroMarker[arr[i]]) {
                finalBoundary = i + 1; //left side finalBoundary th index all elements are zero
            }
        }

//        Count the operation and use the marker for not count one element multiple time
        int count = 0;
        boolean[] uniqueDigitMarker = new boolean[10];
        for (int i = 0; i < finalBoundary; i++) {
            if (!uniqueDigitMarker[arr[i]]) {
                uniqueDigitMarker[arr[i]] = true;
                count++;
            }
        }

        return count;
    }

}
