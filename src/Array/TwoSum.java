package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 7, 8, 9};
        int targetSum = 7;
        boolean flag= false;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == targetSum){
                    System.out.println(arr[i] +" + "+ arr[j]+" = "+targetSum);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }

    }
}
