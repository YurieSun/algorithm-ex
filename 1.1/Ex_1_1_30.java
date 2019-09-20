/**
 * Print a boolean array: if i and j are mutually prime, a[i][i] is true.
 */

public class Test{
    public static void main(String[] args) {
        int N = 5;
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = isCoprime(i, j);
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++)
                System.out.printf("%8s", a[i][j]);
            System.out.println();
        }
    }
    public static boolean isCoprime(int i, int j){
        while(j != 0){
            int r = i % j;
            i = j;
            j = r;
        }
        return i == 1;
    }
}