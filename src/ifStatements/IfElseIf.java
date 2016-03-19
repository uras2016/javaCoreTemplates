package ifStatements;

public class IfElseIf {

    public static void main(String[] args) {
        int user = 35;

        if (user <= 18) {// условие для выполнения следющей функции
            System.out.println("User is less then 18");
            // клманда sout будет выполнена, если соблюдаеться условие в круглых скобках
        } else if (user > 18 && user <40) {  // если user от 18 до 40
            System.out.println("User is older then 18 but less then 40");
        } else if (user >= 40) {
            System.out.println("User is older then 40");
        }
    }
}