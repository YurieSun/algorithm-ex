/**
 * Non-recursive implementation of Fibonacci
 */

public class Ex_1_1_33{
    public static void main(String[] args) {
        // Test
        }
    public static double dot(double[] x, double[] y){
    if(x.length != y.length) System.exit(-1);
        double res = 0.0;
        for (int i = 0; i < x.length; i++)
            res += x[i] * y[i];
        return res;
    }

    public static double[][] mult(double[][] a,double[][] b){
        if (a[0].length != b.length) System.exit(-1);
        int M = a.length, N = b[0].length;
        double[][] res = new double[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < b.length; k++)
                res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static double[][] transpose(double[][] a){
        int M = a.length, N = a[0].length;
        double[][] res = new double[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j< M;j++)
                res[i][j] = a[j][i];
        return res;
    }

    public static double[] mult(double[][] a, double[] x){
        if (a[0].length != x.length) System.exit(-1);
        int N = a.length;
        double[] res = new double[N];
        for (int i = 0; i < N; i++)
            res[i] = dot(a[i], x);
        return res;
    }

    public static double[] mult(double[] y,double[][] a){
        if (y.length != a.length) System.exit(-1);
        int N = a[0].length;
        double[] res = new double[N];
        for (int i = 0; i < a[0].length; i++)
            for (int j = 0; j < y.length; j++)
                res[i] += y[j] * a[j][i];
        return res;
    } 
}