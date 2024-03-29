/**
 * 用链表实现队列
 */
import java.util.Iterator;

public class LinkedListQueue<Item> implements Iterable<Item>{
    private Node first, last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldlast.next = last;
        N++;
    }
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        N--;
        return item;
    }
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return head == null; //或N == 0;
    }
    public Iterator<Item> iterator(){
        return new ListIterator();
    } 
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove(){ }
    }
}