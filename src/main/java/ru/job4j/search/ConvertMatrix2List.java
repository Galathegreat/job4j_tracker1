package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int length = 0;
        for (int[] row : array) {
            for (int cell : row) {
                result.add(length++, cell);
            }
        }
        return result;
    }
}


