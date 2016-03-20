package toString;

import java.util.Scanner;

public class SubstringAndUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First Name and Surname:");

        String fullName = scanner.nextLine();

        String firstNameChars = fullName.substring(0, 2);// начать поиск(выборку) с позиции 0 и остановиться,
                                                         //когда набрал 2 позиции!!! см. ниже
// но, вторая цифра в скобках означает номер позиции в строке на котором остановить выборку

        System.out.println(firstNameChars);


        int space = fullName.indexOf(" "); // определяем индекс пробела
        System.out.println(space);

        String secondNameChars2 = fullName.substring(space + 1, (space + 1) + 2);
        // выборка начало пробел+1 и закончить на (пробел+1) + 2 позиции
        System.out.println(secondNameChars2);

        String otherFirstChars = fullName.substring(2, space);// выбираем остальные сиволы первого слова
        String otherSecondChars = fullName.substring((space+1)+2); //выбираем с пробел+1+2 по конец строки

        System.out.println(otherFirstChars + " " + otherSecondChars);

        // теперь просто меняем местами

        System.out.println(secondNameChars2 + otherFirstChars + " " + firstNameChars + otherSecondChars);


    }



    }

