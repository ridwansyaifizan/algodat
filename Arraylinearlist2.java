 package arraylinearlist;

public class Arraylinearlist2 extends Arraylinearlist{

    public Arraylinearlist2(int capacity) {
        super(capacity);
    }

    public Arraylinearlist2() {
    }
    
    @Override
    public void trimToSize() {
        if (size < capacity) {
            Object[] newArray = new Object[size];
            System.arraycopy(element, 0, newArray, 0, size);
            element = newArray;
            capacity = size;
        }
    }
    
}

