/**
 * Get three integers from input, and judge if all of them are equal.
 * Todo: print tips when not all inputs are integers. 
 */
import java.util.Scanner;
import com.sun.org.apache.xpath.internal.operations.String;

public class ex_1_1_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("input three numbers");
        for (int i = 0; i < 3; i++)
            arr[i] = in.nextInt();
        if (arr[0] == arr[1] && arr[1] == arr[2])
            System.out.println("equal");
        else
            System.out.println("not equal");
        in.close();       
    }
}