package arraylinearlist;
public class Arraylinearlist {
    protected Object [] element;
    protected int size;
    protected int capacity;
    private int index;
//    public ArrayLinearList(int initialCapacity){
//        if(initialCapacity < 1)
//            throw new IllegalArgumentException("initial must be >=1 ");
//        element = new Object [initialCapacity];
//    }
    public Arraylinearlist(int capacity) {
        this.capacity = capacity;
        element = new Object[capacity];

        index = 0;
    }
    public Arraylinearlist(){
        this(10);
    }
    public boolean isEmpty(){
        return size == 0;
    } 
    public int size(){
        return size;
    }
    public void add(int index, Object theElement){
//         
        for(int i = size - 1; i >= index; i--)
            element[i + 1] = element[i];
        element[index] = theElement;
        size++;
    }

    void trimToSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
