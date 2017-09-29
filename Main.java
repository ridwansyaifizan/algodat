package arraylinearlist;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        Arraylinearlist x = new Arraylinearlist1();
        Arraylinearlist y = new Arraylinearlist2();
        x.add(0,"ada");
        x.add(1,"iya");
        x.add(2,"oke");
        x.add(3,"sip");
        x.add(4,"yes");
        for (int i = 0; i < x.size(); i++) {
            System.out.println("index ke "+i+" : "+x.element[i]);
        }
        y.trimToSize();
        x.add(5, "sorry");
    }
}
