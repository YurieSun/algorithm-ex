public class ShellSort{
    public static void sort(Comparable[] a){
        int h = 1;
        while(h < a.length/3)
            h = 3*h + 1;
        while (h >= 1){
            for (int i = h; i < a.length; i++)
            for (int j = i; j > h; j -= h)
                if (less(a[j], a[j-h]))
                    exch(a, j, j-h);
        h = h / 3;
        } 
    }
}