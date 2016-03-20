package toString;

public class UpperAndLowerCase { // toUpperCase and toLowerCase
    public static void main(String[] args) {
        String a = "text to change"; // создаем переменную типа String
        System.out.println(a);

        String result;// создаем переменную для записи результата

        result = a.toUpperCase(); // теперь весь  текст стал большими буквами
        System.out.println(result);

        /* можно также написать сразу
           System.out.println(a.toUpperCase());*/
    }

}
