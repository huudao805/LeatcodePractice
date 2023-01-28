package sorting;

import java.util.Arrays;

public class MyQuickSort {
    public static void quickSort(int[] a, int L, int R) {
        if(L >= R) return;
        // Chon khoa
        int key = a[(L+R)/2];
        // Phan bo mang theo khoa   
        int k = partition(a, L, R, key);
        // Chia doi mang => Lap lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }

    public static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while(iL <= iR) {
            while(a[iL] < key) iL++;
            while(a[iR] > key) iR--;
            // doi cho 2 phan tu sai vi tri
            while(iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = {6,7,8,5,4,1,2,3};
        int[] b = {6,1,7,1};
        quickSort(b, 0, b.length - 1);
        System.out.println(Arrays.toString(b));
    }


}
