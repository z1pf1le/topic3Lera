package kosti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MoveElementToFirst {


    public static ArrayList<String> moveElementToFirst(ArrayList<String> list, String target) {
        if (list == null | list.isEmpty()) {
            return list;
        }

        if (list.contains(target)) {
            list.remove(target);
            list.add(0, target);
        }

        return list;
    }
}

