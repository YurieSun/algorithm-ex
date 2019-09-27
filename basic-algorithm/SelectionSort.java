public class SelectionSort{
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            min = i;
            for (int j = i + 1; j < a.length; j++)
                if (less(a[j], a[j-1]))
                   min = j;
            exch(a, i, min);
        }
    }
}