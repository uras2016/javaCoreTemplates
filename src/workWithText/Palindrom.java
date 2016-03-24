package workWithText;

public class Palindrom { // строка читаеться одинаково с двух сторон
    public static void main(String[] args) {
        String palindrome = "moomm"; // создаем строку

        // преобразуем эту строку к массиву char
        char charArray[] = palindrome.toCharArray();

        Boolean isPalindrome = true; // будем проверять успешен ли варинат проверки

       /* for (int i = 0; i<charArray.length / 2; i++){

            isPalindrom = isPalindrom &&(charArray[i] == charArray[charArray.length-1-1]);
            if (!isPalindrom){ // если не полидром, то дальше не продолжаем итераци по символам
            break; // выходим из цикла
            }

            или */


        for (int i = 0; i<charArray.length / 2; i++){

            if (charArray[i] != charArray[charArray.length-i-1]){ // если не полидром, то дальше не продолжаем итераци по символам
            isPalindrome = false;
            break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }



    }
}
