/**
 * rank(int key, int[] a): find the number of elements smaller than key.
 * count(int key, int[] a): find the number of elements equal to key.
 */

public class Test{
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 5, 6, 8, 10, 23, 23};
        System.out.println(rank(23, a));
        System.out.println(count(23, a));
    }
    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length-1);
    }
    public static int rank(int key, int[] a,int lo, int hi){
        
        if (lo > hi) return lo;
        int mid = (lo + hi) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else{
            while ((mid - 1) >= 0 && a[mid] == a[mid - 1])
                mid--;
        } return mid;
    }
    public static int count(int key, int[] a){
        int index = rank(key, a);
        if (index == a.length || key != a[index])
            return 0;
        else{
            int cnt = 1;
            while((index < a.length - 1) && key == a[++ index]){
                cnt++;
            }
            return cnt;
        }
    }
}