package array_string;

public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int max = Integer.MAX_VALUE;
        for(int a = 'a'; a <= 'z'; a++){
            int index = s.indexOf(a);
            if(index != -1 && index == s.lastIndexOf(a)){
                max = Math.min(max, index);
            }
        }
        return max == Integer.MAX_VALUE ? -1 : max;
    }

    public static void main(String[] args) {
        _387_First_Unique_Character_in_a_String a = new _387_First_Unique_Character_in_a_String();
        System.out.println(a.firstUniqChar("loveleetcode"));
    }
}
