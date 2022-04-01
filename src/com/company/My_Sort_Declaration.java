package com.company;

import java.util.ArrayList;

public class My_Sort_Declaration {

    static ArrayList<List_Type> full_cycle(ArrayList<List_Type> default_list) {
        int min = get_min(default_list);
        int max = get_max(default_list);

        return sort(default_list, min, max);
    }

    static ArrayList<List_Type> half_cycle(ArrayList<List_Type> default_list, int min, int max) {
        return sort(default_list, min, max);
    }

    static int get_max(ArrayList<List_Type> default_list) {
        int curr_max = default_list.get(0).value;

        for (List_Type list_entry: default_list) {
            if (list_entry.value > curr_max)
                curr_max = list_entry.value;
        }

        return curr_max;
    }

    static int get_min(ArrayList<List_Type> default_list) {
        int curr_min = default_list.get(0).value;

        for (List_Type list_entry: default_list) {
            if (list_entry.value < curr_min)
                curr_min = list_entry.value;
        }

        return curr_min;
    }

    static ArrayList<List_Type> sort(ArrayList<List_Type> default_list, int min, int max) {
        ArrayList<ArrayList<List_Type>> list_of_lists = new ArrayList<>();
        ArrayList<List_Type> final_list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            list_of_lists.add(new ArrayList<>());
        }

        for (List_Type list_entry: default_list) {
            list_of_lists.get((int) ((double) (list_entry.value - min) / (double) (max - min) * 10)).add(list_entry);
        }

        //!! Лог действий!!
        Globals.print_log_in_process(list_of_lists);

        int trigger = 0;
        ArrayList<List_Type> pos = new ArrayList<>();
        for (ArrayList<List_Type> inner_list: list_of_lists) {
            if (0 != inner_list.size()) {
                trigger++;
                pos = inner_list;
            }
        }

        if (trigger == 1) {
            final_list.addAll(pos);
        }

        if (trigger != 1) {
            ArrayList<List_Type> buff_list;
            for (ArrayList<List_Type> inner_list : list_of_lists) {
                if (1 < inner_list.size()) {
                    buff_list = full_cycle(inner_list);
                } else {
                    buff_list = inner_list;
                }

                final_list.addAll(buff_list);
            }
        }


        return final_list;
    }
}
