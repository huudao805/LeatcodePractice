package recursion;

public class Fibonacy {
    public static int fibonacy(int m){
        if(m == 2 || m == 1) {
            return 1;
        }

        return fibonacy(m - 1) + fibonacy(m - 2);
    }

    static int[] F = new int[1000];
    public static int fibonacy2(int m){
        if(F[m] != 0) return F[m];
        if(m <=2) {
            F[2] = 1;
            F[1] = 1;
            return 1;
        }

        F[m] = fibonacy2(m - 1) + fibonacy2(m - 2);

        return F[m];
    }

    public static void main(String[] args) {
        System.out.println(fibonacy2(4));
    }
}
