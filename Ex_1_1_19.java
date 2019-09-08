/**
 * Non-recursive implementation of Fibonacci
 */
import java.util.Scanner;

public class Ex_1_1_19{
    public static void main(String[] args) {
        System.out.println("input an integer");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i <= N; i++)
            System.out.println(i +" " + F(i));
    }
    public static long F(int N){
        long[] a = new long[N+1];
        if (N == 0) return 0;
        if (N == 1) return 1;
        a[0] =0;
        a[1] =1;
        for (int i = 2; i <= N; i++)
            a[i] = a[i-2] +a[i-1];
        return a[N];
    }
}