package array;

public class ArrayTypes {
    public static void main(String[] args) {


        int[] massive; // обьявляем массив типа int

        massive = new int[6]; // создаем обьект типпа массив: name = new + data type +[size]
                              // size - сколько позиций в массиве

        // можно в одной строке         int[] massive = new int[6]

        int[] massiveFirst = new int[10]; // создан массив massiveFirst имеет 6 позиций со значением 0 каждая

        massiveFirst[1] = 11; // присваиваем значение 10 на позицицию 1

        int[] massiveSecond = {1,2,3,4,5,6}; // создаем массив типа int и задаем значения в каждую позицию
                    // позиции 0 1 2 3 4 5

        String[] massiveThird = {"Autumn", "Spring", "Summer", "Winter"}; // массив типа String

        boolean[] massiveFourth = new boolean[] {false, true, false, true};// массив типа boolean

        // Выводим значение массива в позиции 2
        System.out.println(massiveThird[2]); //

    }
}