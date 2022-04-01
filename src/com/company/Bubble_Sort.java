package com.company;

import java.util.ArrayList;

public class Bubble_Sort {
    public static void sort(ArrayList<List_Type> list) {

        int buf;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++)
                if (list.get(j).value > list.get(j + 1).value) {
                    buf = list.get(j).value;
                    list.get(j).value = list.get(j + 1).value;
                    list.get(j + 1).value = buf;
                }
        }

    }
}
