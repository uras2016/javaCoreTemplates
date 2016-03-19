package array;

public class ArrayAndLoop {

    public static void main(String[] args) {

        int[] massive = new int[49]; // массив на 49 позиций
        int i;

        // заполняем массив значениями по порядку от 1 до 49
        for (i = 0; i < massive.length; i++){ // .length - дает колличество позиций массива
            massive[i] = i +1; // записываем значения для каждой позиции

            System.out.println(massive[i]);
        }
    }
}