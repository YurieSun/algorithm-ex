/**
 * Non-recursive implementation of Fibonacci
 */
import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayQueue<Item> implements Comparable{
    private Item[] a;
    private int head, tail;
    private int N;
    public ArrayQueue(){
        a = (Item[])new Object[2];//为什么初始化容量为2的数组？
        head = 0;
        tail = 0;
        N = 0;
    }
    public void enqueue(Item item){
        if (N == a.length)
            resize(2*a.length);
        a[tail++] = item;
        N++;
        if (tail == a.length) 
            tail = 0;
    }
    public Item dequeue(){
        Item item = a[head];
        a[head] = null;
        head++;
        N--;
        if (head == a.length)
            head = 0;
        if (N > 0 && N == a.length/4)
            resize(a.length/2);
        return item;
    }
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return N == 0;
    }
    private void resize(int cap){
        Item[] temp = (Item[])new Object[cap];
        for (int i = 0; i < N; i++)
            temp[i] = a[(head + i) % a.length];
        a = temp;
        head = 0;
        tail = N;
    }
    public Iterator<Item> iterator(){
        return new ArrayIterator();
    }
    private class ArrayIterator implements Iterator<Item>{
        private int i = 0;
        public booelan hasNext(){
            return i > N;
        }
        public Item next(){
            Item item = a[(i + head) % a.length];
            i++;
            return item;
        }
        public void remove(){ }
    }
    public static void main(String[] args) {
        
    }
}