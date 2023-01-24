package recursion;

public class PrintElement {
    public static void printE(int[] arr, int index) {
        if(index < 0 || index >= arr.length) return;

        printE(arr, index + 1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printE(arr, 0);
    }
}
