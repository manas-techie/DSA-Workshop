package Practice.Array_ArrayList;

public class MajorityElement {
    //    Leetcode 169
//    Boyler-Moore Voting Algo
//    Time Complexity = O(n) and Space complexity = O(1)
    public static int majorityElement(int[] nums) {
        int ele = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ele = nums[i];
                count++;
            } else if (ele == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }

    public static void checkMajorityOrnot(int[] arr, int ele) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) count++;
        }

        if (count > arr.length / 2) System.out.println(ele + " is majority element");
        else System.out.println("Majority Element does not exist");
    }

    public static void main(String[] args) {
//        int[] arr = {2,2,1,1,1,2,2};
        int[] arr = {1, 2, 3};
        int result = majorityElement(arr);
        System.out.println(result);
        checkMajorityOrnot(arr, result);
    }
}
