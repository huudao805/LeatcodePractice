package array_string;

public class _1295_FindNumbers_With_Even_Number_Of_Digits {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int num : nums) {
            if(hasEvenDigits(num)){
                result++;
            }
        }
        return result;
    }
    public boolean hasEvenDigits(int num) {
        int digits = 1;
        while(num >= 10) {
            num /= 10;
            digits++;
        }
        return digits%2 == 0;
    }

    public static void main(String[] args) {
        _1295_FindNumbers_With_Even_Number_Of_Digits a = new _1295_FindNumbers_With_Even_Number_Of_Digits();

    }
}
