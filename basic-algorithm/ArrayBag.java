/**
 * 用数组实现背包
 */
import java.util.Iterator;

public class ArrayBag<Item> implements Iterable{
    private int N = 0;
    private Item[] a = (Item[])new Object[1];
    public void add(Item item){
        if (N == a.length)
            resize(2*a.length);
        a[N++] = item;
    }
    private resize(int cap){
        Item[] temp = (Item[])new Object[cap];
        for (int i = 0; i < a.length; i++)
            temp[i] = a[i];
        a = temp;
    }
    public Iterator<Item> iterator(){
        return new BagIterator();
    }
    private class BagIterator implements Iterator<Item>{
        private int i = 0;
        public boolean hasNext(){
            return i > N;
        }
        public Item next(){
            return a[i++];
        }
        public void remove(){ }
    }
}