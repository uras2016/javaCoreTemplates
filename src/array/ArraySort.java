package array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] massive = new int[6];// создали массив типа int, колличество позиций 6

        massive[0] = 10; // задаем значение в позицию 0
        massive[1] = 14;
        massive[2] = 36;
        massive[3] = 27;
        massive[4] = 43;
        massive[5] = 18;

        Arrays.sort(massive); // сортируем массив

        // выводим на печать значение каждой позиции массива
        int i;

        for (i = 0; i < massive.length; i++){
            System.out.println("value:" + massive[i]);
        }
    }
}
