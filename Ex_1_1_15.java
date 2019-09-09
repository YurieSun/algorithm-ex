/**
 * input an array a[] and an integer M, 
 * then output an array res[] that res[i] equals the number of times that i occurs. 
 */
import java.util.Scanner;

public class Ex_1_1_15{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input the length of array:");
        int N = in.nextInt();
        int[] a= new int[N];
        System.out.println("input an array");
        for (int i = 0; i < N; i++){
            a[i] = in.nextInt();
        }
        System.out.println("input an integer");
        int M = in.nextInt();
        int res[] = histogram(a, M);
        in.close();
        for (int i = 0; i < M; i++)
            System.out.print(res[i] + " ");      
    }
    public static int[] histogram(int[] a, int M){
        int[] s = new int[M];
        for (int i = 0; i < a.length; i++){
            if(a[i] < M)
                s[a[i]]++;
        }
        return s;
    }
}