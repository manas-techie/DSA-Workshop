package Array;

public class DutchFlagProblem {
    public static void main(String[] args) {
        // method -> double or two pass solution
//        int[] arr = {1,0,2,0,1,0,2,0,2,0,1,2};
//        int noOfZeros = 0, noOfOnes = 0, noOfTwos = 0;
//        for(int ele : arr){
//            if(ele == 0) noOfZeros++;
//            if(ele == 1) noOfOnes++;
//            if(ele == 2) noOfTwos++;
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            if( i < noOfZeros) arr[i] = 0;
//            else if (i >= noOfZeros && i < noOfZeros+noOfOnes) arr[i] = 1;
//            else arr[i] = 2;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();


//        //method -> single pass method or 3 pointer approach or Dutch flag algorithm
//
//        int[] arr = {1, 0, 2, 0, 1, 0, 2, 0, 2, 0, 1, 2};
//        int n = arr.length;
//        int low = 0, mid = 0, high = n - 1;
//
//        while (mid <= high) {
//            if (arr[mid] == 0) {
//                swap(arr, mid, low);
//                low++;
//                mid++;
//            } else if (arr[mid] == 1) {
//                mid++;
//            } else {
//                swap(arr, mid, high);
//                high--;
//            }
//        }
//
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    Method -> 3 Same as Dutch flag method
        int[] list = {0, 1, 1, 0, 2, 1, 0, 1};
        int low = 0, high = list.length - 1;
        int i = 0;

        while (i <= high) {
            if (list[i] == 0) {
//                if i index element = 0 swap it with low index element
                int temp = list[i];
                list[i] = list[low];
                list[low] = temp;
                i++;
                low++;
            } else if (list[i] == 2) {
//                if i index element = 2 swap it with high index element
                int temp = list[i];
                list[i] = list[high];
                list[high] = temp;
                high--;
            } else {
                i++;
            }
        }
        for (int item : list) {
            System.out.print(item + " ");
        }
    }
}
