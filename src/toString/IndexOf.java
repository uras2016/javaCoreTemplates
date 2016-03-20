package toString;

public class IndexOf {
    public static void main(String[] args) {
        // ищем символ/строку в строке
        String b = "i"; // будем указывать как новую точку начала поиска
        String a = ".ua";
        String email = "uras@i.ua";

        int result; // тип int потому, что ищем число

        result = email.indexOf(a); // ищем номер(индекс) символа @ в строке uras@i.ua

        System.out.println(result);

    // пишем то же в одной строке
        System.out.println(email.indexOf("s"));// если такого символа нет, то будет -1

        // добавляем простую проверку
        if (result == -1){
            System.out.println("Invalid email address");
        }else {
            System.out.println("email address is OK");
        }
    // чтобы уточнить начальный индекс для поиска

        int start = email.indexOf(b); // ищем индекс символа 'i'
        int result2 = email.indexOf(a, start); // выводим индекс ".ua", поиск начинаем с 'i'
        System.out.println(start);

        // метод endsWith - исли запрашиваемая строка есть, то выводится true
    Boolean end = email.endsWith(a); // метод выводит true or false. в скобках указываем что ищем
        System.out.println(end);

        // добавим проверку

        if (end == false){
            System.out.println("Invalid email");
        }else {
            System.out.println("Email OK");
        }

    }
}
