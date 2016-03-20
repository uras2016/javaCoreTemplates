package array;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {


        String[] arrayString = new String[5];
        arrayString[0] = "This";
        arrayString[1] = "is";
        arrayString[2] = "a";
        arrayString[3] = "string";
        arrayString[4] = "array";

        // выполнить сортировку и вывести на экран все элементы массива
        Arrays.sort(arrayString);

        int a;
        for (a = 0; a < arrayString.length; a++){
            System.out.println(arrayString[a]);
        }


        // вывести на экран все элементы массива
        int i;

        for (i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }

    }
}