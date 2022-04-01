package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class List_Operations {
    public static ArrayList<List_Type> generate_list(int length, int bounds) {
        Random random = new Random();
        ArrayList<List_Type> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            list.add(new List_Type(random.nextInt(bounds)));
        }

        return list;
    }

    public static ArrayList<List_Type> alt_generate_list() {
        ArrayList<List_Type> list = new ArrayList<>();

        list.add(new List_Type(37));
        list.add(new List_Type(25));
        list.add(new List_Type(87));
        list.add(new List_Type(45));
        list.add(new List_Type(34));
        list.add(new List_Type(22));
        list.add(new List_Type(25));
        list.add(new List_Type(41));
        list.add(new List_Type(65));
        list.add(new List_Type(74));
        list.add(new List_Type(46));
        list.add(new List_Type(25));

        return list;
    }
}
