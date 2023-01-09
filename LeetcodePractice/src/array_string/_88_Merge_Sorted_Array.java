package array_string;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
//    [1,2,3,0,0,0] 3
//    [2,5,6] 3
//
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++) {
            boolean hh = true;
            // lap qua cac phan tu trong m
            for(int j = 0; j < m; j++) {
                // neu n[i] < m[j]
                // dich m[j] -> m[m] + 1
                if(nums1[j] > nums2[i]){
                    hh = false;
                    for(int k = m - 1; k >= j ; k--) {
                        nums1[k + 1] = nums1[k];
                    }
                    nums1[j] = nums2[i];
                    m++;
                    break;
                }
            }
            // neu num trong numbs2 lon hon numbs1 het thi them vao vi tri m
            if (hh) {
                nums1[m] = nums2[i];
                m++;
            }
        }
    }

    public static void main(String[] args) {
        _88_Merge_Sorted_Array b = new _88_Merge_Sorted_Array();
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        b.merge(arr1, 3, arr2, 3 );
        System.out.println(Arrays.toString(arr1));
    }
}
