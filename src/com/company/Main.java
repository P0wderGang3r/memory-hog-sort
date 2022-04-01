package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<List_Type> sorted_list = My_Sort_Declaration.full_cycle(List_Operations.generate_list(15, 10));

        Globals.print_log_final(sorted_list);
    }
}
