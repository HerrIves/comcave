package test.collections_test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.get(1);
        list.set(1, 1);
        list.remove(1);
        list.clear();

    }
}
