package toString;

public class EqualsMethod {
    public static void main(String[] args) {

        // метод equals используется только для обьектов, а не для примитивных типов)


        String email1 = "uras@i.ua";
        String email2 = "ras@gmail.com";

        Boolean match = false;

        // сравниваем две строки

        match = email1.equals(email2); // !!! метод .equals возвращает значение true or false

        System.out.println(match);


        if (match == true){
            System.out.println("Email match");
        } else {
            System.out.println("Email don't match");
        }

        // equals для примитивных типов

        int num1 = 12;
        int num2 = 13;
        Boolean intMatch = false;

        Integer num_1 = new Integer(num1); // метод для конвертации прим типа int в обьект типа Integer
        Integer num_2 = new Integer(num2);

        intMatch = num_1.equals(num_2);

        if (intMatch == true){
            System.out.println("Num1 > Num2");
        }else {
            System.out.println("Num2 > Num1");
        }



    }
}
