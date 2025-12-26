package BasicSorting;

public class BubbleSort {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 12};
        int n = arr.length;
//        Bubble sort -1
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        Bubble sort -2
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-1-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

//        More Optimized Bubble sort
        for (int x = 0;x < n;x++) { // n-1 pass
            for (int i = 0; i < n-1-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            boolean flag = checkIfSorted(arr);
            if(flag == true) break;
        }
        printArr(arr);
    }
    public static boolean checkIfSorted(int[] arr){
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n -1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false; //flase -> unsorted
                break;
            }
        }
        return flag;
    }
}
