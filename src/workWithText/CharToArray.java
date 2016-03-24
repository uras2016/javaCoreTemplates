package workWithText;



import java.util.Arrays;

public class CharToArray {
    public static void main(String[] args) {


    // создаем массив с типом Char, кол символов 256
    char[] charArray = new char[256];

        // инициализируем
        for (int i = 0; i<charArray.length; i++) {
            charArray[i] = (char) i; // присваиваем i элементу значение кода этого элемента
            // приводим значение к типу - (char)
        }
            // печатаем элементы массива
        for (char c: charArray) {
            System.out.println(c);
        }

        // преобразуем этот массив к строке

        final String StringOfChar = Arrays.toString(charArray);

        System.out.println(StringOfChar);
        // может быть исключ ситуация, так как во всем массиве Char есть и непечатные символы

        char[] charArray2 = {'a', 'r', 'r', 'a', 'y'}; // тут четко определаны элементы

        final String stringOfChar2 = Arrays.toString(charArray2);
        System.out.println("Massive: " + stringOfChar2);
    }
}
