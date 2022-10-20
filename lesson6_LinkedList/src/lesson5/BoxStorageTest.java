package lesson5;

import java.util.ArrayList;
import java.util.List;

public class BoxStorageTest {
    public static void main(String[] args){
        ArrayList<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1));
        list.add(new HeavyBox(10));
        list.add(new HeavyBox(3));
        BoxStorage store = new BoxStorage( list );
        System.out.println(store.getArray());
    }

}
