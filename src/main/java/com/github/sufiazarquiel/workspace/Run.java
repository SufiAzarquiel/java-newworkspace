package com.github.sufiazarquiel.workspace;

//import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        /*
         * - Cuatro cifras seguidas de tres letras. 
         * 5647FHY
         * - Una letra seguida de cuatro cifras y después una o dos letras.
         * M9483ZD
         * - Dos letras seguidas de cuatro cifras y después una o dos letras.
         * TO4536AC
         */
        System.out.println(OOP1Homework.checkPlate("5647FHY"));
        System.out.println(OOP1Homework.checkPlate("56474HY"));
        System.out.println(OOP1Homework.checkPlate("564FFHY"));

        System.out.println(OOP1Homework.checkPlate("M9483ZD"));
        System.out.println(OOP1Homework.checkPlate("M9483D"));
        System.out.println(OOP1Homework.checkPlate("M9483ZDD"));
        System.out.println(OOP1Homework.checkPlate("M9483"));
        System.out.println(OOP1Homework.checkPlate("M948Z"));
        System.out.println(OOP1Homework.checkPlate("M948ZD"));
        System.out.println(OOP1Homework.checkPlate("M948ZDD"));
        System.out.println(OOP1Homework.checkPlate("M948"));

        System.out.println(OOP1Homework.checkPlate("TM9483ZD"));
        System.out.println(OOP1Homework.checkPlate("TM9483D"));
        System.out.println(OOP1Homework.checkPlate("TM9483ZDD"));
        System.out.println(OOP1Homework.checkPlate("TM9483"));
        System.out.println(OOP1Homework.checkPlate("TM948Z"));
        System.out.println(OOP1Homework.checkPlate("TM948ZD"));
        System.out.println(OOP1Homework.checkPlate("TM948ZDD"));
        System.out.println(OOP1Homework.checkPlate("TM948"));
        
    }

    public int getValue() {
        return 0;
    }
}
