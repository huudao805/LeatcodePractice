package sorting;

public class _414_Third_Maximum_Number {
    public int thirdMax(int[] a) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for(int i = 0; i < a.length; i++) {
            insert(maxArr, a[i]);
        }
        if(maxArr[2] == Long.MIN_VALUE) return (int)maxArr[0];
        return (int)maxArr[3];
    }

    private void insert(long[] maxArr, int val) {
        int i = 0;
        while(i < maxArr.length){
            if(val == maxArr[i]){
                // Khong duoc trung
                return;
            }
            else if (val > maxArr[i]) {
                // chen val vao maxArr[i]
                break;
            }
            else // val < maxArr
            {
                i++;
            }
        }

        if(i < maxArr.length) {
            for(int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j+1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public static void main(String[] args) {

    }
}
