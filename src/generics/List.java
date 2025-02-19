package generics;

public class List {
    private int count;
    private Object[] items = new Object[10];
    public void add (Object item){
        items[count++]=item;
    }
    public Object get (int index){
        return items[index];
    }
}
