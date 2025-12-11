package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target Element : ");
        int n = sc.nextInt();
        int[] arr = {3,4,5,6,7,8,7,9,10};

        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==n){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Element found");
        } else{
            System.out.println("Element not found");
        }

    }
}
