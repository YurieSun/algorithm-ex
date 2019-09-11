/**
 * get input and output a table.
 */
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.String;

public class Test{
    public static void main(String[] args) {
        System.out.println("input your data");
        Scanner in = new Scanner(System.in);
        int N = 100;
        int index = 0;
        String[] str = new String[N];
        while(in.hasNext())
            str[index++] = in.nextLine();
        System.out.println();
        for (int i = 0; i < str.length; i++){
            String arr[] = str[i].split("\\s+");
            double temp = Double.parseDouble(arr[1])/Double.parseDouble(arr[2]);
            System.out.printf("%-5s %-3s %-3s %-5.3f", arr[0], arr[1], arr[2], temp);
            System.out.println();
        }
        in.close();
    }
}