/**
 * 用链表实现背包
 */
import java.util.Iterator;

public class LinkedListBag<Item> implements Iterable<Item>{
    private Node first;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public void add(Item item){
        oldfirst = first;
        first = new Node();
        Item = first.item;
        first.next = oldfirst;
    }
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return first == null; //或 N == 0
    }
    public Iterator<Item> iterator(){
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public Item Next(){
            Item = current.item;
            current = current.next;
            return Item;
        }
        public void remove(){ }
    }
}