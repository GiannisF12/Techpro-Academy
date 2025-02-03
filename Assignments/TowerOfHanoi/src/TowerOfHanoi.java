public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        char rodA = 'A', rodB = 'B', rodC = 'C';
        Move(n,rodA, rodC, rodB);
    }
    public static void Move(int n, char rodA, char rodC, char rodB) {
        if (n == 0) return;
        Move(n - 1, rodA, rodB, rodC);
        System.out.println("Move disk " + n + " from rod " + rodA + " to rod " + rodC);
        Move(n - 1, rodB, rodC, rodA);

    }
}