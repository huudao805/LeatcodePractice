package sorting;

import java.util.Arrays;

public class MyMergeSort {
    public int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i=0 , i1 = 0, i2 =0;
        while(i < n){
            if(i1 < a1.length && i2 < a2.length){
                if(a1[i1] >= a2[i2]) {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                } else {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }
            } else {
                if(i1 < a1.length) {
                    result[i] = a1[i1];
                    i++; i1++;
                } else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }
    public int[] sortArray(int[] nums, int L, int R) {
//        THDB DKD
        if(L > R) return new int[0];
        if(L == R) {
            int[] singleElement = {nums[L]};
            return singleElement;
        }
//        Chia ra
        int k = (L+R)/2;
        int[] a1 = sortArray(nums, L, k);
        int[] a2 = sortArray(nums, k + 1, R);
//        Tron vao

        int[] result = merge(a1,a2);
        return result;
    }

    public int[] sortArray(int[] nums){
        return sortArray(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        MyMergeSort mms = new MyMergeSort();
        int[] a = {};
        int[] b = {2,4,6,8,10};
        int[] c = {9,4,7,2,6,4,5};

        System.out.println(Arrays.toString(mms.sortArray(c)));
    }
}
