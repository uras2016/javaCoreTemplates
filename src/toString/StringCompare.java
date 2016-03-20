package toString;

public class StringCompare {
    public static void main(String[] args) {

        // при сравнении строки переводяться в hexadecimal значения и сравниваються уже числа
        // метод .compareToIgnoreCase не принимает в учет большие буквы

        int result;
        String word1 = "Ape";
        String word2 = "App";

        result = word1.compareTo(word2); // сравниваем строк

        // если word1 будет перед word2, то result будет меньше 0, и ...

        if (result < 0){
            System.out.println("word1 is less than word2");
        }else if (result > 0){
            System.out.println("word1 is more than word2");
        }else if (result == 0){
            System.out.println("the same value");
        }

    }
}
