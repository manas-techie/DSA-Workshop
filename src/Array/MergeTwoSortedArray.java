package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = { 5,11,33,42,71};
        int[] b = {26,54,64,69,81,90};
        int[] c = new int[a.length+b.length];

//        //method -> 1
//        int i = 0, j= 0 ,k=0;
//        while(i < a.length && j < b.length){
//            if(a[i] <= b[j]){
//                c[k] = a[i];
//                i++; k++;
//            } else {
//                c[k] = b[j];
//                j++; k++;
//            }
//        }
//        if(i == a.length){ // now takes elements from b only
//            while(j < b.length){
//                c[k] = b[j];
//                j++; k++;
//            }
//        }
//        if(j == b.length) { // now takes elements from a only
//            while(i < a.length){
//                c[k] = a[i];
//                i++; k++;
//            }
//        }

        //method -> 2
        int i = a.length - 1 , j = b.length - 1 , k = c.length - 1;
        while(i >= 0 && j >= 0){
            if(a[i] >= b[j]){
                c[k] = a[i];
                i--; k--;
            }
            else{
                c[k] = b[j];
                j--; k--;
            }
        }
        if(i <= 0){ //this condition apply when the while loop break because i = -1
            while(j >= 0){
                c[k] = b[j];
                j--;k--;
            }
        }
        if(j <= 0){ //this condition apply when the while loop break because j = -1
            while(i >= 0){
                c[k] = a[i];
                i--;k--;
            }
        }


        for(int ele : c){
            System.out.print(ele + " ");
        }

    }
}
