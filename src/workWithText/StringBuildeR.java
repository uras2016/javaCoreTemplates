package workWithText;

public class StringBuildeR {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int startOFSubstr = 3;
        int endOfSubstr = 5;
        int indeOffSet = 4;
        int charIndex = 4;

        builder.append("new ending"); // добавляет подстроку в конец
        builder.delete(startOFSubstr, endOfSubstr); // удаляет подстроку между индексами
        builder.insert(indeOffSet, "some substring"); // встав строку, начиная с такой позиции/индекса
        builder.replace(startOFSubstr, endOfSubstr, "replace");// заменяем участок строки между индексами
        builder.setCharAt(charIndex, 'a');// замена одного символа

        // печатаем результат

        String builderString = builder.toString(); // преобразовуем builder к строке

        System.out.println(builderString);
    }
}
