package array;



import java.util.Arrays;
import java.util.Collections;

public class ArrayDescendingSort {
    public static void main(String[] args) {

        int[] massive = {10,14,36,27,43,18}; // создаем массив

        // создаем обьект класса (оболочки) Integer
        Integer[] integerArray = new Integer[massive.length];

        // Даем значения позициям в новый массив

        for (int i = 0; i < massive.length; i++){
            integerArray[i] = new Integer(massive[i]);

        // сортируем по убыванию

            Arrays.sort(integerArray, Collections.reverseOrder());

         // печатаем результат
            for (i = 0; i < integerArray.length; i++) {
                System.out.println(integerArray[i]);
            }
        }
    }
}
