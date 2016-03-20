package array;

import java.util.ArrayList; // импортим коллекцию
import java.util.Iterator;

public class ArayList { // используем, когда не знаем сколько будет элементов
    // ArrayList - динамический массив, можно измениять его размер, +- членов массива

    public static void main(String[] args) {


        ArrayList aList = new ArrayList(); // создаем обьект типа ArrayList

        // добавляем элементы (обьекты)

        aList.add("first item"); // тип обьекта String
        aList.add("second item");
        aList.add("third item");
        aList.add(7); // тип обьекта Integer - оболочка

        aList.get(3); // метод, чтобы получить элемент 4


        /* удаление элемента
        aList.remove(2); // или используя значение элемента
        aList.remove("second item"); */


        // чтобы пройтись по всем элементам используем класс Iterator из библиотеки

        Iterator iter = aList.iterator(); // создаем обьект класса Iterator

        while (iter.hasNext()){ // hasNext - метод типа boolean. Значение false будет, когда закончиться массив
            System.out.println(iter.next());
        }

        aList.remove(1); // удаляем второе элемент

        System.out.println("new list :" + aList); // выводим обновленный список

        System.out.println("Postion 1 = " + aList.get(1)); // выводим конкретный элемент


    }
}
