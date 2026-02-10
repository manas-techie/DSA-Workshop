package Practice.Array_ArrayList;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

//    Leetcode 31
//    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static void nextPermutation(int[] arr) {
        int index=  -1;
        int n=arr.length;
        //Finding the index
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        //If the permutation is the last one
        if(index==-1){
            reverse_array(arr,0,n-1);
        }
        else{
            //swaping the index with the greater element than index but smaller in the series
            for(int i=n-1;i>index;i--){
                if(arr[i]>arr[index]){
                    swap(arr,i,index);
                    break;
                }
            }
            //reverse the remaining elements
            reverse_array(arr,index+1,n-1);
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
    public static void reverse_array(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
