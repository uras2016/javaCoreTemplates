package ifStatements;


public class IfElse {
    public static void main(String[] args) {
        int user = 17;

        if (user <= 18) {// условие для выполнения следющей функции
            System.out.println("User is less then 18");
            // клманда sout будет выполнена, если соблюдаеться условие в круглых скобках
        }
        else { // если услоавие в if не выполняеться, то выполняеться функция в else
            System.out.println("User is older then 18");
        }
    }
}
