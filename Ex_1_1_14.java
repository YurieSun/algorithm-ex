/**
 * Get an integers N from input, and calculate the largest integer that is not greater than log 2 N.
 * Todo: print tips when the input is not integer. 
 */
import java.util.Scanner;

public class Ex_1_1_14{
    public static void main(String[] args) {
        System.out.println("input an integer");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.println(log(s));
        in.close();
    }
    public static int log(int m){
        int i = 1, n = 0;
        while(i <= m){
            i *= 2;
            n++;
        }
        return n-1;
    }
}