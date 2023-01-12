package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int m;

        for (int i = 1; i < arr.length; i++) {
            m = i - 1;
            int temp = arr[i];
            while (m >= 0 && temp < arr[m]) {
                arr[m + 1] = arr[m];
                m--;
            }
            arr[m+1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
