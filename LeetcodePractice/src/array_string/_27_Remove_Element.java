package array_string;

import java.util.Arrays;

public class _27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        _27_Remove_Element a = new _27_Remove_Element();
        int[] nums = {3,2,2,3};
        a.removeElement(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
