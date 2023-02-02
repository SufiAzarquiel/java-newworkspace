package com.github.sufiazarquiel.workspace;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[][] testArray = { { 7, 3, 3, 0 },
                              { 6, 8, 5, 4 },
                              { 4, 9, 1, 7 },
                              { 4, 5, 2, 4 } };
        int[][] flipped = OOP1Homework.flipDiag(testArray);
        for (int[] row : flipped) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int getValue() {
        return 0;
    }
}
