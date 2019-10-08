public class MergeeSort{
    /* 将辅助数组作为类的成员变量，这样可以只用一个aux[]。
       若放在merge()中，则每次归并均需创建新数组，开销很大。
       更好的方法是将aux[]放在public的sort()中。因为在库函数中使用静态数组不妥当（可能有多个程序同时使用这个类）。可见练习2.2.9.
       具体实现方法见博客中的Mergesort。
       */
    private static Comparable[] aux;
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }
    private static void merge(Comparable[] a, int lo, int mid, int hi){
        for (int i = lo; i < hi; i++)
            aux[i] = a[i];
        int i = lo, j = mid + 1;
        for (int k = lo; k < hi; k++){
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[i++];
        } 
    }
    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo) return;
        mid = (lo + hi)/2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
}