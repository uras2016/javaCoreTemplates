package workWithText;

import java.util.Arrays;
import java.util.Scanner;

public class SplitExample { // анализируем user input
    public static void main(String[] args) {

        System.out.println("Enter number using comma delimiter:");

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        // заносим введенные сымволы в массив

        String[] splittedStringArray = inputString.split(","); // разделить символы ,

        int[] intArray = new int[splittedStringArray.length]; // преобразуем массив к числам
        // размерность массива равна размеру splittedStringArray.length

        for (int i = 0; i<splittedStringArray.length;i++){
            intArray[i] = Integer.valueOf(splittedStringArray[i]);// производим сравнение
        }
        System.out.println(Arrays.toString(splittedStringArray)
                .replace("[", " ")
                .replace("]", " "));

        // так как данные записались в intArray можем еще так напечатать
        System.out.println("Elements of user input:");

        for (int i: intArray){
            System.out.println(i);
        }

    }
}
