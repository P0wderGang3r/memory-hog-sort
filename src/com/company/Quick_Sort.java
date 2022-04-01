package com.company;

import java.util.ArrayList;

public class Quick_Sort {
//----------------------------Сортировка------------------------------

    static int middle(ArrayList<List_Type> vec, int left, int right) {
        int pivot = vec.get((left + right) / 2).value;
        int i = left;
        int j = right;
        int buf;
        while (true) {

            while (vec.get(i).value < pivot)
                i = i + 1;
            while (vec.get(j).value > pivot)
                j = j - 1;
            if (i >= j)
                return j;

            buf = vec.get(i).value;
            vec.get(i).value = vec.get(j).value;
            vec.get(j).value = buf;
            i++;
            j--;
        }
    }

    static void vecSort(ArrayList<List_Type> vec, int left, int right) {

        if (left < right) {
            int m = middle(vec, left, right);

            vecSort(vec, left, m);
            vecSort(vec, m + 1, right);
        }
    }

}
