package array_string;

public class _485_Max_Consecutive_Ones {
    // max = 0
    //
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int num : nums) {
            if(num == 0) {
                if(count > max) {
                    max = count;
                }
                count = 0;
            } else count++;
        }
        if(count > max) max = count;

        return max;
    }
    public static void main(String[] args) {

    }
}
