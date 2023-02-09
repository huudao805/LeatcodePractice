package array_string;

public class _1221_Split_a_String_in_Balanced_Strings {
    //        Input: s = "RLRRRLLRLL"
//        if num of Rs equal Ls => count++;
//        RL => isPair = true => count ++
//        RR => isPair = false
//        RRRL => isPair = false
//        RRRLLR => isPair = false
//        RRRLLRLL => isPair = true => count++

    //        Input: s = "RLRRLLRLRL"
//        RL => isPair = true => count++
//        RR => isPair = false
//        RRLL => isPair = true => count++
//        RL => isPair = true => count++
//        RL => isPair = true => count++

    public int balancedStringSplit(String s) {
       int countResult = 0;
       char[] arr = s.toCharArray();
       int countR = 0;
       int countL = 0;

       for(int i =0; i < arr.length; i++) {
           if(arr[i] == 'L') {
               countL++;
           } else {
               countR++;
           }
           if(countL == countR) {
               countResult++;
           }
       }
       return  countResult;
    }

    public static void main(String[] args) {
        _1221_Split_a_String_in_Balanced_Strings a = new _1221_Split_a_String_in_Balanced_Strings();
        System.out.println( a.balancedStringSplit("RLRRLLRLRL"));
    }
}
