package recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if(n == 1) {
            System.out.println("\n Move disk 1 from rod " + from_rod + " to rod " + to_rod);
//            System.out.printf("\n Move disk 1 from rod %c to rod %c", n, from_rod, to_rod);
            return;
        }

        towerOfHanoi(n-1, from_rod, to_rod,aux_rod);
        System.out.printf("Move disk %d from rod %c to rod %c", n, from_rod, to_rod);
        towerOfHanoi(n-1, to_rod, aux_rod, from_rod);
    }
    public static void main(String[] args) {
        towerOfHanoi(4, 'A', 'B', 'C');
    }
}
