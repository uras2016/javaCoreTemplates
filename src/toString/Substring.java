package toString;

public class Substring {
    public static void main(String[] args) {
        String fullName = "Bill Gates";

        String firstNameChars = "";

        firstNameChars = fullName.substring(0, 2);// начать поиск(выборку) с позиции 0 и остановиться,
                                                  //когда набрал 2 позиции!!! см. ниже

        System.out.println(firstNameChars);

        System.out.println(fullName.substring(2)); // в таком варианте выборка будет со
                                                   // второй позиции до конца строки

// но, вторая цифра в скобках означает номер позиции в строке на котором остановить выборку

        String secondNameChars = "";
        secondNameChars = fullName.substring(5, 7);
        // или так secondName = fullName.substring(5, fullName.length() -3);

        System.out.println(secondNameChars);

        // другой вариант определения певых двух букв второго слова

        String secondNameChars2 = "";

        int space = fullName.indexOf(" "); // определяем индекс пробела
        System.out.println(space);

        secondNameChars2 = fullName.substring(space + 1, (space + 1) + 2);
        // выборка начало пробел+1 и закончить на (пробел+1) + 2 позиции
        System.out.println(secondNameChars2);

        String otherFirstChars = fullName.substring(2, space);// выбираем остальные сиволы первого слова
        String otherSecondChars = fullName.substring((space+1)+2); //выбираем с пробел+1+2 по конец строки

        System.out.println(otherFirstChars + " " + otherSecondChars);

        // теперь просто меняем местами

        System.out.println(secondNameChars2 + otherFirstChars + " " + firstNameChars + otherSecondChars);


    }
}
