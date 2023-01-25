package search;

public class MyBinarySearch {
    public static int search(int[] nums, int target) {
        int length = nums.length;
        int iLeft = 0;
        int iRight = length - 1;

        while(iLeft <= iRight) {
            int iMid = (iLeft + iRight)/2;
            if(target == nums[iMid]) return iMid;
            else if (target < nums[iMid]) {
                iRight = iMid - 1;
            } else {
                iLeft = iMid + 1;
            }
        }

        return -1;
    }

    public static int searchRecursion(int[] nums, int target, int iLeft, int iRight) {
        if(iLeft > iRight) return -1;
        int iMid = (iLeft + iRight)/2;
        if(target == nums[iMid]) return iMid;
        else if(target > nums[iMid]) return searchRecursion(nums, target, iMid + 1, iRight);
        else return searchRecursion(nums, target, iLeft, iMid - 1);
    }

    public static int searchRecursion(int[] nums, int target) {
        int n = nums.length;
        return searchRecursion(nums, target, 0, n -1);
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 9, 12, 19, 25, 31, 46, 50, 57, 72};
        System.out.println(searchRecursion(a, 31));
    }
}
