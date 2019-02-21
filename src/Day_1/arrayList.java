package Day_1;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            list.add(i);
        }
        //list.add()
        //list.remove()
        //list.set();
        //list.indexof()
        list.set(0,5);
        list.remove(5);
        System.out.println(list);
        int b=list.indexOf(9);
        System.out.println(b);
    }
}
