import java.util.Iterator;

public class ArrayStack<Item> implements Iterable<Item>{
    private Item[] a;
    private int N;
    //法一：用容量固定的数组来实现，封装性不够好
    public FixedStack(int cap){
        //java中不允许有泛型数组，需强制类型转换
        a = (Item[]) new Object[cap];
    }
    public void fixedPush(Item item){
        a[N++] = item;
    }
        //直接返回会造成对象游离，需释放空间以回收内存
    public Item fixedPop(){
        return a[--N];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    //1.3.1中要求添加isFull()方法：判断栈是否满
    public boolean isFull(){
        return N == a.length;
    }
    //1.3.7中要求添加peek()方法：返回最近添加的元素而不弹出
    public Item peek(){
        return a[N-1];
    }

    //法二：容量可变的数组
    public Stack(){
        a = (Item[]) new Object[1];
    }
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < a.length; i++)
            temp[i] = a[i];
        a = temp;
    }
    public void push(Item item){
        if (N == a.length) resize(2*a.length);
        a[N++] = item;
    }
    public Item pop(){
        Item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4)
            resize(a.length / 2);
        return Item;
    }
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){
            return i > 0;
        }
        public Item next(){
            return a[--i];
        }
        public void remove() { }//不希望在迭代过程中涉及元素的改动，因此remove不做任何操作。
    }
}