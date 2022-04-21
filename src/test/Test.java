package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String...args) {
        ArrayList [] xa  = {new ArrayList<Cat>(), new ArrayList<Cat>()};
        xa[0].clear();
        List<String> list = new ArrayList<>(Arrays.asList(args));
        list.add("1");
        list.add("2");
        list.add("3");
        list.remove(new String("2"));
        System.out.println("list");
    }
}
