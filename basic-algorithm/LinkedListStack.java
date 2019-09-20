import java.util.Iterator;

public class ListStack<Item> implements Iterable<Item>{
    private Node first;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.next = oldfirst;
        first.item = item;
        N++;
    }
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    public boolean isEmpty(){
        return N == 0; //或first == null;
    }
    public int size(){
        return N;
    }
    public Iterator<Item> iterator(){
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    //1.3.7中要求添加peek()方法：返回最近添加的元素而不弹出
    public Item peek(){
        return first.item;
    }
}