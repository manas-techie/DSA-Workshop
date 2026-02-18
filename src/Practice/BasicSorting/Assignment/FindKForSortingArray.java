package Practice.BasicSorting.Assignment;

public class FindKForSortingArray {
    public static void main(String[] args) {

    }
    public static int findK(int[] arr){
        int n = arr.length;
        int mink = Integer.MIN_VALUE;
        int maxK = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int b = arr[i+1];
            if(a<b){
                maxK = Math.min(maxK,(a+b)/2);
            } else if (a>b) {
                mink = Math.max(mink,(a+b)/2);
            }
        }

        if(mink<=maxK){
            return mink;
        }

        return -1;
    }
}

