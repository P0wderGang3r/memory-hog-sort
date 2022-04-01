package com.company;

import java.util.ArrayList;

public class Bubble_Sort {
    public static ArrayList<List_Type> sort(ArrayList<List_Type> default_list) {
        ArrayList<List_Type> new_list = List_Operations.clone(default_list);

        int buf = 0;
        int j;
        for (int i = 0; i < new_list.size() - 2; i++) {
            j = i;
            while (new_list.get(j).value < new_list.get(j + 1).value) {
                new_list.get(j).value = buf;
                new_list.get(j).value = new_list.get(j + 1).value;
                new_list.get(j + 1).value = buf;
                j++;
            }
        }

        return new_list;
    }
}
