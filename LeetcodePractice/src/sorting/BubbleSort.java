package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp;
        boolean isSorted;
        for (int n = 0; n < arr.length - 1; n++) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
            if(isSorted) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 4};
        bubbleSort(arr);
    }
}
