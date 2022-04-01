package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<List_Type> default_list = List_Operations.generate_list(20, 10);


        //Моя сортировка
        long startTime = System.nanoTime();
        ArrayList<List_Type> my_sorted_list = My_Sort_Declaration.full_cycle(default_list);
        System.out.println("Memory hog. Time estimated: " + (System.nanoTime() - startTime));
        Globals.print_log_final(my_sorted_list);

        System.out.println();


        //bubble sort
        ArrayList<List_Type> bubble_sorted_list = List_Operations.clone(default_list);

        startTime = System.nanoTime();
        Bubble_Sort.sort(bubble_sorted_list);
        System.out.println("Bubble. Time estimated: " + (System.nanoTime() - startTime));
        Globals.print_log_final(bubble_sorted_list);
        System.out.println();


        //quick_sort
        ArrayList<List_Type> quick_sorted_list = List_Operations.clone(default_list);

        startTime = System.nanoTime();
        Quick_Sort.vecSort(quick_sorted_list, 0, default_list.size() - 1);
        System.out.println("Quick. Time estimated: " + (System.nanoTime() - startTime));
        Globals.print_log_final(quick_sorted_list);
    }
}
