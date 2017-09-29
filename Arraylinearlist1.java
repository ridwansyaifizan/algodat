package arraylinearlist;

import java.util.Arrays;

public class Arraylinearlist1 extends Arraylinearlist{

    public Arraylinearlist1(int initialCapacity) {
        super(initialCapacity);
    }

    public Arraylinearlist1() {
    }
    
    @Override
    public void add(int index, Object theElement){
//         
        for(int i = size - 1; i >= index; i--)
            element[i + 1] = element[i];
        element[index] = theElement;
        size++;
//       
    }
    
}

