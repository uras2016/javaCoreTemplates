package ifStatements;


public class NestedIf_IFIF {
    public static void main(String[] args) {
        int user = 15;

        if (user < 19) {               // условие для выполнения следющей функции
            if (user >16 && user <19){ // дополительное условие
                System.out.println("User is older then 16 but less then 19");
            }
          System.out.println("User is older then 19");
            // если выполн. первое условие, то выводиться второй текст
            // если при этом выполняеться доп. условие, то песатается и первый текст
        }
    }
}

