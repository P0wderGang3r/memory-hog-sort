package com.company;

import java.util.ArrayList;

public class Globals {
    public static int show_process = 2;

    public static void print_log_in_process(ArrayList<ArrayList<List_Type>> list_of_lists) {
        if (Globals.show_process > 1) {
            System.out.println("______New iteration_____");
            for (ArrayList<List_Type> inner_list : list_of_lists) {
                System.out.println("vvvvv");
                for (List_Type list_entry : inner_list) {
                    System.out.println(list_entry.value);
                }
                System.out.println("^^^^^");
            }
        }
    }

    public static void print_log_final(ArrayList<List_Type> list) {
        if (Globals.show_process > 0) {
            for (List_Type list_entry : list) {
                System.out.println(list_entry.value);
            }
        }
    }
}
