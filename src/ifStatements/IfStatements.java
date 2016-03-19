package ifStatements;


public class IfStatements {
    public static void main(String[] args) {
        int user = 35;

        if (user <= 18) {// условие для выполнения следющей функции
            System.out.println("User is less then 18");
            // клманда sout будет выполнена, если соблюдаеться условие в круглых скобках
        }
        if (user > 18) {
            System.out.println("User is older then 18");
        }
    }
}