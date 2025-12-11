package Array;

public class reverseArray {
    public static void main(String[] args) {
        // method -> without using extra array
        int[] arr = {2, 5, 6, 7, 9, 10, 11, 12};
        int n = arr.length;
        int i = 0 , j = n-1-i;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
