package com.daleno;

public class L002homeWork {
    public static void main(String[] args) {
        /* --- Exercise number 1_1 --- */
        invertArray();

        /* --- Exercise number 1_2 --- */
        invertArray2();

    }

    /**
     * // Задание № 1_1.
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray(){
            int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println("Задание № 1_1 : ");
            for (int i = 0; i < array.length; i++) {
                switch (array[i]){
                    case 1:
                        array[i] = 0;
                        break;
                    case 0:
                        array[i] =1;
                        break;
                }
                System.out.print(array[i] + " ");
            }
            System.out.println("\n");
        }
    /**
     * // Задание № 1_2.
     * Задать целочисленный массив, состоящий из элементов 3 и 5.
     * Например: [ 3, 3, 5, 5, 5, 3, 5, 3, 5, 5 ].
     * С помощью цикла и условия заменить 3 на 5, 5 на 3;
     */

    public static void invertArray2(){
        int [] array1 = {3, 3, 5, 5, 5, 3, 5, 3, 5, 5};
        System.out.println("Задание № 1_2 : ");
        for (int i = 0; i < array1.length; i++) {
            switch (array1[i]){
                case 3:
                    array1[i] = 5;
                    break;
                case 5:
                    array1[i] = 3;
                    break;
            }
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n");
    }
}
