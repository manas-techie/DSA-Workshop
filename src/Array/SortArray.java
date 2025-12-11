package Array;

public class SortArray {
    public static void main(String[] args) {
          //method -> using two pass solution
//        int[] arr = {1,1,0,0,1,0,1,0,1,0,1};
//        int noOfZeros = 0 ,noOfOnes = 0;
//        for(int ele : arr){
//            if(ele == 0){
//                noOfZeros++;
//            }
//            if(ele == 1){
//                noOfOnes++;
//            }
//        }
//        for(int i = 0 ;i < arr.length ; i++){
//            if(i < noOfZeros){
//                arr[i] =  0;
//            }else{
//                arr[i] = 1;
//            }
//        }
//
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();




//        method -> using single pass solution
        int[] arr = {1,1,0,0,1,0,1,0,1,0,1};
        int i = 0 , j = arr.length-1;
        while(i < j){
            if(arr[i]==0) i++;
            else if (arr[j] == 1) j--;
            else{
                if(arr[i] == 1 && arr[j] == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
